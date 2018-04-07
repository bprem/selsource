package TestSuite;

import org.openqa.selenium.WebDriver;

import Browser.Choosebrowser;
import PageObject.Login_withoutPageFactory;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver =	Choosebrowser.getURLAndBrowser("Firefox", "http://newtours.demoaut.com/mercurysignon.php");
	
	Login_withoutPageFactory tc = new Login_withoutPageFactory(driver);//tc is a object for the class
	tc.Login("123","123");
	tc.Logout();
	System.out.println("Run Successfully");
	}

}
