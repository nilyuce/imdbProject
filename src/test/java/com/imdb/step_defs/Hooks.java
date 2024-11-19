package com.imdb.step_defs;

import com.imdb.utilities.ConfigurationReader;
import com.imdb.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before(order = 1)
    public void setupMethod() {
        System.out.println("Executing setup before scenario...");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @After(order = 1)
    public void teardownMethod(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Scenario failed. Capturing screenshot...");
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot of failure: " + scenario.getName());
        }
        Driver.closeDriver();
    }



}
