package utilities.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FunctionalLibrary {
	
	public static WebDriver driver = null;
	public static void Openbrowser(String webURL, String titleName) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ssumi_000\\eclipse\\java-neon2\\FirefoxDriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().deleteAllCookies();
		driver.get(webURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title Name is:"+actualTitle);	  
		//Validating that the title of the web page
		Assert.assertTrue(actualTitle.contains(titleName));
	}
	
	
	public static void ClickUsingxpath(String xpath) throws Exception
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath(xpath)).click();
	}

	
	public static String GetTextUsingxpath(String xpath) throws Exception
	{
		Thread.sleep(4000);
		String text_value = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(text_value);
		return text_value;
		
	}
	
	
	public static void Scroll_Page() throws Exception
	{
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(250, 0)"); //x value '250' can be altered

	}
	
	public static void Scroll_Dow() throws Exception
	{
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,50)"); //x value '250' can be altered

	}
	
	public static void waitForElement(String xpath)
	{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}
	

}
