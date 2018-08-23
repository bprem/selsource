package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Choosebrowser {
	static WebDriver driver;
public static WebDriver selectbrowser(String bname,String URL)
{
	if(bname.equals("firefox"))
	{
	driver = new FirefoxDriver();
	}
	else if(bname.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","‪‪F:\\selenium driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	driver.get(URL);
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS ); //implicit
return driver;
}
}



