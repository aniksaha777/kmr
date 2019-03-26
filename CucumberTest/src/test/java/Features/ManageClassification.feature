Feature: Local 13 Manage Classification
 @SmokeTest
 Scenario: Manage Classification - Create Classification
    Given The User is logged in
    When User is on Apps Builder Create Classification Page
    And  the user enters valid data and clicks on Submit
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Apprentice | BTAB1 | Building Trade Apprentice Pipefitter | AB12 | 33.70 |
    Then new classification is displayed in grid 
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Apprentice | BTAB1 | Building Trade Apprentice Pipefitter | AB12 | 33.70 |
	    