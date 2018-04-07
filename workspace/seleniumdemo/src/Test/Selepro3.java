//Find Elements Using Xpath & WebElement:

package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selepro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/");
		//Wait - Implicit wait.
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@id='menu-item-374']")).click();
		driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys("Lakshmanan");
		driver.findElement(By.xpath("//input[@id='name_3_lastname']")).sendKeys("Chidamabaram");
		driver.findElement(By.xpath("//input[@name='phone_9']")).sendKeys("9629566996");
		
//dropdown using Select class
		
		WebElement country = driver.findElement(By.id("dropdown_7"));
		
//select is a one of the selenium class
		
		Select country_s = new Select(country);
		
		country_s.selectByIndex(4);
		
		WebElement month = driver.findElement(By.id("mm_date_8"));
			
		Select month_s = new Select(month);
		
		month_s.selectByValue("3");
		
		WebElement date = driver.findElement(By.id("dd_date_8"));
		
		Select date_s = new Select(date);	
		
		date_s.selectByVisibleText("5");
		
		WebElement year = driver.findElement(By.id("yy_date_8"));
		
		Select year_s = new Select(year); 
		
		year_s.selectByValue("2012");		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Mani");
		driver.findElement(By.xpath("//input[@id='email_1']")).sendKeys("Lakshman@gmail.Com");
		
		//Using WebElement:
		
		WebElement notes = driver.findElement(By.xpath("//textarea[@id='description']"));
		notes.sendKeys("Lakshmanan Testing");
		
		
		
	}

}
