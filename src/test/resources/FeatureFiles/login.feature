
@Regression
Feature: To Validate login Functionality of my facebook page
Background:
Given User should launch the chrome and load the url and maximize

@Smoke
Scenario: Verify the login functionality with invalid username and invalid password
When User should type the invalid username and invalid passworD
								# 2D Map
								|user|course|fruits|cricket|
								|vimal|java|apple|jadeja|
								|ajay|selenium|grapes|Rayudu|
								|kumar|oracle|green apple|Raina|
						
                       
                       
And User should click the login button 

Then User should navigate to incorrect credential page and close the browser

@Sanity
Scenario: Verify with valid username and invalid password
When User should type valid username and invalid password
And User should click the login button 
Then User should navigate to incorrect credential page and close the browser

@Sanity @Cricket
Scenario Outline: Verify with invalid username and valid password
When User should type the invalid username "<user>" and valid password "<pass>"
And User should click the login button 
Then User should navigate to incorrect credential page and close the browser

Examples:
			|user|pass|
			|selenium|selenium@123|



