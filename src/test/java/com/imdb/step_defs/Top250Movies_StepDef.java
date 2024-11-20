package com.imdb.step_defs;

import com.imdb.pages.BasePage;
import com.imdb.pages.Top250MoviesPage;
import com.imdb.utilities.BrowserUtils;
import com.imdb.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Top250Movies_StepDef extends BasePage {
    Actions actions = new Actions(Driver.getDriver());
    Top250MoviesPage top250MoviesPage = new Top250MoviesPage();


    @Given("I am on the IMDb {string} page")
    public void iAmOnTheIMDbPage(String navigateTo) {

        clickMenuLink(navigateTo);
    }



    @When("I check the page title")
    public void i_check_the_page_title() {

    }
    @Then("the title should be {string}")
    public void the_title_should_be(String string) {

    }


    @When("I count the total number of movie entries")
    public void i_count_the_total_number_of_movie_entries() {

    }
    @Then("the total should be {int}")
    public void the_total_should_be(Integer int1) {

    }


    @When("I sort the list by {string} in ascending order")
    public void i_sort_the_list_by_in_ascending_order(String string) {

    }
    @Then("the first movie should be {string}")
    public void the_first_movie_should_be(String string) {

    }
    @Then("the second movie should be {string}")
    public void the_second_movie_should_be(String string) {

    }
    @Then("the last movie should match the lowest ranking movie")
    public void the_last_movie_should_match_the_lowest_ranking_movie() {

    }


    @When("I inspect the movie details for each entry")
    public void i_inspect_the_movie_details_for_each_entry() {

    }
    @Then("each movie should display:")
    public void each_movie_should_display(io.cucumber.datatable.DataTable dataTable) {

    }



    @Then("I should be redirected to the respective movie's details page")
    public void i_should_be_redirected_to_the_respective_movie_s_details_page() {

    }


    @When("I click the {string} icon to rate a movie")
    public void i_click_the_icon_to_rate_a_movie(String string) {

    }

    @Then("I should see a login prompt if I am not signed in")
    public void i_should_see_a_login_prompt_if_i_am_not_signed_in() {

    }




    @When("I apply a filter for {string}")
    public void i_apply_a_filter_for(String string) {

    }
    @Then("the results should only display movies with the genre {string}")
    public void the_results_should_only_display_movies_with_the_genre(String string) {

    }




    @When("I click a link in the {string} section")
    public void i_click_a_link_in_the_section(String string) {

    }
    @Then("I should be redirected to the corresponding chart or list")
    public void i_should_be_redirected_to_the_corresponding_chart_or_list() {

    }


    @Given("I am viewing the IMDb Top {int} Movies page on a mobile device")
    public void i_am_viewing_the_im_db_top_movies_page_on_a_mobile_device(Integer int1) {

    }
    @When("I resize the browser window")
    public void i_resize_the_browser_window() {

    }
    @Then("the layout should adjust to fit the screen size")
    public void the_layout_should_adjust_to_fit_the_screen_size() {

    }



    @When("I search for {string}")
    public void i_search_for(String string) {

    }
    @Then("the results should include {string}")
    public void the_results_should_include(String string) {

    }



    @Then("a sponsored ad should be visible on the right-hand side of the page")
    public void a_sponsored_ad_should_be_visible_on_the_right_hand_side_of_the_page() {

    }

    @When("I click on {string}")
    public void i_click_on(String string) {

    }
    @Then("I should be redirected to the IMDb login page")
    public void i_should_be_redirected_to_the_im_db_login_page() {

    }



    @Then("The user view detailed information about the movie")
    public void theUserViewDetailedInformationAboutTheMovie() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        top250MoviesPage.detailedView.click();

    }

    @Then("The user view Grid view about the movies")
    public void theUserViewGridViewAboutTheMovies() {
        top250MoviesPage.gridView.click();

    }

    @Then("The user view Compact view about the movies")
    public void theUserViewCompactViewAboutTheMovies() {
        top250MoviesPage.compactView.click();

    }



}
