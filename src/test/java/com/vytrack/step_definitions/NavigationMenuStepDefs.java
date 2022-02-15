package com.vytrack.step_definitions;

import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet, Vehicle page")
    public void the_user_navigates_to_Fleet_Vehicle_page() {
        System.out.println("The user navigates to Fleet > Vehicle page");
    }

    @Then("the title should be Vehicles")
    public void the_title_should_be_Vehicles() {
        System.out.println("The title is Vehicles");
    }

    @When("the user navigates to Marketing, Campaigns page")
    public void the_user_navigates_to_Marketing_Campaigns_page() {
        System.out.println("The user navigates to Marketing > Campaigns page");

    }

    @Then("the title should be Campaigns")
    public void the_title_should_be_Campaigns() {
        System.out.println("The title is Campaigns");

    }

    @When("the user navigates to Activities, Calendar Events page")
    public void the_user_navigates_to_Activities_Calendar_Events_page() {
        System.out.println("The user navigates to Activities > Calendar Events page");

    }

    @Then("the title should be Calendar Events")
    public void the_title_should_be_Calendar_Events() {
        System.out.println("The title is Events");

    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new DashboardPage().navigateToModule(tab,module);
        BrowserUtils.waitFor(2);
    }

    @Then("the page number is {int}")
    public void the_page_number_is(Integer expectedPageNumber) {
        BrowserUtils.waitFor(4);
        String actualPageNumber = new ContactsPage().pageNumber.getAttribute("value");
        Assert.assertEquals(expectedPageNumber, Integer.valueOf(actualPageNumber));
    }

    @Then("the subtitle is {string}")
    public void the_subtitle_is(String expectedPageSubtitle) {
        String actualPageSubTitle = new CalendarEventsPage().getPageSubTitle();
        System.out.println("actualPageSubTitle = " + actualPageSubTitle);
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedPageSubtitle, actualPageSubTitle);
    }




}
