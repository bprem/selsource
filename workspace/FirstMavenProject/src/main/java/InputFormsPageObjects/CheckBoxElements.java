package InputFormsPageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author LakshmananDeepthy
 *
 */

public class CheckBoxElements {
	
	
	
	@FindBy(how=How.LINK_TEXT, using="Checkbox Demo")
	@CacheLookup
	WebElement CheckBox;
	
	@FindBy(how=How.ID, using = "isAgeSelected")
	@CacheLookup
	WebElement SingleCheckbox;
	
	@FindBy(how=How.LINK_TEXT,using="Input Forms")
	@CacheLookup
	WebElement InputForm;
	
	@FindBy(how=How.CLASS_NAME, using ="cb1-element")
	@CacheLookup
List<WebElement> MultiCheckBox;
	
	
	public void checkBoxes1()
	{
		InputForm.click();
		CheckBox.click();
		SingleCheckbox.click();
		if(SingleCheckbox.isSelected())
		{
			System.out.println("CheckbOx is selected");
		}
		
	}
	
	public void checkBoxes2()
	{
		for(WebElement Multi:MultiCheckBox)
		{
			if(Multi.getText().equalsIgnoreCase("Option 1"))
			{
				Multi.click();
			}
	}
		}
	
   /* for(WebElement rad:radios)
    	
    {
    	String Val = rad.getAttribute("value"); //
    	
    	
    	
    	if(Val.equalsIgnoreCase("Married"))
    	{
    		rad.click();
    		break;
    		
    */
	
	
	
	

}
