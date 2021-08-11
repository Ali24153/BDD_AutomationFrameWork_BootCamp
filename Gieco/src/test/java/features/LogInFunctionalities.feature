Feature: check the LogIn functionalities

  Background:
    Given I am in Gieco Home Page
    And click on Log In button in the HomePage


  Scenario: User can not login with Null User Id and Null Password
    And click on LogIn button in the LoginPage
    Then I should see Please enter your password.

  Scenario: User can not logIn by Only providing email
    And I enter UserId in UserId field
      | Ali.Tadjedit@gamil.com |

    Then I click On login Button found  in The LogIn page
    Then I should see LogIn Error Message

  Scenario:  User can not logIn by providing correct email and wrong passWord
    And I enter UserId in UserId field
      | Ali.Tadjedit@gamil.com |
    And I enter PassWord is PassWord Field
      | PassWord |
      | abcd1234 |
    Then I click On login Button found  in The LogIn page
    Then I should see LogIn Error Message

    Scenario: User Can not LogIn by Wrong email and  Wrong Password
      And I enter UserId in UserId field
        | User1@gamil.com |
      And I enter PassWord is PassWord Field
        | PassWord |
        | abcd1234 |
      Then I click On login Button found  in The LogIn page
      Then I should see LogIn Error Message

      Scenario: User Can not LogIn by using Correct Password and Wrong Email
        And I enter UserId in UserId field
          | User1@gamil.com |
        And I enter PassWord is PassWord Field
          | PassWord |
          |1234abcd |
        Then I click On login Button found  in The LogIn page
        Then I should see Error Message

