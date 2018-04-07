/**
 * 
 */
package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author LakshmananDeepthy
 *
 */
public class SelectBrowser {
	
	
	static WebDriver driver;
	
	public static WebDriver selectBrowserandURL (String brname, String url)
	{
		if(brname.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else if(brname.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LakshmananDeepthy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(url);
		return driver;
	}

}
