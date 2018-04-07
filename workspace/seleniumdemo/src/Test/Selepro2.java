//FInd Element using ID,name and linktext
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selepro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demoqa.com/");
		driver.findElement(By.id("menu-item-374")).click();
		driver.findElement(By.id("name_3_firstname")).sendKeys("Lakshmanan");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Chidambaram");
		driver.findElement(By.id("phone_9")).sendKeys("9629566996");
		driver.findElement(By.id("username")).sendKeys("Mani");
		driver.findElement(By.id("email_1")).sendKeys("lakshman@gmail.com");
		driver.findElement(By.id("description")).sendKeys("Selenium Testing");
		driver.findElement(By.id("password_2")).sendKeys("123456789");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("123456789");
		driver.findElement(By.linkText("Home")).click();
	}

}
