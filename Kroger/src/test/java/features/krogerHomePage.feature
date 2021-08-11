Feature: Check the Kroger Search Box Functionalities displayed in the HomePage

  Scenario Outline: Check the Search Box Functionalities with Valid Products
    Given I am On Kroger HomePage
    And I enter A valid "<Product>" Name In the search box
    And I click On Searching Button
    Then I should see the Product name displayed as searched "<Result>"
    Examples:
      | Product  | Result           |
      | Milk     | Search: Milk     |
      | Apple    | Search: Apple    |
      | Juice    | Search: Juice    |
      | Tomatoes | Search: Tomatoes |
      | Water    | Search: Water    |
      | Yogurt   | Search: Yogurt   |
      | Flowers  | Search: Flowers  |


  Scenario Outline: Check the Search Box Functionalities with InValid Products
    Given I am On Kroger HomePage
    And I enter A Invalid "<Product>" Name In the search bon
    And I click On Searching Button
    Then I should see No results text displayed as searched "<Result>"
    Examples:
      | Product    | Result                    |
      | UFT        | There were no results for |
      | Automation | There were no results for |
      | Jira       | There were no results for |
      | Demo1      | There were no results for |
      | Analyst    | There were no results for |


