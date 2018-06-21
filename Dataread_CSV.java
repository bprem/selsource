package com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencsv.CSVReader;

public class Dataread_CSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String scvfile="D:\\os\\CSV Pack\\Detail.csv";
		WebDriver	driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		  CSVReader reader = new CSVReader(new FileReader(scvfile));
		  String [] csvCell;
		  
		  while ((csvCell = reader.readNext()) != null) {   
			   String FName = csvCell[0];
			   String LName = csvCell[1];
			   String Email = csvCell[2];
			   String Mob = csvCell[3];
			   String company = csvCell[4];
			   driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(FName);
			   driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(LName);
			   driver.findElement(By.xpath("//input[@name='EmailID']")).sendKeys(Email);
			   driver.findElement(By.xpath("//input[@name='MobNo']")).sendKeys(Mob);
			   driver.findElement(By.xpath("//input[@name='Company']")).sendKeys(company);
			   driver.findElement(By.xpath("//input[@value='Submit']")).click();
			   driver.switchTo().alert().accept();
			  }  
	}

}
