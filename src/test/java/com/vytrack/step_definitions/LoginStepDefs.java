package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() { //Pending (First step) when there is no definition
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() { //Skipped (Second step)  when there is no step definition
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() { //Skipped (third step) when there is no step definition
        DashboardPage dashboard = new DashboardPage();
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        String expectedTitle = "Dashboard";
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @When("the user login using {string} and {string}")
    public void the_user_login_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedPageTitle) {
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedPageTitle = " + expectedPageTitle);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(actualTitle.contains(expectedPageTitle));
    }

    @When("the user logs in as the user type > {string}")
    public void the_user_logs_in_as_the_user_type(String userType) {
        String username = ConfigurationReader.get(userType.toLowerCase().replaceAll(" ", "") + "_username");
        String password = ConfigurationReader.get(userType.toLowerCase().replaceAll(" ", "") + "_password");
        new LoginPage().login(username, password);
    }



}
