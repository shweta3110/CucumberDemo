Feature: Case Study Two

This is to test the login on TestMe app


Scenario Outline: Alex can Login on TestMe
Given TestMe is open by Alex
When Alex gives valid "<username>" "<password>"
Then Alex is able to see home page 


Examples:
|username|password|
|AlexLee1|Password123|