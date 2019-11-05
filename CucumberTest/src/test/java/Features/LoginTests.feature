Feature: Login Test Feature
Description: This test is to ensure that login is okay.
@Login
Scenario: Login to Local
Given The user is on login page
When The user enters userid and password from "C:\Users\SAMMSALAPTOP1\Desktop\automation_kmr\LoginData.xlsx"
|username|password|
|mgg|sammsa@123|
And Clicks on Submit to Login
Then The User is logged in to Dues System
