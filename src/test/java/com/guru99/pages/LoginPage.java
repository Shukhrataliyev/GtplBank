package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.utilities.ConfigurationReader;

public class LoginPage {

	private WebDriver driver; 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath= "//input[@name='uid']")
	public WebElement username; 
	
	public WebElement password; 
	
	public WebElement btnLogin; 
	
	public void validLogin () {
		
		username.sendKeys(ConfigurationReader.getProperty("username"));
		password.sendKeys(ConfigurationReader.getProperty("password"));
		btnLogin.click();
	}
	
	
}
