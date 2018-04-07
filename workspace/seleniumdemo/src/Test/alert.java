package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	WebDriver driver = new FirefoxDriver();
		
	driver.get("http://demo.guru99.com/v4/");
	
	// for popup msg print
	
	driver.findElement(By.name("btnLogin")).click();
	String msg = driver.switchTo().alert().getText();
	
	System.out.println(msg);
	
	//Accept popup
	
	driver.switchTo().alert().accept();
	
	driver.findElement(By.name("uid")).sendKeys("mngr122182");
	driver.findElement(By.name("password")).sendKeys("UqUrYry");
	driver.findElement(By.name("btnLogin")).click();
	
	driver.findElement(By.xpath("//a[text()='Delete Account']")).click();
	
	driver.findElement(By.name("accountno")).sendKeys("123456");
	
	driver.findElement(By.name("AccSubmit")).click();
	
	String note1 = driver.switchTo().alert().getText();
	
	System.out.println(note1);
	
	driver.switchTo().alert().accept(); // we can give dismiss(); also
	
	String note = driver.switchTo().alert().getText();
	
	System.out.println(note);
	
	driver.switchTo().alert().accept();
	
	
	}

	
	
	
}
