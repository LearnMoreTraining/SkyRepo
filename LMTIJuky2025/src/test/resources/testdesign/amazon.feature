Feature: Amazon Home page validation

  @amazon01
  Scenario: dropdown validation
    Given user navigates to amazon homepage
    When user extract the dropdown values
    And user select the dropdownvalue
    Then validate the dropdown vaues



