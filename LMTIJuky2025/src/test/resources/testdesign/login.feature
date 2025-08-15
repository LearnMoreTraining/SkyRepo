@hello
Feature: Login Validations

  @TestID01  @abc
  Scenario: error message validation
    Given user navigates to the login page of salesforce application
    When user enter the user name "ram" and password "123"
    And user clicks the login button
    Then user validate the error message "Error: check your username and password. If you still can't log in, contact your Salesforce administrator."

   @TestID02 @regession
  Scenario: login validation
    Given user navigates to the login page of salesforce application
    When user enter the user name "aravinth" and password "xyz"
    And user clicks the login button
    Then user should navigate to homepage

  @TestID03   @smoke
  Scenario Outline: error message validation
    Given user navigates to the login page of salesforce application
    When user enter the user name "<UserName>" and password "<Password>"
    And user clicks the login button
    Then user validate the error message
    Examples:
      | UserName | Password |
      | aravinth | 123      |
      | Ram      | abc      |
      | Mango    | 678      |
