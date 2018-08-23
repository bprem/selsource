package testsuite;

import org.openqa.selenium.WebDriver;

import browser.Choosebrowser;
import pages.withoutpagefactory;

public class testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = Choosebrowser.selectbrowser("firefox", "http://demoqa.com/registration/");
withoutpagefactory lo= new withoutpagefactory(driver);
lo.month("5");
lo.year("2014");
	
	}

}
