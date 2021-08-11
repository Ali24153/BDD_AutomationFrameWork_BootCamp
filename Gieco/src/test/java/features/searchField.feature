Feature: SearchBox Functionalities Check

  Scenario Outline: Check the search Box by using a valid services
    Given I am in Gieco Home Page
    And I click on the Searching Loop
    And I enter "<InsuranceName>" Name
    And I click on Search Button
    Then I should see "<ExpectedInsurance>" Displayed
    Examples:
      | InsuranceName        | ExpectedInsurance    |
      | MotorCycle Insurance | MotorCycle Insurance |
      | Car Insurance        | Car Insurance        |
      | Home Insurance       | Home Insurance       |

  Scenario Outline: Check the SearchBox By using non valid services
    Given I am in Gieco Home Page
    And I click on the Searching Loop
    And I enter "<NonValidInsuranceName>" in SearchBox

    And I click on Search Button
    Then I should see No Results Text Message
    Examples:
      | NonValidInsuranceName |
      | 43rdt                 |
      | 874687                |
      | tttttttttttt          |
      | $3*)(vckn             |

