Feature: Amazon Home page validation

  @amazon01
  Scenario: dropdown validation
    Given user navigates to amazon homepage
    When user extract the dropdown values
    Then validate the dropdown vaues



