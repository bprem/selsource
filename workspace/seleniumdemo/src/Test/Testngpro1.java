package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngpro1 {

	WebDriver driver;
	
	@BeforeTest
	public void Setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//@Test
	/*public void login()
	{
		driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("login")).click();
	
		
	}	*/
	
	
	@Test
	@Parameters({"uname","pwrd"})
	public void login(String username, String pass)
	
	{
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}
	
	
	@Test
	public void logout()
	{
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}
	@AfterTest
	public void teardown()
	{
	
		driver.quit();
	}
}

