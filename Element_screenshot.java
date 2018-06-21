package com;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Element_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			WebDriver	driver =new FirefoxDriver();     
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		  
		  WebElement Image = driver.findElement(By.xpath("//img[@border='0']"));
		  
		  
		  
		//Capture entire page screenshot as buffer.
		  
		  File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  
		//Used selenium getSize() method to get height and width of element.
		  //Retrieve width of element.
		  
		  int imwidth = Image.getSize().getWidth();
		  int imhght= Image.getSize().getHeight();
		  System.out.println(imwidth + "  "+ imhght);
		//Used selenium Point class to get x y coordinates of Image element.
		  //get location(x y coordinates) of the element.
		  
		  Point po = Image.getLocation();
		  int xcord = po.getX();
		  int ycord =po.getY();
		  System.out.println(xcord + " " +ycord );
		//Reading full image screenshot.
		  BufferedImage img = ImageIO.read(screen);
		  
		//cut Image using height, width and x y coordinates parameters.
		  BufferedImage dest = img.getSubimage(xcord, ycord, imwidth, imhght);
		  ImageIO.write(dest, "png", screen);
		  
		  FileUtils.copyFile(screen, new File("D:\\screenshot.png"));
	}

}
