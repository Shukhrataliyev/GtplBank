package com.guru99.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.guru99.pages.HomePage;
import com.guru99.pages.LoginPage;
import com.guru99.pages.NewCustomerPage;
import com.guru99.utilities.ConfigurationReader;
import com.guru99.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUserStepDefs {
	private WebDriver driver = Driver.getDriver(ConfigurationReader.getProperty("browser"));
	LoginPage loginPage = new LoginPage(driver);
	NewCustomerPage newCustomer = new NewCustomerPage(driver);
	HomePage homePage = new HomePage(driver);

	@When("^I am on create new user page$")
	public void i_am_on_create_new_user_page() {
		homePage.newCustomerLink.click();
		assertTrue(newCustomer.addCustormerLabel.getText().equals("Add New Customer"), "Label is not correct");
	}

	@When("^I  enter \"([^\"]*)\" 	 value in name field$")
	public void i_enter_value_in_name_field(String name) {
	
		newCustomer.enterValue(newCustomer.customerName, name);
		
			
	}

	@When("^I press tab and move to next field$")
	public void i_press_tab_and_move_to_next_field() {
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		//newCustomer.customerName.sendKeys(Keys.TAB);
	}

	@Then("^Error message  \"([^\"]*)\"  should be displayed$")
	public void error_message_should_be_displayed(String message) {
		assertEquals(newCustomer.msgName.getText(),message);
	}
	
	@When("^I  enter \"([^\"]*)\" 	 value in city field$")
	public void i_enter_value_in_city_field(String city) {
	 
		newCustomer.enterValue(newCustomer.city, city);
	}
	
	@Then("^Error message in cityfield  \"([^\"]*)\"  should be displayed$")
	public void error_message_in_cityfield_should_be_displayed(String message) {
		assertEquals(newCustomer.msgCity.getText(),message);
	}

	
	
	@When("^I  enter \"([^\"]*)\" 	 value in state field$")
	public void i_enter_value_in_state_field(String state) {
	   
		newCustomer.enterValue(newCustomer.state, state);
		
		
	}
	
	@Then("^Error message in state \"([^\"]*)\"  should be displayed$")
	public void error_message_in_state_should_be_displayed(String message) {
		assertEquals(newCustomer.msgState.getText(),message);
	}

	
	@When("^I  enter \"([^\"]*)\" 	 value in pin field$")
	public void i_enter_value_in_pin_field(String pin) {
		newCustomer.enterValue(newCustomer.pin, pin);
	}

	@Then("^Error message in pin \"([^\"]*)\"  should be displayed$")
	public void error_message_in_pin_should_be_displayed(String message) {
		assertEquals(newCustomer.msgPin.getText(),message);
	}
	
	@When("^I  enter \"([^\"]*)\" 	 value in phone field$")
	public void i_enter_value_in_phone_field(String phone) {
		newCustomer.enterValue(newCustomer.telno, phone);
	}

	@Then("^Error message in phone \"([^\"]*)\"  should be displayed$")
	public void error_message_in_phone_should_be_displayed(String message) {
		assertEquals(newCustomer.msgPhone.getText(),message);
	}

	@When("^I  enter \"([^\"]*)\" value in email field$")
	public void i_enter_value_in_email_field(String email) {
		newCustomer.enterValue(newCustomer.email, email);
	}

	@Then("^Error message in email \"([^\"]*)\"  should be displayed$")
	public void error_message_in_email_should_be_displayed(String message) {
		assertEquals(newCustomer.msgEmail.getText(),message);
	}
}
