Feature: Amazon Home page validation

  @amazon01
  Scenario: dropdown validation
    Given user navigates to amazon homepage
    When user extract the dropdown values
    And user select the dropdownvalue
    Then validate the dropdown vaues

  Scenario: Baby search result validations
    Given user navigates to amazon homepage
    When user select baby value from the dropdown and navigate to search page
    And sort the product and select the chepest product



