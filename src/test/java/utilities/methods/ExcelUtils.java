package utilities.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static FileInputStream ExcelFile;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;	
	private static XSSFCell Cell;

	public static String GetCellData(File Path, String SheetName, int Rownum, int ColNum) throws Exception
	{
		ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		Cell = ExcelWSheet.getRow(Rownum).getCell(ColNum);
		//Setting the cell type value into String
		Cell.setCellType(1);
		String CellData = Cell.getStringCellValue();
		ExcelWBook.close();
		ExcelFile.close();
		return CellData;		
	}	
	public static void SetCellData(File Path, String SheetName, String Result, int Rownum, int ColNum) throws Exception
	{
		ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);		
		//Retrieve the row and check for null
		XSSFRow sheetrow = ExcelWSheet.getRow(Rownum);
        if(sheetrow == null){
            sheetrow = ExcelWSheet.createRow(Rownum);
        }
        //Update the value of cell
        Cell = sheetrow.getCell(ColNum);
        if(Cell == null){
        	Cell = sheetrow.createCell(ColNum);
        }	        
		Cell.setCellValue(Result);
		FileOutputStream fileOut = new FileOutputStream(Path);
		ExcelWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
	
	public static int GetRowCount(File Path, String SheetName) throws Exception
	{
		ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(SheetName);	
		int totalRows = ExcelWSheet.getPhysicalNumberOfRows();
		return totalRows;
	}

}
