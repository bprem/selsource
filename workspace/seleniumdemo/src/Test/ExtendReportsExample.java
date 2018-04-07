package Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtendReportsExample {
	
	WebDriver driver;
	//Add two jar files
	//1. extent reports jar file
	//2. free marker jar file
	ExtentReports report; // import class fro reports
	ExtentTest logger; //import class fro reports
	@BeforeTest
	public void setup()
	{
	report = new ExtentReports("F:\\Reports\\report.html",true);//where to create report
	logger = report.startTest("SeleniumReports"); //to start logger
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	logger.log(LogStatus.INFO,"URL launcehd Successfully"); //this log will be created
	
	}
	
	@Test
	public void a_login()
	{
	driver.findElement(By.name("userName")).sendKeys("123");
	driver.findElement(By.name("password")).sendKeys("123");
	driver.findElement(By.name("login")).click();
	logger.log(LogStatus.INFO,"login Successfull"); //this log will be created
	}
	
	@Test
	public void b_flightbooking()
	{
		List<WebElement> radios = driver.findElements(By.xpath("//input[@value='oneway']"));
   	    
	    for(WebElement rad:radios)
	    	
	    {
	    	String Val = rad.getAttribute("value");
	    	
	    	if(Val.equalsIgnoreCase("oneway"))

	    	{
	    		rad.click();
	    		break;
	    	}

	    }
	    
	    
		
	    WebElement passenger = driver.findElement(By.name("passCount"));
		
		Select passenger_s = new Select(passenger);
		
		passenger_s.selectByValue("6");
	}
	@AfterMethod
	public void screenshot(ITestResult result) throws IOException
	{
		DateFormat df = new SimpleDateFormat("ddMMyyHHmmss");
		Date d = new Date();
		if(!result.isSuccess())
		{
		logger.log(LogStatus.FAIL,result.getName()+ "is Fail"); //this log will be created
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("F:\\screenshot\\"+result.getName()+df.format(d)+".png"));
		//the following lines are attach the screenshot with reports
		String fpath = "F:\\screenshot\\"+result.getName()+df.format(d)+".png";
		String img = logger.addScreenCapture(fpath);
		logger.log(LogStatus.FAIL,"screenshot attached",img);
		}
		else
		{
			logger.log(LogStatus.PASS,result.getName()+ "is Pass"); //this log will be created
		}
	    report.endTest(logger);
	    report.flush();
	    
	}
	
}
