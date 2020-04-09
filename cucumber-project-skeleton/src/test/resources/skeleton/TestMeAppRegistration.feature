Feature: TestMeApp Registration 

@Registration
Scenario: Register to testmeapp 
	Given user should be on sign up page 
	When user enters username "Shwe123" 
	And user enters firstname "Shwe" 
	And user enters lastname "p" 
	And user enters password "shwe123" 
	And user  re-enters password "shwe123" 
	And user selects gender as Female
	And user enters emailid "shweta123@gmail.com" 
	And user enters mobilenumber "9916265362" 
	And user enters DOB "04/12/1996" 
	And user enters address "Mumbai" 
	And user selects security question 
	And user enters the answer "pink" 
	And user clicks register 
	Then user should be on login page 
	