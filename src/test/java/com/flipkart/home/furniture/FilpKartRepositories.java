package com.flipkart.home.furniture;

public class FilpKartRepositories {
	
	public static String subtab = null;
	public static String subtab_value = null;
	public static String minprice = null;
	public static String minprice_value = null;
	public static String maxprice = null;
	public static String maxprice_value = null;
	public static String brand = null;
	public static String brand_value = null;
	
	public static String tab_home_furtinature = ".//*[@id='container']/div/header/div/div/ul/li/a/span[text()='Home & Furniture']";
	public static String min_dropdown =".//*[@id='container']/div/div/div/div/div/div/div/div/section/div/div[@class='_1QaKk1']/select[@class='a_eCSK']";
	public static String max_dropdown =".//*[@id='container']/div/div/div/div/div/div/div/div/section/div/div[@class='_3nSxeA']/select[@class='a_eCSK']";
	public static String number_of_products = ".//span[6]";
	
	
	public static void UpdateValues()
	{
		subtab = ".//a/span[text()='"+subtab_value+"']";
		System.out.println(subtab);
		minprice = ".//*[@id='container']/div/div/div/div/div/div/div/div/section/div/div[@class='_1QaKk1']/select[@class='a_eCSK']/option[@value='"+minprice_value+"']";
		System.out.println(minprice);
		maxprice = ".//*[@id='container']/div/div/div/div/div/div/div/div/section/div/div[@class='_3nSxeA']/select[@class='a_eCSK']/option[@value='"+maxprice_value+"']";
		System.out.println(maxprice);
		brand = ".//*[@id='container']/div/div/div/div/div/div/div/div/section/div/div/div/div/div/label/div[text()='"+brand_value+"']/../div[@class='_1p7h2j']";		
		System.out.println(brand);
		
	}

}
