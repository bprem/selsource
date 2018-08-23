package testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browser.Choosebrowser;
import pages.WithPF;

public class TC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = Choosebrowser.selectbrowser("firefox", "http://demoqa.com/registration/");
	WithPF lo=	PageFactory.initElements(driver, WithPF.class);
	lo.country();
	lo.month("8");
	lo.year();

	}

}
