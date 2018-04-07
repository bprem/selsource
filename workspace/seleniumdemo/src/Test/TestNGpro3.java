package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGpro3 {
	
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	@Parameters({"Newuame","Newpass"})
	
	public void login(String usernam, String pas)
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys(usernam);
		driver.findElement(By.name("password")).sendKeys(pas);
		driver.findElement(By.name("login")).click();
	
	}

}
