@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "dananjoyoh@yahoo.com" on backoffice login page
    And User input password "dananjoyoh" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And user click create category
    And user input random category name
    And user click save on category page
    Then user see random category name on category list

