@casestudy2
Feature: Case Study two
This is to test the login on TestMe app
Scenario Outline: Jenny can Login on TestMe
Given Jenny goes to TestMe
When Jenny gives valid "<username>" "<password>"
Then Jenny is able to view the page


Examples:
|username|password|
|Lalitha|Password123|