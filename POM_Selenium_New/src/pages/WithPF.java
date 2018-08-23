package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithPF {
	
	@FindBy(how=How.ID,using="dropdown_7")
	WebElement cou;
	
	@FindBy(how=How.ID,using="mm_date_8")
	WebElement mon;
	@FindBy(how=How.ID,using="yy_date_8")
	WebElement year;
	
	public void country()
	{
		WebElement count_cc = cou;
		Select countc = new Select(count_cc);
		countc.selectByIndex(4);
	}
	
	@Parameters({"monthname"})
	public void month(String month) {
		
		WebElement dateofbirth_mm =mon;
		Select countm = new Select(dateofbirth_mm);
		countm.selectByValue(month);
		
	}
	
	public void year() {
		WebElement dateofbirth_yy =year;
		Select county = new Select(dateofbirth_yy);
		county.selectByVisibleText("2014");
	}


}
