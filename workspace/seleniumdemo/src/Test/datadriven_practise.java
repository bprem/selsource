package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datadriven_practise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
		driver.findElement(By.id("menu-item-374")).click();
		
		
File excel = new File("H:\\selenium software\\Book2.xlsx");
		
		FileInputStream fis = new FileInputStream(excel);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		for(int i=0; i<=sh.getLastRowNum();i++)
		
		{
		driver.findElement(By.id("name_3_firstname")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
		driver.findElement(By.id("name_3_lastname")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
		driver.findElement(By.id("phone_9")).sendKeys(String.valueOf(sh.getRow(i).getCell(2).getNumericCellValue()));
		driver.findElement(By.id("username")).sendKeys(sh.getRow(i).getCell(3).getStringCellValue());
		driver.findElement(By.id("email_1")).sendKeys(sh.getRow(i).getCell(4).getStringCellValue());
		driver.findElement(By.id("description")).sendKeys("Selenium Testing");
		driver.findElement(By.id("password_2")).sendKeys(sh.getRow(i).getCell(5).getStringCellValue());
		driver.findElement(By.id("confirm_password_password_2")).sendKeys(sh.getRow(i).getCell(4).getStringCellValue());
		//driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.id("name_3_firstname")).clear();
		driver.findElement(By.name("pie_submit")).click();
		}
	}

}
