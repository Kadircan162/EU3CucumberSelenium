package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ContactsStepDefs {


    @Then("the user should see the following menuOptions")
    public void the_user_should_see_the_following_menuOptions(List<String> expectedMenuOptions) {
        System.out.println("menuOptions.size() = " + expectedMenuOptions.size());
        System.out.println("menuOptions = " + expectedMenuOptions);
        BrowserUtils.waitFor(3);
        List<String> actualMenuOptList = BrowserUtils.getElementsText(new DashboardPage().menuOptions);
        Assert.assertEquals(expectedMenuOptions, actualMenuOptList);
    }

    @When("the user logs in the following credentials")
    public void the_user_logs_in_the_following_credentials(Map<String, String> listOfCredentials) {
        System.out.println("listOfCredentials = " + listOfCredentials);
        new LoginPage().login(listOfCredentials.get("userName"), listOfCredentials.get("password"));
        BrowserUtils.waitFor(2);

    }

    @Then("verify the firstname and the lastname are correct")
    public void the_firstname_and_the_lastname_are_correct(Map<String, String> firstAndLastname) {
        String expectedUsername = firstAndLastname.get("firstName") + " " + firstAndLastname.get("lastName");
        System.out.println("expectedUsername = " + expectedUsername);

        BrowserUtils.waitFor(3);

        String actualUsername = new DashboardPage().getUserName();
        System.out.println("actualUsername = " + actualUsername);

        Assert.assertEquals(expectedUsername, actualUsername);

    }

    @Then("verify the {string} and the {string} are correct")
    public void verify_the_and_the_are_correct(String firstName, String lastName) {
        String expectedUsername = firstName + " " + lastName;
        System.out.println("expectedUsername = " + expectedUsername);
        String actualUsername = new DashboardPage().getUserName();
        System.out.println("actualUsername = " + actualUsername);

        Assert.assertEquals(expectedUsername, actualUsername);
    }
}
