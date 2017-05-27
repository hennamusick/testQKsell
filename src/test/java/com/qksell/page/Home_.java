package com.qksell.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qksell.Base;

public class Home_ extends Base{
	
	public WebDriver driver;

	public Home_(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	/*//Email
	public By email = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div[1]/input");
	public WebElement getEmail() {
		return driver.findElement(email);
	}*/
	
	public By signIn = By.xpath("/html/body/div[1]/div/div[2]/ul/li[5]/a");
	public WebElement getSignIn() {
		return driver.findElement(signIn);
	}
	

}
