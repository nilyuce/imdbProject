@topBoxOffice
Feature: IMDb Top Box Office Page Testing
  As a movie enthusiast
  I want to interact with the Top Box Office page
  So that I can verify its content and functionality

  Background: User login to the IMDB website
    When The user login to the IMDB website
    Then The user press to Menu Icon
    Then The user navigate to the TopBoxOffice page

  @active
  Scenario: Verify page title and main heading
    Then the page title should be "IMDb Charts: Top Box Office (US)"
    And the main heading should be "Top Box Office (US)"

  Scenario: Verify list of movies is displayed
    Then I should see a list of movies with at least 10 titles
    And each movie should display the following:
      | Element         | Description                                  |
      | Title           | The movie's title is displayed               |
      | Weekend Gross   | The weekend gross revenue is displayed       |
      | Total Gross     | The total gross revenue is displayed         |
      | Weeks Released  | The number of weeks released is displayed    |
      | IMDb Rating     | The IMDb rating is displayed                 |

  Scenario: Verify sorting options
    When I interact with the "sort by" dropdown
    Then I should see options like "Weekend Gross", "Total Gross", and "Weeks Released"
    And the list should update correctly based on the selected sort option

  Scenario: Verify rating functionality
    When I click the "Rate" button for a movie
    Then I should be able to provide a rating
    And my rating should be saved and reflected on the page

  Scenario: Verify movie details navigation
    When I click on a movie title
    Then I should be navigated to the movie's detail page
    And the page title should contain the movie name

  Scenario: Verify pagination (if applicable)
    Given I see a list of movies with at least 10 titles
    When I click the "Next" button
    Then I should see the next set of movies in the list

  Scenario: Verify "More to explore" links
    When I click on the "Most Popular Movies" link
    Then I should be navigated to the "Most Popular Movies" page

  Scenario: Verify "You have rated" checkbox
    When I check the "Hide titles you've rated" checkbox
    Then movies I have rated should be hidden from the list
    And the total number of displayed movies should decrease accordingly

  Scenario: Verify responsiveness and layout
    When I resize the browser window to different dimensions
    Then the layout of the page should adjust correctly
    And all elements should remain visible and functional