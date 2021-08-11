Feature: Test All The Buttons Displayed on MountCarmel Home Page

  Scenario Outline: Patients should be able to find A doctor By Clicking on Find A doctor Button and entering A valid KeyWord

    Given I am In Mount Carmel Health Home Page
    And I click on Find A Doctor Button
    And I enter A "<Speciality>" On the search Field
    And I click On the Searching Loop
    Then I should see the "<ExpectedResults>" which is  Doctors names Specialized on the searched KeyWord displayed
    Examples:
      | Speciality | ExpectedResults      |
      | Heart      | Cardiology           |
      | Diabetes   | Family Doctor        |
      | Back Pain  | Neurological Surgery |
      | Cancer     | Pulmonary Medicine   |
      | Migraine   | Pain Medicine        |

  Scenario Outline:  Patients should Not le to find A doctor By Clicking on Find A doctor Button and entering A Non Valid Keyword
    Given I am In Mount Carmel Health Home Page
    And I click on Find A Doctor Button
    And I enter A Non Valid "<KeyWord>"
    And I click On the Searching Loop
    Then Patient Should see Zero Doctors & Providers Found
    Examples:
      | KeyWord  |
      | Demo     |
      | abcd1234 |
      | $5&*()   |
      | 4646467  |
      | java     |

    Scenario: Patient should be able to pay their bill online by clicking on Pay My Bill Button
      Given I am In Mount Carmel Health Home Page
      And I click on Pay My Bill Button
      Then The Page Title should be Billing & Insurance, Mount Carmel Health, Columbus, OH

      Scenario: Patient should be able to find his medical Record by clicking on Access My Medical Records button
        Given I am In Mount Carmel Health Home Page
        And I click on Access My Medical Records Button
        Then I should see Medical Records Text Displayed

  Scenario: Patient should be able to get an estimate by clicking on
    Given I am In Mount Carmel Health Home Page
    And I click on get an estimate  Button
    Then I should see Price Estimates & Lists Text Displayed