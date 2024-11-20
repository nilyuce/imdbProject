package com.imdb.step_defs;

import com.imdb.pages.BasePage;
import com.imdb.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class topBoxOffice_StepDef extends BasePage{

	@Then("The user navigate to the TopBoxOffice page")
	public void theUserNavigateToTheTopBoxOfficePage() {

		clickMenuLink("Top Box Office");

	}

	@Then("the page title should be {string}")
	public void the_page_title_should_be(String string) {

	}
	@Then("the main heading should be {string}")
	public void the_main_heading_should_be(String string) {

	}
	@Then("I should see a list of movies with at least {int} titles")
	public void i_should_see_a_list_of_movies_with_at_least_titles(Integer int1) {

	}
	@Then("each movie should display the following:")
	public void each_movie_should_display_the_following(io.cucumber.datatable.DataTable dataTable) {

	}
	@When("I interact with the {string} dropdown")
	public void i_interact_with_the_dropdown(String string) {

	}
	@Then("I should see options like {string}, {string}, and {string}")
	public void i_should_see_options_like_and(String string, String string2, String string3) {

	}
	@Then("the list should update correctly based on the selected sort option")
	public void the_list_should_update_correctly_based_on_the_selected_sort_option() {

	}
	@When("I click the {string} button for a movie")
	public void i_click_the_button_for_a_movie(String string) {

	}
	@Then("I should be able to provide a rating")
	public void i_should_be_able_to_provide_a_rating() {

	}
	@Then("my rating should be saved and reflected on the page")
	public void my_rating_should_be_saved_and_reflected_on_the_page() {

	}
	@When("I click on a movie title")
	public void i_click_on_a_movie_title() {

	}
	@Then("I should be navigated to the movie's detail page")
	public void i_should_be_navigated_to_the_movie_s_detail_page() {

	}
	@Then("the page title should contain the movie name")
	public void the_page_title_should_contain_the_movie_name() {

	}
	@Given("I see a list of movies with at least {int} titles")
	public void i_see_a_list_of_movies_with_at_least_titles(Integer int1) {

	}
	@When("I click the {string} button")
	public void i_click_the_button(String string) {

	}
	@Then("I should see the next set of movies in the list")
	public void i_should_see_the_next_set_of_movies_in_the_list() {

	}
	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {

	}
	@Then("I should be navigated to the {string} page")
	public void i_should_be_navigated_to_the_page(String string) {

	}
	@When("I check the {string} checkbox")
	public void i_check_the_checkbox(String string) {

	}
	@Then("movies I have rated should be hidden from the list")
	public void movies_i_have_rated_should_be_hidden_from_the_list() {

	}
	@Then("the total number of displayed movies should decrease accordingly")
	public void the_total_number_of_displayed_movies_should_decrease_accordingly() {

	}

	@When("I resize the browser window to different dimensions")
	public void i_resize_the_browser_window_to_different_dimensions() {

	}
	@Then("the layout of the page should adjust correctly")
	public void the_layout_of_the_page_should_adjust_correctly() {

	}
	@Then("all elements should remain visible and functional")
	public void all_elements_should_remain_visible_and_functional() {

	}
}
