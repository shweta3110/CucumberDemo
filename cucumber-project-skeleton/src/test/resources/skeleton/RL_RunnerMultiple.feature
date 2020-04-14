@DemoWebShop
Feature: Demo web shop login Multi Scenario
this is a test to show demos for  Multi Scenario
@TEST01
Scenario: Valid Login
Given demoWebshop site is opened by the test User
When Valid demo login password is provided by the test user
Then next page should be displayed with valid login ID
#@SanityTest
#Scenario: INValid Login
#When INValid demo login password is provided by the test user
#Then error message should be displayed for INvalid login
#@SanityTest
#Scenario: Blank Login
#When No login password is provided by the test user
#Then error message should be displayed for blank login
 