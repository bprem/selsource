package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
		  
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  
		  driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		  
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		  //Switch to current selected tab's content.
	  driver.switchTo().defaultContent(); 
		  
		  driver.findElement(By.xpath("//input[@id='6']")).click();
		  driver.findElement(By.xpath("//input[@id='plus']"));
		  driver.findElement(By.xpath("//input[@id='3']"));
		  driver.findElement(By.xpath("//input[@id='equals']"));
	}

}
