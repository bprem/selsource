/**
 * 
 */
package InputFormsTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browser.SelectBrowser;
import InputFormsPageObjects.CheckBoxElements;

/**
 * @author LakshmananDeepthy
 *
 */
public class CheckBoxTestScripts
{
WebDriver driver;
	@BeforeTest
	public void CheckBoxTestScript1() 
	{	
	 driver = SelectBrowser.selectBrowserandURL("FireFox", "http://www.seleniumeasy.com/test/");
	}
	
	
	
	@Test
	public void CheckBoxtestScript2()
	{
		
	CheckBoxElements Tc1 = PageFactory.initElements(driver, CheckBoxElements.class);
	Tc1.checkBoxes1();
	}
	
	

}
