Feature: Test Progressive LogIn functionalities

  Scenario: User is not able to log In with null User ID and null Password
    Given I am in Progressive Home Page
    And I click on LogIn Link
    And I click on LogIn Button
    Then I should see The login information you entered does not match our records. Please try again. text displayed

  Scenario: User is not able to log In with Correct User ID and null Password
    Given I am in Progressive Home Page
    And I click on LogIn Link
    And I enter a correct "Ali.Tadjedit@yahoo.com"
    And I click on LogIn Button
    Then I should see The login information you entered does not match our records. Please try again. text displayed

  Scenario: User is not able to log In with Correct User ID and Incorrect Password
    Given I am in Progressive Home Page
    And I click on LogIn Link
    And I enter a correct "Ali.Tadjedit@yahoo.com"
    And I enter wrong PassWord "abcd1234"
    And I click on LogIn Button
    Then I should see The login information you entered does not match our records. Please try again. text displayed

  Scenario: User is not able to log In with Incorrect User ID and correct Password
    Given I am in Progressive Home Page
    And I click on LogIn Link
    And I enter a incorrect "Demo@gmail.com"
    And I enter Correct PassWord "123abc"
    And I click on LogIn Button
    Then I should see The login information you entered does not match our records. Please try again. text displayed

  Scenario: User is not able to log In with Incorrect User ID and correct Password
    Given I am in Progressive Home Page
    And I click on LogIn Link
    And I enter a incorrect "Demo@gmail.com"
    And I enter Correct PassWord "123abc"
    And I click on LogIn Button
    Then I should see The login information you entered does not match our records. Please try again. text displayed