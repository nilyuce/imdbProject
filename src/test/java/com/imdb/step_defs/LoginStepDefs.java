package com.imdb.step_defs;

import com.imdb.pages.BasePage;
import com.imdb.utilities.BrowserUtils;
import com.imdb.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;

public class LoginStepDefs extends BasePage  {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    @When("The user login to the IMDB website")
    public void the_user_login_to_the_imdb_website() {

        wait.until(ExpectedConditions.visibilityOf(loginCookieAccept)).click();


    }

    @Then("The user press to Menu Icon")
    public void the_user_press_to_Menu_Icon() {
        menuIcon.click();
    }


}
