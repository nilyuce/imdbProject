@Top250
Feature: IMDb Top 250 Movies

  Background: User login to the IMDB website
    When The user login to the IMDB website
    Then The user press to Menu Icon

  Scenario: Check the page title
    Given I am on the IMDb "Top 250 Movies" page
    When I check the page title
    Then the title should be "IMDb Top 250 Movies"

  Scenario: Validate the number of movies listed
    Given I am on the IMDb "Top 250 Movies" page
    When I count the total number of movie entries
    Then the total should be 250

  Scenario: Validate sort options
    Given I am on the IMDb "Top 250 Movies" page
    When I sort the list by "Ranking" in ascending order
    Then the first movie should be "The Shawshank Redemption"
    And the second movie should be "The Godfather"
    And the last movie should match the lowest ranking movie

  Scenario: Validate movie details in the list
    Given I am on the IMDb "Top 250 Movies" page
    When I inspect the movie details for each entry
    Then each movie should display:
      | Title | Release Year | Duration | IMDb Rating |

  Scenario: Verify movie links
    Given I am on the IMDb "Top 250 Movies" page
    When I click on a movie title
    Then I should be redirected to the respective movie's details page


  Scenario: Check user rating functionality
    Given I am on the IMDb "Top 250 Movies" page
    When I click the "+" icon to rate a movie
    Then I should see a login prompt if I am not signed in

  Scenario: Validate genre filter
    Given I am on the IMDb "Top 250 Movies" page
    When I apply a filter for "Drama"
    Then the results should only display movies with the genre "Drama"

  Scenario: Validate 'More to Explore' section
    Given I am on the IMDb "Top 250 Movies" page
    When I click a link in the "More to Explore" section
    Then I should be redirected to the corresponding chart or list


  Scenario: Test search functionality
    Given I am on the IMDb "Top 250 Movies" page
    When I search for "The Dark Knight"
    Then the results should include "The Dark Knight (2008)"

  Scenario: Ensure sponsored advertisement is displayed
    Given I am on the IMDb "Top 250 Movies" page
    Then a sponsored ad should be visible on the right-hand side of the page


  Scenario: Validate sign-in option
    Given I am on the IMDb "Top 250 Movies" page
    When I click on "Sign In"
    Then I should be redirected to the IMDb login page


  Scenario: User detailed view of the top 250 Movies
    Given I am on the IMDb "Top 250 Movies" page
    Then The user view detailed information about the movie
    Then The user view Grid view about the movies
    Then The user view Compact view about the movies




