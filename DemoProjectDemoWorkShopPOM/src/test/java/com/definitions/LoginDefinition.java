package com.definitions;

import org.testng.Assert;

import com.actions.LoginPageAction;
import com.utilities.HelperClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	LoginPageAction objLogin =new LoginPageAction();
	@Given("the user is on the DemoWebshop home page {string}")
	public void the_user_is_on_the_demo_webshop_home_page(String string) {
		HelperClass.openPage(string);
	}

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
    	objLogin.clickHomePageLogin();
    }

    @And("the user enters a valid email and password")
    public void the_user_enters_a_valid_email_and_password() {
    	objLogin.login();
    }

    @And("clicks the login button")
    public void clicks_the_login_button() {
    	objLogin.clickLogin();
    }

    @Then("the user should be logged into the DemoWebshop website")
    public void the_user_should_be_logged_into_the_DemoWebshop_website() {
    	Assert.assertTrue(objLogin.checkLoginSuccess(),"not logged in successfully");
        
    }
}
