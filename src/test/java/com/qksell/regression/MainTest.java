package com.qksell.regression;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qksell.Base;
import com.qksell.business.Home;

public class MainTest {

	@Test
	public void test01() {
		Base b = new Base();
		WebDriver driver = b.getDriver();
		Home home = PageFactory.initElements(driver, Home.class);
		String url = "https://www.qksell.com";
		driver.get(url);
		driver.manage().window().maximize();
		home.signInClick();
		
	}
}
