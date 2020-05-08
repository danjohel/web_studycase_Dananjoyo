@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "dananjoyoh@yahoo.com" on backoffice login page
    And User input password "dananjoyoh" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    And user click on create item
    And user input random food name
    And user input "15000" on price
    And user click save on item library page
    Then user see random item name in item library page