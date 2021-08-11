Feature: Check The functionality of teh search box displayed on mountCarmel home Page

  Scenario Outline: Check The searching Box with valid Keywords
    Given I am In Mount Carmel Health Home Page
    And  I enter Valid "<KeyWords>" in the search box
    And I click On search button
    Then I should see the right pagination displayed


    Examples:
      | KeyWords          |
      | Back Pain         |
      | Cardiologist      |
      | Primary Care      |
      | Family Medicine   |
      | Heart             |
      | Internal Medicine |
      | Neurologist       |
      | Psychiatry        |
      | Urogynecology     |
      | Pulmonology       |

  Scenario Outline: Check The searching Box with Invalid Keywords

    Given I am In Mount Carmel Health Home Page
    And  I enter Invalid "<KeyWords>" in the search box
    And I click On search button
    Then I should see No entries found as search result


    Examples:

      | KeyWords    |
      | SQL         |
      | MySQL       |
      | Java       |
      | 1234        |
      | ++++++      |
      | abcd123     |
      | ALM        |
      | UFT         |
      | Selenium    |
      | Jira |