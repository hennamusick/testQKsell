package com.qksell.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qksell.Base;

public class Login_ extends Base {

	public WebDriver driver;

	public Login_(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	//email Address
	public By emailAddress = By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/div[3]/form/div[1]/input");
	public WebElement getEmailAddress() {
		return driver.findElement(emailAddress);
	}
	
	//Password field
	public By password = By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/div[3]/form/div[2]/input");
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	//Submit Button
	public By submit = By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/div[3]/form/button");
	public WebElement getSubmit() {
		return driver.findElement(submit);
	}
}
