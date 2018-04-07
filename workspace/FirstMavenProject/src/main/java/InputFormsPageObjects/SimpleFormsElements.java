/**
 * 
 */
package InputFormsPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * @author LakshmananDeepthy
 *
 */
public class SimpleFormsElements {
	
	
	@FindBy(how=How.LINK_TEXT,using="Input Forms")
	@CacheLookup
	WebElement InputForm;
	
	
	@FindBy(how=How.LINK_TEXT, using="Simple Form Demo")
	@CacheLookup
	WebElement SimpleForm;
	
	
	@FindBy(how=How.ID, using="user-message")
	@CacheLookup
	WebElement SingleInputField;
	
	@FindBy(how=How.XPATH,using="//button[text()='Show Message']")
	@CacheLookup
	WebElement ShowMessage;
	
	@FindBy(how=How.ID,using="display")
	@CacheLookup
	WebElement ShowMessageText;
	
	@FindBy(how=How.ID, using="sum1")
	@CacheLookup
	WebElement valueA;
	
	
	@FindBy(how=How.ID, using="sum2")
	@CacheLookup
	WebElement valueB;
	
	@FindBy(how=How.XPATH,using="//button[text()='Get Total']")
	@CacheLookup
	WebElement GetTotal;
	
	@FindBy(how=How.ID, using="displayvalue")
	@CacheLookup
	WebElement GetTotalValue;
	
	
	
	public void inputForm1()
	{
		InputForm.click();
		SimpleForm.click();
		SingleInputField.sendKeys("Hi Mamz");
		ShowMessage.click();
		String msg=ShowMessageText.getText();
		Assert.assertEquals("Hi Mamz", msg);
	}
	
	public void inputForm2(String value1, String Value2)
	
	{
		valueA.sendKeys(value1);
		valueB.sendKeys(Value2);
		GetTotal.click();
		
		String getTotalMsg = GetTotalValue.getText();
		
		Assert.assertEquals("10", getTotalMsg);
	}

	
	
	
	

}
