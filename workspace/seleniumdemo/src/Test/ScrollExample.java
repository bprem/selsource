package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");//ScrollBy method
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		//ScrollTO
		
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//scrollIntoView
		
	WebElement sort =	driver.findElement(By.linkText("Sortable"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",sort);
	
	}

}
