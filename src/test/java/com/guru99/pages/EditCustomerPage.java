package com.guru99.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {

	private WebDriver driver; 
	
	
	
	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="cusid")
	public WebElement customerId; 
	
	@FindBy(id="message14")
	public WebElement msgCustomerId; 
	
	@FindBy(xpath="//p[@class='heading3']")
	public WebElement editCustomerLabel; 
	
	@FindBy (xpath="//input[@type='submit']")
	public WebElement submit; 
	
	@FindBy (xpath="//input[@type='reset']")
	public WebElement reset; 
	
	public void enterValue(WebElement element,String field ) {
		
		if(field.equals("empty")) {
			element.sendKeys("");
		}else if(field.equals("firstspace")) {
			element.sendKeys(" "+ field);
		}else if (field.equals("telephonespace")) {
			element.sendKeys("123 123");
		}else if (field.equals("emailfirstspace")) {
			element.sendKeys(" guru99@gmail.com");
		}else {
			element.sendKeys(field);
		}
		
	}
}
