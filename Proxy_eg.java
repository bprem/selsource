package com;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Proxy_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PROXY="localhost:8080";
		
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY);
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		
		WebDriver driver = new FirefoxDriver(cap);
		driver.get("https://yuilibrary.com/yui/docs/charts/charts-pie.html");

	}

}
