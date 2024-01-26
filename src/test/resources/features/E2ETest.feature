@wip
Feature: End-to-End Shopping Scenario


  Scenario: User completes an end-to-end shopping process
    Given User is on the Saucedemo login page
    When User logs in with valid credentials
    Then User should be able to see "Products"
    And User sorts products from high to low
    And User adds at least two items to the cart "Sauce Labs Backpack" and "Sauce Labs Bike Light"
    Then Basket shows the correct number of products "2"
    And User navigates to the cart page
    Then Right items are added to the cart "Sauce Labs Backpack" and "Sauce Labs Bike Light"
    And User goes to the checkout page and fills the form
    And User clicks continue to go to the "Checkout: Overview" page
    And User clicks finish
    Then Success shopping message is displayed "Thank you for your order!"