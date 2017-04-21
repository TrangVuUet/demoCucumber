Feature: annotation 
#This is how background can be used to eliminate duplicate steps 

Scenario: Login failed
	Given User navigates to Facebook 
	When I enter username as "user01" 
	And I enter password as "123456" 
	And I click Login button
	Then Login should fail 
	
	
Scenario: reLogin
	Given User navigates to Facebook 
	When I enter username as "user02" 
	And I enter password as "123456" 
	And I click Login button 
	Then Relogin option should be available
	Then Login should fail 