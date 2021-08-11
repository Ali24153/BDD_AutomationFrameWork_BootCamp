Feature: Check Kroger Log In functionalities.

  Scenario: User Try to Log in with Null Email and Null Password.
    Given I am On Kroger HomePage
    And I click On Sign In Arrow on the right corner of Kroger homePage
    And Click on sign In button Under Sign In Arrow
    And I click on sign In Button
    Then I should see an error message saying please enter a valid Email Address

  Scenario: User Try to Log in with Incorrect Email and Null Password.
    Given I am On Kroger HomePage
    And I click On Sign In Arrow on the right corner of Kroger homePage
    And Click on sign In button Under Sign In Arrow
    And I enter a wrong Email Address
    |Email|
    | Demo@yahoo.com    |
    And I click on sign In Button
    Then I should see an error message saying please enter a valid Email Address

  Scenario: User Try to Log in with Correct Email and Null Password.
    Given I am On Kroger HomePage
    And I click On Sign In Arrow on the right corner of Kroger homePage
    And Click on sign In button Under Sign In Arrow
    And I enter a Correct Email Address
      |Email|
      | Ali.Tadjedit@yahoo.com    |
    And I click on sign In Button
    Then I should see an error message saying please enter a valid Email Address

  Scenario: User Try to Log in with Correct Email and wrong Password.
    Given I am On Kroger HomePage
    And I click On Sign In Arrow on the right corner of Kroger homePage
    And Click on sign In button Under Sign In Arrow
    And I enter a Correct Email Address
      |Email|
      | Ali.Tadjedit@yahoo.com    |
    And I enter wrong password
    |password|
    |abcd1234|
    And I click on sign In Button
    Then I should see an error message saying please enter a valid password

  Scenario: User Try to Log in with Correct Email and Correct Password.
    Given I am On Kroger HomePage
    And I click On Sign In Arrow on the right corner of Kroger homePage
    And Click on sign In button Under Sign In Arrow
    And I enter a Correct Email Address
      |Email|
      | Ali.Tadjedit@yahoo.com    |
    And I enter Correct password
      |password|
      |1234abcd|
    And I click on sign In Button


  Scenario: User Try to Log in with InCorrect Email and Correct Password.
    Given I am On Kroger HomePage
    And I click On Sign In Arrow on the right corner of Kroger homePage
    And Click on sign In button Under Sign In Arrow
    And I enter a wrong Email Address
      |Email|
      | demo@yahoo.com    |
    And I enter Correct password
      |password|
      |1234abcd|
    And I click on sign In Button
    Then I should see an error message saying please enter a valid Email Address

  Scenario: User Try to Log in with InCorrect Email and InCorrect Password.
    Given I am On Kroger HomePage
    And I click On Sign In Arrow on the right corner of Kroger homePage
    And Click on sign In button Under Sign In Arrow
    And I enter a wrong Email Address
      |Email|
      | demo@yahoo.com    |
    And I enter Correct password
      |password|
      |abcd1234|
    And I click on sign In Button
    Then I should see an error message saying please enter a valid Email Address
