package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_withPageFactory {

	@FindBy(how=How.NAME,using="userName")
	@CacheLookup //it will search th element nexttime in chache memory so it will reduce execution time
	WebElement user;
	
	
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement pass;
	
	@FindBy(how=How.NAME,using="login")
	@CacheLookup
	WebElement login;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	@CacheLookup
	WebElement logout;


	
	
	public void Login()
	
	{
		user.sendKeys("123");
		pass.sendKeys("123");
		login.click();
	}
	
	public void Logout()
	{
		logout.click();
	}
	
	
	
	
}
