package Demo;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours {

WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		File path = new File("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //the following four lines are used to set teh firefox path in jenkin
		FirefoxBinary Bin = new FirefoxBinary(path);
		FirefoxProfile fireprofile = new FirefoxProfile();
		driver=new FirefoxDriver(Bin,fireprofile);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("login")).click();
	
	}
	@Test
	public void logout()
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

}
