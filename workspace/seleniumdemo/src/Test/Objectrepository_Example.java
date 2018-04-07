package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Objectrepository_Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

WebDriver driver = new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();*/
		
		//going to read the property file. - Object Repository
		
		File lp = new File("F:\\workspace\\seleniumdemo\\Login.properties");
		
		FileInputStream fis = new FileInputStream(lp); //input stream means read the file, output menas write the file
		
		Properties pro = new Properties();
		
		pro.load(fis);
		
		
		driver.findElement(By.id(pro.getProperty("username_id"))).sendKeys(pro.getProperty("username_Value"));
		driver.findElement(By.id(pro.getProperty("password_id"))).sendKeys(pro.getProperty("password_Value"));
		driver.findElement(By.id(pro.getProperty("Loginbutton_id"))).click();
		
		
		
		
		// Mouse hover using Actions Class.
		
		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
		//Genral Syntax	
				Actions mh = new Actions(driver);
				mh.moveToElement(pim).build().perform();
				driver.findElement(By.id("menu_pim_addEmployee")).click();
				
				
				
				
		
		
	}

}
