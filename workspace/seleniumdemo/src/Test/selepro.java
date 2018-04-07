package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selepro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demoqa.com/");
	    driver.findElement(By.id("menu-item-374")).click();
	    driver.findElement(By.id("name_3_firstname")).sendKeys("Lakshmanan");
	    driver.findElement(By.id("menu-item-374")).clear();
		driver.close();
	}
	

}
