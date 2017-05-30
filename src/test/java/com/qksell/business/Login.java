package com.qksell.business;

import org.openqa.selenium.WebDriver;

import com.qksell.page.Login_;

public class Login extends Login_{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void login( String email, String password) {
		getEmailAddress().clear();
		getEmailAddress().sendKeys(email);
		getPassword().clear();
		getPassword().sendKeys(password);
	}
	
	public void submitClick() {
		getSubmit().click();
	}
	
}
