Feature: Check LogIn functionalities For Mount Carmel Hospital HomePage.

  Scenario: User Can Not Log In with Null User Id and Null Password
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I Click On Sign In Button
    Then I should see the same Text Before click In On Sign In Button


  Scenario: User Can Not Log In with correct User Id and Null Password
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I enter a correct UserID
      | User ID                |
      | ali.tadjedit@yahoo.com |
    And I Click On Sign In Button
    Then I should see the Login Fail Text

  Scenario: User Can Not Log In with Incorrect User Id and Null Password
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I enter a Incorrect UserID
      | User ID                |
      | ademo@yahoo.com |
    And I Click On Sign In Button
    Then I should see the Login Fail Text

  Scenario: User Can Not Log In with Null  User Id and incorrect PassWord
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I enter a correct Password
    |Password|
    |abcd1234|
    And I Click On Sign In Button
    Then I should see the same Text Before click In On Sign In Button

  Scenario: User Can Not Log In with Null  User Id and Correct PassWord
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I enter a Incorrect Password
      |Password1|
      |1234abcd|
    And I Click On Sign In Button
    Then I should see the same Text Before click In On Sign In Button

  Scenario: User Can Not Log In with Null  Incorrect User Id and Correct PassWord
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I enter a Incorrect UserID
    |User Id |
    |demo@yahoo.com|
    And I enter a correct Password
      |Password1|
      |1234abcd|
    And I Click On Sign In Button
    Then I should see the Login Fail Text

  Scenario: User Can Not Log In with Null  Incorrect User Id and Incorrect PassWord
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I enter a Incorrect UserID
      |User Id |
      |demo@yahoo.com|
    And I enter a Incorrect Password
      |Password1|
      |1234abcd|
    And I Click On Sign In Button
    Then I should see the Login Fail Text

  Scenario: User Can Not Log In with Null  correct User Id and correct PassWord
    Given I am In Mount Carmel Health Home Page
    And I click On Log In Into My Account Button
    Then I should See Welcome To My Health
    And I enter a correct UserID
      |User Id |
      |Ali.tadjedit@yahoo.com|
    And I enter a correct Password
      |Password1|
      |abcd1234|
    And I Click On Sign In Button
    Then I should see the Login Fail Text