//Mouse Over

package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
	
		// Mouse hover using Actions Class.
		
		WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
	//Genral Syntax	
		Actions mh = new Actions(driver);
		mh.moveToElement(pim).build().perform();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		
		
		
	
	}
	
	

}
