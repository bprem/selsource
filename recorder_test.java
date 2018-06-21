package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class recorder_test {

	public static void main(String[] args) throws ATUTestRecorderException, InterruptedException {
		// TODO Auto-generated method stub.
		
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		  Date date = new Date();
		  
		  ATUTestRecorder rec = new ATUTestRecorder("D:\\","Testvide-"+dateFormat.format(date),false);
		  rec.start();
		WebDriver  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://google.com/");
		  
		  driver.manage().window().setSize(new Dimension(400,768));
		  Thread.sleep(2000);  
		  
		  driver.manage().window().setSize(new Dimension(400,400));
		  Thread.sleep(2000);
		  
		  driver.manage().window().setSize(new Dimension(1024,400)); 
		  rec.stop();
	}

}
