Feature: Login fail

Scenario: Login failed
	Given User go to Facebook 
	When I enter username as "firstUser"
	And I enter password as "password"
	And I click Login button
	Then Login should fail 
	