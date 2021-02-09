package com.myapp.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

    @Given("user is on landing page")
    public void user_is_on_landing_page() {
        System.out.println("User is on landing page");
    }

    @When("user enters credentials")
    public void user_enters_credentials() {
        System.out.println("User enters valid credentials");
    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println("User clicks the right button");
    }

    @Then("user suppose to see welcome message")
    public void user_suppose_to_see_welcome_message() {
        System.out.println("User sees the welcome message");
    }
}
