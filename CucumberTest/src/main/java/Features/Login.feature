Feature: Local 13 Login Feature
 @SmokeTest @RegressionTest
 Scenario Outline: Local 13 Successful Login Scenario
    Given User is on Login Page
    When the title of Login page is Login
    And User enters "<username>" and "<Password>"
    And User Clicks on Login button
 	Then User is on Dashboard 	
 	Examples:
 	| username| Password |
 	| mgg     | mgg1105  |
 	
 @RegressionTest
 Scenario Outline: Local 13 Negative Login Scenario
    Given User is on Login Page
    When the title of Login page is Login
    And User enters "<username>" and "<Password>"
    And User Clicks on Login button
 	Then User is on Dashboard 	
 	Examples:
 	| username| Password |
 	| mgg     | mgg1101  |