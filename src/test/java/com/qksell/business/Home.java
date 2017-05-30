package com.qksell.business;

import org.openqa.selenium.WebDriver;

public class Home extends com.qksell.page.Home_{

	public Home(WebDriver driver) {
		super(driver);	
	}
	
	/*public void login( String email) {
		getEmail().clear();
		getEmail().sendKeys(email);
	}*/
	
	public void signInClick() {
		getSignIn().click();
	}
	
}
