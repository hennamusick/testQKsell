package com.qksell.regression;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qksell.Base;
import com.qksell.business.Home;
import com.qksell.business.Login;

public class MainTest {

	@Test
	public void signInButtonTest() {

			try {
				Base b = new Base();
				WebDriver driver = b.getDriver();
				// Home Page
				Home home = PageFactory.initElements(driver, Home.class);
				String url = "https://www.qksell.com";
				driver.get(url);
				driver.manage().window().maximize();
				home.signInClick();
				
				Login login = PageFactory.initElements(driver, Login.class);
				login.login("hennayaka121@gmail.com", "passwd!@#$");
				login.submitClick();
				
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
