package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selepro5 {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		//explicit Wait:
		WebDriverWait wait = new WebDriverWait(driver,60);
		
		driver.get("http://demoqa.com/");
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement fn = driver.findElement(By.id("menu-item-374"));
		
		//use wait class where ever we need.
		
		wait.until(ExpectedConditions.visibilityOf(fn));
		
		driver.findElement(By.id("menu-item-374")).click();
		
		
		driver.findElement(By.id("profile_pic_10")).click();
		//usub=ng sendKeys
		
		
		
		//Using AutoIT exe file
		
		//Runtime.getRuntime().exec("C:\\Users\\LakshmananDeepthy\\Desktop\\Sample AutoIt1.au3");
		
		//File upload
		//first get the file location by a string and copy it in the system clipboard.
		
		 StringSelection ss =  new StringSelection("F:\\Mozilla Downloads\\index.jpg"); //getting file location
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //storing it in  system clipboard
		
		//To using keyboard use Robot class.
		
		Robot fu = new Robot();
		fu.keyPress(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_ENTER);   
		
		
	}

}
