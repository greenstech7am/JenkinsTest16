
@Cricket
Feature: Validate forgotten password functionality
Scenario: Validate the forgotten password with invalid mobile number
Given User should launch the chrome and load the url and maximize
When User should click the forgotten password link
And User should type the invalid mobile number
And User should click the search button
Then User should navigate to password reset page




