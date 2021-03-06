package Test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		
		
		String pn = driver.getWindowHandle();//get parent window name and stored it in a String
		
		Set<String>  aw = driver.getWindowHandles();// get all windows name and stored it in a set because no duplicate values.
		
		for (String ow:aw) //advanced for loop (type newname:all windows name)
			
		{
			if (!ow.equalsIgnoreCase(pn))
				
			{
				driver.switchTo().window(ow);
				driver.close();
			}
		}
		
		
		
	}

}
