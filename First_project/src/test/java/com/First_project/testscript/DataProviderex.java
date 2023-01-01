package com.First_project.testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderex {
@DataProvider
public String [][] getExceldata() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\sai\\git\\repository9\\First_project\\src\\test\\resources\\logindetails.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 int row = wb.getSheet("Sheet1").getLastRowNum();
	      int cell = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
	     System.out.println(row);
	     System.out.println(cell);
	     
	     
	      String data [][]=new String[row][cell];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<cell;j++)
		{
			data[i][j]=wb.getSheet("Sheet1").getRow(i+1).getCell(j).getStringCellValue();
		}
	}
	  return data;
}
}
