package com.qksell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {

	public WebDriver driver = null;
	

	public WebDriver getDriver() {
		
		System.setProperty("webdriver.gecko.driver", "/home/henna/Programming/geckodriver");
		driver = new FirefoxDriver();
		return driver;
	}
}
