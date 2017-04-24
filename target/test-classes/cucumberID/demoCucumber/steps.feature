Feature: Login fail

Scenario Outline: Login failed
	Given User navigates to Facebook 
	When I enter username as "<nUser>"
	And I enter password as "<password>"
	And I click Login button
	Then Login should fail 
	Examples: Page titles 
	    | nUser      | password  |
		| firstUser  | password1 |
		| secondUser | password2 |
		| thirdUser  | password3 |
		| fourthUser | password4 |