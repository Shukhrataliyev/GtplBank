package com.guru99.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.guru99.pages.HomePage;
import com.guru99.pages.LoginPage;
import com.guru99.utilities.ConfigurationReader;
import com.guru99.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
	
	private WebDriver driver = Driver.getDriver(ConfigurationReader.getProperty("browser"));
	LoginPage loginPage; 
	HomePage homePage; 

	@When("^I logged in to my bank account$")
	public void i_logged_in_to_my_bank_account() {
	  
		loginPage=new LoginPage(driver); 
		loginPage.validLogin();
		
		
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String arg1) {
	  
		homePage=new HomePage(driver); 
		Assert.assertEquals(homePage.welcomeMessage.getText(), arg1 );
		
		
		
		
	}
	
	
}
