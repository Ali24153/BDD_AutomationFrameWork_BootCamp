Feature: Check All the Buttons in Gieco Home Page

Background:
Given I am in Gieco Home Page


@SmokeTesting
  Scenario: Check The Start Quote Button
    And I click On Start Quote Button
    Then I should see "We need your date of birth." Text

@Ali
  Scenario:  Check the Auto button
     And I click on Auto button
    Then I should see "Auto" displayed in the left of the homepage

Scenario: Check The Renters Button
  And I click on Renters Button
  Then I should see "Renters" Text displayed in the left of the homepage

  Scenario: Check The Boat Button
    And I click on Boat Button
    Then I should see "Boat" Text displayed in  the homepage

  Scenario: Check on the HomeOwner Button
    And I click on HomeOwner Button
    Then I should see HomeOwner Text displayed in  the homepage





