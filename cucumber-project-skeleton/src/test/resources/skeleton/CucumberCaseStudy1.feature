
Feature: Registration
Scenario Outline: Jenny can register on TestMe
Given Jenny opens TestMe app
When Jenny enters the correct info "<uname>" "<fname>" "<lname>" "<pass>" "<cpass>" "<gender>" "<email>" "<mobile>" "<dob>" "<address>" "<squestion>" "<answer>"
Then Jennyis registerd succesfully 

Examples: 
|uname|fname|lname|pass|cpass|gender|email|mobile|dob|address|squestion|answer| 
|JennyLee1|Jenny|Lee|Password123|Password123|Female|jennylee@xyz.com|9876543210|01/01/1996|Pune|What is your Birth Place?|Pune|