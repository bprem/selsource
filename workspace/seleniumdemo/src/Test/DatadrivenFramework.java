package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenFramework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//single Data
		File excel = new File("H:\\selenium software\\TestDataDriven.xlsx");
		
		FileInputStream fis = new FileInputStream(excel);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
	//	XSSFRow row = sh.getRow(0);
		
	//String data =	row.getCell(0).getStringCellValue();
		
		
		//System.out.println(data);
		
		//multiple Data
		
		//we need to use two for loop
		
		for (int i =0; i<=sh.getLastRowNum();i++)// this foe for row
			
		{
			XSSFRow row=sh.getRow(0);
			
			for(int j=0; j<row.getLastCellNum();j++) // this for for column
				
			{
				String data=row.getCell(j).getStringCellValue();
				System.out.println(data);	
				
			}
		}
		
		
		
		
	}

}
