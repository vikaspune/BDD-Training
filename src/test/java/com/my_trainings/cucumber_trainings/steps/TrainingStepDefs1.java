package com.my_trainings.cucumber_trainings.steps;

import java.util.List;

import org.junit.Assert;

import com.my_trainings.cucumber_trainings.User;
import com.my_trainings.cucumber_trainings.UserEnums;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrainingStepDefs1 {
	@Given("^The user is on the login page$")
	public void the_user_is_on_the_login_page() throws Throwable {
		System.out.println("Opening Login Page");
	}

	@When("^The user enters username as \"([^\"]*)\"$")
	public void the_user_enters_username_as(String username) throws Throwable {
		System.out.println("Entering username as: " + username);
		// Assert.fail("Intentional failure");
	}

	@When("^The user enters password as \"([^\"]*)\"$")
	public void the_user_enters_password_as(String password) throws Throwable {
		System.out.println("Entering password as: " + password);
	}

	@Then("^The user should be able to navigate to the HomePage$")
	public void the_user_should_be_able_to_navigate_to_the_HomePage() throws Throwable {
		System.out.println("I am on the Home Page");
	}

	@When("^The \"([^\"]*)\" logs in with \"([^\"]*)\"$")
	public void the_logs_in_with(String userType, String credentialType) throws Throwable {
		User user = UserEnums.valueOf(userType).getData();
	}

	@Then("^The user should be able to validate the following$")
	public void the_user_should_be_able_to_validate_the_following(List<String> arg1) throws Throwable {

	}
}
