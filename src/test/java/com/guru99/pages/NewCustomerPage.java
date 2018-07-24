package com.guru99.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {

	
	private WebDriver driver; 
	
	
	
	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[@class='heading3']")
	public WebElement addCustormerLabel; 
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement customerName;
	
	@FindBy(id="message")
	public WebElement msgName; 
	
	@FindBy (xpath="//input[@type='radio']")
	public List<WebElement> gender; 
	
	public WebElement dob; 
	
	@FindBy(xpath="//textarea[@name='addr']")
	public WebElement address; 
	
	@FindBy(xpath="//input[@name='city']")
	public WebElement city; 
	
	@FindBy(id="message4")
	public WebElement msgCity; 
	
	@FindBy(xpath="//input[@name='state']")
	public WebElement state; 
	
	@FindBy(id="message5")
	public WebElement msgState; 
	
	
	@FindBy(xpath="//input[@name='pinno']")
	public WebElement pin; 
	
	@FindBy(id="message6")
	public WebElement msgPin; 
	
	@FindBy(xpath="//input[@name='telephoneno']")
	public WebElement telno; 
	
	@FindBy(id="message7")
	public WebElement msgPhone; 
	
	@FindBy(xpath="//input[@name='emailid']")
	public WebElement email;
	
	@FindBy(id="message9")
	public WebElement msgEmail; 
	
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
