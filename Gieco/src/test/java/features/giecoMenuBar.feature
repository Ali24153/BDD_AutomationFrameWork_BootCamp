Feature: Check The Gieco Menu Bar founded in Home Page

  Background:
    Given I am in Gieco Home Page


  Scenario: Check Auto insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on Auto Link
    Then I should see Car Insurance displayed On the Page

  Scenario: Check Motorcycle insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on MotorCycle Link
    Then I should see MotorCycle Insurance displayed On the Page

  Scenario: Check ATV insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on ATV Link
    Then I should see ATV Insurance displayed On the Page

  Scenario: Check RV insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on RV Link
    Then I should see RV Insurance displayed On the Page

  Scenario: Check Boat/PWC insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on Boat/PWC Link
    Then I should see Boat/PWC Insurance displayed On the Page

  Scenario: Check Collector Auto insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on Collector Auto Link
    Then I should see Collector Auto Insurance displayed On the Page

  Scenario: Check Collector Rideshare insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on Rideshare Link
    Then I should see Rideshare Insurance displayed On the Page

  Scenario: Check Collector Commercial Auto insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Insurance Panel
    And I chose Vehicle Insurance Panel
    Then I click on Commercial Auto Link
    Then I should see Commercial Auto Insurance displayed On the Page

  Scenario: Check Add A Vehicle Auto insurance Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Information  Panel
    And I chose My Account Panel
    Then I click on Add A Vehicle Link
    Then I should see Add or Replace a Vehicle displayed

  Scenario: Check Make a Payment Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Information  Panel
    And I chose My Account Panel
    Then I click on Make a Payment Link
    Then I should see Pay with GEICO Express Services displayed

  Scenario: Check Go Paperless Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Information  Panel
    And I chose My Account Panel
    Then I click on Go Paperless Link
    Then I should see Save paper and simplify your life displayed
@RegressionTesting
  Scenario: Check Contact Us  Link under Gieco Menu Bar
    And I click on Menu Button
    And  I click On Information  Panel
    And I scroll down until visible
    And I chose Contact Us Panel
    Then I should see What do you need help with today? displayed
