@Web @Modifiers
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "dananjoyoh@yahoo.com" on backoffice login page
    And User input password "dananjoyoh" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click on create modifier button
    When User input random modifier name
    And User click on add or manage options
    And User click on add options
    And User input "Saos" in option name
    And User input "1500" in option price
    And User click save button on add options
    And User click save button on modifier page
    Then User see random modifier name in modifiers list