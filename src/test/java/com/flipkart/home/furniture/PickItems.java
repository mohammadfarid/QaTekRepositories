package com.flipkart.home.furniture;

import java.io.File;

import utilities.methods.ExcelUtils;
import utilities.methods.FunctionalLibrary;

public class PickItems {

	
	public static void pickitemfromflipkart() throws Exception
	{	

		File filePath = new File("C:\\Users\\ssumi_000\\Desktop\\Selenium IDE\\Excels\\FlipKart.xlsx");	
		

		for (int i = 1; i <ExcelUtils.GetRowCount(filePath, "Sheet1"); i++)
		{
			//FunctionalLibrary.ClickUsingxpath(FilpKartRepositories.tab_home_furtinature);
			
			//FilpKartRepositories.subtab_value = ExcelUtils.GetCellData(filePath, "Sheet1", i, 0);			
			FilpKartRepositories.minprice_value = ExcelUtils.GetCellData(filePath, "Sheet1", i, 1);			
			FilpKartRepositories.maxprice_value = ExcelUtils.GetCellData(filePath, "Sheet1", i, 2);			
			FilpKartRepositories.brand_value = ExcelUtils.GetCellData(filePath, "Sheet1", i, 3);			
			FilpKartRepositories.UpdateValues();
			
			FunctionalLibrary.ClickUsingxpath(FilpKartRepositories.subtab);
			FunctionalLibrary.ClickUsingxpath(FilpKartRepositories.brand);
			FunctionalLibrary.ClickUsingxpath(FilpKartRepositories.minprice);
			Thread.sleep(3000);
			FunctionalLibrary.ClickUsingxpath(FilpKartRepositories.maxprice);
			Thread.sleep(3000);
			
			String Result = FunctionalLibrary.GetTextUsingxpath(FilpKartRepositories.number_of_products);
			ExcelUtils.SetCellData(filePath, "Sheet1", Result, i, 4);
			

		}



	}


}
