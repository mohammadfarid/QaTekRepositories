package execute.methods;

import org.testng.annotations.Test;

import com.flipkart.home.furniture.PickItems;

import utilities.methods.FunctionalLibrary;

public class ExecuteApplications {
  @Test
 public void executeapp() throws Exception {
	  
	  FunctionalLibrary.Openbrowser("https://www.flipkart.com/", "Flipkart");
	  PickItems.pickitemfromflipkart();
  }
}
