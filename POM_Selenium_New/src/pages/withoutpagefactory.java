package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.common;

public class withoutpagefactory {
WebDriver driver;
common cf;
public withoutpagefactory(WebDriver driver)
{
	this.driver=driver;
}
	
	public void month(String month) {
		cf = new common(driver);
		cf.dropDown("mm_date_8", month);
		
	}
	
	public void year(String year) {
	
		cf.dropDown("yy_date_8", year);
	}

}
