@SmokeTest @BasicText
Feature: Basic Syntax
  @Scenario1
  Scenario: This is first Scenario
    Given the user is on TS Home page
    When the user click on About us Link
    Then user are redirected to the About page
    Then close the browser
