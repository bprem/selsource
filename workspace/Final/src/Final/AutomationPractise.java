package Final;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//find element by id
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		driver.findElement(By.id("email_create")).sendKeys("test@besant1.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		//radio button
		
		List<WebElement> radiolist = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement rad:radiolist)
		{
			String val = rad.getAttribute("value");
			if(val.equalsIgnoreCase("1"))
			
			{
			
				rad.click();
				
			}
			
		}
			
			driver.findElement(By.id("customer_firstname")).sendKeys("Lakshamnan");
			driver.findElement(By.id("customer_lastname")).sendKeys("Chidambaram");
			driver.findElement(By.id("passwd")).sendKeys("Meandmamz2931");
			
			//dropdown
			
			WebElement days = driver.findElement(By.id("days"));
			
			Select day = new Select(days);
			
			day.selectByValue("29");
			
			WebElement months = driver.findElement(By.id("months"));
			
			Select month = new Select(months);
			
			month.selectByValue("10");
			
			WebElement years = driver.findElement(By.id("years"));
			
			Select year = new Select(years);
			
			year.selectByValue("1991");
			
			
			//checkbox
			
			
			List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
			
			for(WebElement cb:checkbox)
			{
				String val = cb.getAttribute("value");
				if(val.equalsIgnoreCase("1"))
				
				{
				
					cb.click();
					
				}
				
			}
			
			
			
			driver.findElement(By.id("firstname")).sendKeys("lakshmanan");
			
			driver.findElement(By.id("lastname")).sendKeys("c");
			
			driver.findElement(By.id("company")).sendKeys("Altimetrik");
			
			driver.findElement(By.id("address1")).sendKeys("1,add strret. chenenai");
			driver.findElement(By.id("address2")).sendKeys("Inida");
			driver.findElement(By.id("city")).sendKeys("Chennai");
			
           WebElement state = driver.findElement(By.id("id_state"));
			
			Select sta = new Select(state);
			
			sta.selectByValue("1");
			
			
			driver.findElement(By.id("postcode")).sendKeys("00000");
			
			
			WebElement country = driver.findElement(By.id("id_country"));
			
			Select cou = new Select(country);
			
			cou.selectByValue("21");
			
			driver.findElement(By.id("other")).sendKeys("ABC");
			
			driver.findElement(By.id("phone")).sendKeys("044261258");
			driver.findElement(By.id("phone_mobile")).sendKeys("9876543210");
			driver.findElement(By.id("alias")).sendKeys("Meandmamz");
			
			
			driver.findElement(By.id("submitAccount")).click();
			
			//Screenshot:
			
		File ss=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("F:\\screenshot\\error.png"));
	System.out.println(	FileUtils.sizeOf(new File("F:\\screenshot\\error.png")));
		
		
		
		

	}

}
