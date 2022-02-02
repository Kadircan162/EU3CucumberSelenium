package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() { //Pending (First step) when there is no definition
        System.out.println("I open browser and navigate the login page");
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() { //Skipped (Second step)  when there is no step definition
        System.out.println("I enter the credentials for driver");

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() { //Skipped (third step) when there is no step definition
        System.out.println("As a driver, I logged in and verified the title changed to dashboard");

    }
}
