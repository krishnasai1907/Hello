package com.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//this is class is used for config the Excel
public class ReadExcel {
	static XSSFWorkbook wb;
	static File fi;
	public static void ExcelDataConfig() throws Exception
	{				//Here place the Excel file explorer Path
		fi=new File("C:\\Users\\Krishna\\eclipse-workspace\\Hello\\src\\main\\java\\com\\server\\Selenium.xlsx");
		FileInputStream fis=new FileInputStream(fi);
		wb=new XSSFWorkbook(fis);
	}
	public static String getData(int SheetNo,int Row,int Col) throws Exception
	{
		ExcelDataConfig();
		String value=wb.getSheetAt(SheetNo).getRow(Row).getCell(Col).getStringCellValue();
		return value;
	}
	public static void ExcelWriteConfig() throws Exception
	{
		FileOutputStream fout=new FileOutputStream(fi);
		wb.write(fout);
	}
	public static void WriteData(int sheetNo,int Row,int Col,String value) throws Exception
	{
		wb.getSheetAt(sheetNo).getRow(Row).createCell(Col).setCellValue(value);
		ExcelWriteConfig();
		
	}

}
