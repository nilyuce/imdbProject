package com.imdb.step_defs;

import com.imdb.pages.BasePage;
import com.imdb.pages.Top250MoviesPage;
import com.imdb.utilities.BrowserUtils;
import com.imdb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Top250Movies_StepDef extends BasePage {
    Actions actions = new Actions(Driver.getDriver());
    Top250MoviesPage top250MoviesPage = new Top250MoviesPage();

    @When("The user navigate to the Top 250 Movies page")
    public void navigateToTop250MoviesPage() {
        top250MoviesLink.click();
    }


    @Then("The user view detailed information about the movie")
    public void theUserViewDetailedInformationAboutTheMovie() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        top250MoviesPage.detailedView.click();



    }
}
