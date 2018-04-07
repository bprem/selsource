package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Choosebrowser {

	
	 static WebDriver driver;
	public static WebDriver getURLAndBrowser(String bname, String URL)//method can be called as signature
	{
		if(bname.equalsIgnoreCase("Firefox"))
			
		{
			driver = new FirefoxDriver();
		}
		
		else if (bname.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("WebDriver.Chrome.driver","C:\\Users\\LakshmananDeepthy\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
		
		driver.get(URL);
		return driver;
	}
	
	
	
	
}
