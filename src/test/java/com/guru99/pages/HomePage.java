package com.guru99.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver; 
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	@FindBy (className="heading3")
	public WebElement welcomeMessage; 
	
	
	@FindBy(linkText="Manager")
	public WebElement managerLink;
	
	@FindBy(linkText="New Customer")
	public WebElement newCustomerLink;

	@FindBy(linkText="Edit Customer")
	public WebElement editCustomerLink;
	
	@FindBy(linkText= "Delete Customer")
	public WebElement deleteCustomerLink;
	
	@FindBy(linkText="New Account")
	public WebElement newAccountLink;
	
	@FindBy(linkText="Edit Account")
	public WebElement editAccountLink;
	
	@FindBy(linkText="Delete Account")
	public WebElement deleteAccountLink;
	
	@FindBy(linkText="Mini Statement")
	public WebElement miniStatementLink;
	
	@FindBy(linkText="Customised Statement")
	public WebElement customisedStamementLink;
	
	@FindBy(linkText="Log out")
	public WebElement  logoutLink;
	
	
	
	
}
