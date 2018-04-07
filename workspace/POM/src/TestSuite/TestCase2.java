package TestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Browser.Choosebrowser;
import PageObject.Login_withPageFactory;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =	Choosebrowser.getURLAndBrowser("Firefox", "http://newtours.demoaut.com/mercurysignon.php");
		
		
		Login_withPageFactory tc = PageFactory.initElements(driver, Login_withPageFactory.class);
		
		tc.Login();
		tc.Logout();
		
		
	}

}
