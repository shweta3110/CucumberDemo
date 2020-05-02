@casestudy3
Feature: Various scenario  case study
Background:
Given TestMeApp is logged in by Jenny
Scenario: Jenny is able to search the product
When Product is entered in the search box
Then she can view the product 
Scenario: Jenny is able to see the contact info 
When Jenny clicks on the About us option
Then info is visible
Scenario: Empty cart
When Jenny searches for Headphone 
And Jenny proceeds for payment without adding in the  cart
