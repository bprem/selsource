package Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpro2 {


		WebDriver driver;
		
		@BeforeTest
		public void Setup()
		{
			driver=new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@Test
		public void login()
		{
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			driver.findElement(By.id("btnLogin")).click();
		
		}	
		
		/*@Test
		public void logout()
		{
			driver.findElement(By.linkText("SIGN-OFF")).click();
		} */
		@AfterMethod
		public void sc(ITestResult result) throws IOException // for screenshot we need to create new method in @After Method, so that it wil take screen shoot in every method.
		{
			DateFormat df = new SimpleDateFormat("ddMMyyHHmmss");
			Date d = new Date();
			
			if(result.isSuccess())//if method pass means take scrreeenshot, Put ! before If(!result.isSuccess) which means if method fails means, it will take screen shot.
			{
			File ss=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take screenshot syntax.
			FileUtils.copyFile(ss, new File("F:\\screenshot\\"+result.getName()+df.format(d)+".png"));//Screenshot file is saved in the given folder wit given format
			}
		}
		
		@AfterTest
		public void teardown()
		{
		
			driver.quit();
		}
	}



	
	

