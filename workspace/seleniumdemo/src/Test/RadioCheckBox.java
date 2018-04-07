package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    driver.findElement(By.id("menu-item-374")).click();
		
	    List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));// first store all the elements in a list.
	    
	    for(WebElement rad:radios)
	    	
	    {
	    	String Val = rad.getAttribute("value"); //
	    	
	    	
	    	
	    	if(Val.equalsIgnoreCase("Married"))
	    	{
	    		rad.click();
	    		break;
	    	}
	    }
	    
	    //Calender/Webtable
	    
	    List<WebElement> dates = driver.findElements(By.xpath("//[@id='ui-datepicker-div']/table/tbody/tr/td/a"));//we have to remove row value and data value
	    
	    for (WebElement date:dates)
	    	
	    {
	    	String val = date.getText();
	    	
	    	
	    	if(val.equalsIgnoreCase("23"))
	    		
	    	{
	    		date.click();
	    	}
	    }
	    
	    
		//checkbox single selection
	    
 List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));// first store all the elements in a list.
	    
	    for(WebElement cb:checkboxes)
	    	
	    {
	    	String Val = cb.getAttribute("value"); //
	    	
	    	if(Val.equalsIgnoreCase("cricket ")) /* For Multiple selections - If val.equalsIgnoreCase("reading")) || Val.Equals.ignorecase("Cricket") and no break.*/
	    	{
	    		cb.click();
	    	    break;
	    	}

	}

}
	
}
