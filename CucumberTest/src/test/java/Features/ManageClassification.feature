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
 
 @SmokeTest
 Scenario: Manage Classification - Edit Classification
    Given The User is logged in
    When User is on Apps Builder Edit Classification Page
    And  User selects classification and clicks on Edit
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Apprentice | BTAB1 | Building Trade Apprentice Pipefitter | AB12 | 33.70 |
    And User Edits classification data and clicks on Submit
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Journeyman | BTAB2 | Building Trade Apprentice Plumber | AB12 | 21.56 |    
    Then new classification is displayed in grid 
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Journeyman | BTAB2 | Building Trade Apprentice Plumber | AB12 | 21.56 |   
    
    
 @SmokeTest
 Scenario: Manage Classification - Delete Classification
    Given The User is logged in
    When User is on Apps Builder Edit Classification Page
    And  User selects classification and clicks on Delete
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Journeyman | BTAB2 | Building Trade Apprentice Plumber | AB12 | 21.56 | 
    And User Clicks on Ok in Alert
    Then new classification is not displayed in grid 
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Journeyman | BTAB2 | Building Trade Apprentice Plumber | AB12 | 21.56 |   