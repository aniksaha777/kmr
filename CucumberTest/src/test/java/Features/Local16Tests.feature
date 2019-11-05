Feature: Test Local 16 Member Section
Description: The Purpose of this tests is to Test the Member Section of Local 16
Background: User is Logged In
 Given I navigate to the login page
 |URL|

 When I submit username and password 
 |username|password|
 And I Click on Login
 Then I should be logged in
 
@SmokeTest @Today
 Scenario: Manage Member
    Given User is in Manage Member Page
    When User checks the International Initiation Date
    Then the same date should be displayed in Member details 