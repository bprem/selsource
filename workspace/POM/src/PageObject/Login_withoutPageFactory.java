package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_withoutPageFactory {
WebDriver driver; //global declaration
By user = By.name("userName");
By pass = By.name("password");
By login = By.name("login");
By logout = By.linkText("SIGN-OFF");

public Login_withoutPageFactory(WebDriver driver)//contructor - syntax public classname()
{
this.driver = driver;
}
public void Login(String username, String password)
	
	{
		/*driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("login")).click();
	*/
	
	driver.findElement(user).sendKeys(username);
	driver.findElement(pass).sendKeys(password);
	driver.findElement(login).click();
	
	}
	
	
	
	public void Logout()
	
	{
		driver.findElement(logout).click();
	}
	
}
