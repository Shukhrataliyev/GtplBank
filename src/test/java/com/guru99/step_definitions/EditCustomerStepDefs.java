package com.guru99.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.guru99.pages.EditCustomerPage;
import com.guru99.pages.HomePage;
import com.guru99.pages.LoginPage;
import com.guru99.pages.NewCustomerPage;
import com.guru99.utilities.ConfigurationReader;
import com.guru99.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditCustomerStepDefs {
	
	private WebDriver driver = Driver.getDriver(ConfigurationReader.getProperty("browser"));
	LoginPage loginPage = new LoginPage(driver);
	EditCustomerPage editCustomer = new EditCustomerPage(driver);
	HomePage homePage = new HomePage(driver);
	//NewCustomerPage newUser= new NewCustomerPage(driver);
	
	
	@When("^I am on edit customer page$")
	public void i_am_on_edit_customer_page() {
		homePage.editCustomerLink.click();
		assertTrue(editCustomer.editCustomerLabel.getText().equals("Edit Customer Form")); 
	}

	@When("^I  enter \"([^\"]*)\" value in customer id field$")
	public void i_enter_value_in_customer_id_field(String id) {
	
		editCustomer.enterValue(editCustomer.customerId, id); 
		
	}

	@Then("^Error message \"([^\"]*)\" for id should be displayed$")
	public void error_message_for_id_should_be_displayed(String message) {
		assertEquals(editCustomer.msgCustomerId.getText(),message);
	}
}
