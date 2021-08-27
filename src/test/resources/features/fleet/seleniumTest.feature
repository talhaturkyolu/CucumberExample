@LoginAs
Feature: LoginAs

  Scenario:Login with valid credentials
    Given user is on the login page
    And user enters password and username with valid credentials
    And user should verify the title is on "Amazon.com:Online Shopping"