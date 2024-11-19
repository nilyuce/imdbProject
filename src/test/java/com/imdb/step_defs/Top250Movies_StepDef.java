package com.imdb.step_defs;

import com.imdb.pages.BasePage;
import com.imdb.pages.Top250MoviesPage;
import com.imdb.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Top250Movies_StepDef extends BasePage {

    Top250MoviesPage top250MoviesPage = new Top250MoviesPage();

    @When("The user navigate to the Top 250 Movies page")
    public void navigateToTop250MoviesPage() {
        top250MoviesLink.click();
    }


    @Then("The user view detailed information about the movie")
    public void theUserViewDetailedInformationAboutTheMovie() {
        top250MoviesPage.detailedView.click();

    }
}
