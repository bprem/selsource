/**
 * 
 */
package InputFormsTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.SelectBrowser;
import InputFormsPageObjects.SimpleFormsElements;

/**
 * @author LakshmananDeepthy
 *
 */


public class SimpleformsTestScripts
{
	WebDriver driver;

	@BeforeTest
	public void testScripts()
	{	
		 driver = SelectBrowser.selectBrowserandURL("Chrome", "http://www.seleniumeasy.com/test/");
	}

	
	@Test

	public void testScripts2()
	{
		
		SimpleFormsElements tc1 = PageFactory.initElements(driver, SimpleFormsElements.class);

		tc1.inputForm1();

		tc1.inputForm2("5","5");
	}
	
}
	

