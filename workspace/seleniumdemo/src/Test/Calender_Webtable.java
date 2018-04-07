package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calender_Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
		
		driver.findElement(By.linkText("Datepicker")).click();
		
		//driver.findElement(By.id("ui-id-3")).click();
		
		//driver.findElement(By.id("datepicker3")).click();
    //Calender/Webtable
	    
	/*    List<WebElement> dates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));//we have to remove row value and data value
	    
	    for (WebElement date:dates)
	    	
	    {
	    	String val = date.getText();
	    	
	    	
	    	if(val.equalsIgnoreCase("23"))
	    		
	    	{
	    		date.click();
	    	}
	    }
	   */
	    //Month slection if month and year is not a dropdown.
	    
		driver.findElement(By.id("ui-id-1")).click();
		
		driver.findElement(By.id("datepicker1")).click();
		
		for(int i=1; i<=12; i++)
		{
		String Month=  driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();	
		
		if(Month.equalsIgnoreCase("October"))
		//now use date picker concept	
		{
			List<WebElement> dates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));//we have to remove row value and data value
		    
		    for (WebElement date:dates)
		    	
		    {
		    	String val = date.getText();
		    	
		    	
		    	if(val.equalsIgnoreCase("23"))
		    		
		    	{
		    		date.click();
		    		break;
		    	}
		    
		     }
		    break;
		 
		}
		else
		{
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		}
	    
	    
	    
	    
	    
	}
	}
}
