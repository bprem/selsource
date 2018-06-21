package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ssl_certificateissue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfilesIni firpro = new ProfilesIni();
		
		FirefoxProfile fp =   firpro.getProfile("WebDriver_Profile");
		fp.setAcceptUntrustedCertificates(true);
		fp.setAssumeUntrustedCertificateIssuer(false);
		WebDriver d = new FirefoxDriver(fp);
		d.get("https://yuilibrary.com/yui/docs/charts/charts-pie.html");

	}

}
