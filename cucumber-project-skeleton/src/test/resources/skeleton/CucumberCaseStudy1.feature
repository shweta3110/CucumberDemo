
Feature: Registration
Scenario Outline: Jenny can register on TestMe
Given Jenny opens the TestMe app url
When Jenny fills the required fields"<uname>" "<fname>" "<lname>" "<pass>" "<cpass>" "<gender>" "<email>" "<mobile>" "<dob>" "<address>" "<squestion>" "<answer>"
Then Jenny is a registered user

Examples: 
|uname|fname|lname|pass|cpass|gender|email|mobile|dob|address|squestion|answer| 
|JennyFrank2222|Jenny|Frank|Password123|Password123|Female|jennyf@xyz.com|0123456789|01/10/1996|abcdefgh,xyz|What is your Birth Place?|Kolhapur|