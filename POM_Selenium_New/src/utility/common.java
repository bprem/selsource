package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class common {
	
	WebDriver driver;
	
	public common(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void dropDown(String loc,String val)
	{
		WebElement dateofbirth_mm = driver.findElement(By.id(loc));
		Select countm = new Select(dateofbirth_mm);
		countm.selectByValue(val);
		
	}

}
