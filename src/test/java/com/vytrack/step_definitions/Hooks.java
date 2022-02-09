package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from BeforeMethod");
    }

    @After
    public void tearDown(){
        System.out.println("\tThis is coming from AfterMethod");
    }

    @Before("@setupAndKill")
    public void setUpDb(){

    }

    @After("@setupAndKill")
    public void tearDownDb(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }
}
