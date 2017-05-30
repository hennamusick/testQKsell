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

			try {
				// Login Page
				Login login = PageFactory.initElements(driver, Login.class);
				
				//True login
				login.login("tureemail@gmail.com", "truepassword");
				login.submitClick();
				
				//Wrong login
				home.signInClick();
				login.login("wrongemail@gmail.com", "password");
				login.submitClick();
				
				//Wrong email and true password
				home.signInClick();
				login.login("wrongemail@gmail.com", "truepassword");
				login.submitClick();
				
				//True email and wrong password
				home.signInClick();
				login.login("trueemail@gmail.com", "password");
				login.submitClick();
				
				//Blank email and true password
				home.signInClick();
				login.login("", "truepassword");
				login.submitClick();
				
				//Blank email and wrong password
				home.signInClick();
				login.login("", "password");
				login.submitClick();
				
				//True email and blank password
				home.signInClick();
				login.login("tureemail@gmail.com", "");
				login.submitClick();
				
				//Wrong email and blank password
				home.signInClick();
				login.login("wrongemail@gmail.com", "");
				login.submitClick();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
