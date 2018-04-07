package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Chrome Driver syntax:
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LakshmananDeepthy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LakshmananDeepthy/Desktop/Frames.html");
		//enter into frame by index.
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.linkText("SIGN-OFF")).click();
//to go to parent window.
		driver.switchTo().defaultContent();
		//enter in to frame by name or id.
		driver.switchTo().frame("demo");
		
		driver.findElement(By.id("menu-item-374")).click();
		//Thread.sleep(2000);
		
		//try catch exception handling
		
		try
		{
		driver.findElement(By.id("name_3_firstname")).sendKeys("Lakshmanan");
		}
		
		catch (NoSuchElementException e)
		
		{
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("name_3_firstname")).sendKeys("Lakshmanan");
			
		}
		
		
		
		driver.findElement(By.id("name_3_lastname")).sendKeys("Chidambaram");
		driver.findElement(By.id("phone_9")).sendKeys("9629566996");
		driver.findElement(By.id("username")).sendKeys("Mani");
		driver.findElement(By.id("email_1")).sendKeys("lakshman@gmail.com");
		driver.findElement(By.id("description")).sendKeys("Selenium Testing");
		driver.findElement(By.id("password_2")).sendKeys("123456789");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("123456789");
		driver.findElement(By.linkText("Home")).click();
		
		driver.switchTo().defaultContent();

		//enter into frame by title we have to use Webelement.
		WebElement title = driver.findElement(By.xpath("//iframe[@title='guru']"));
		
		driver.switchTo().frame(title);
		
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
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//a[text()='click for facebook']")).click();
		
		driver.navigate().back();
		
		driver.quit();
		
	}

}
