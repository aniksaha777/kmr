Feature: Local 13 Tests
@SmokeTest @ManageClassification
 Scenario: Manage Classification - Create Classification
    Given The User is logged in
    When User is on Apps Builder Create Classification Page
    And  the user enters valid data and clicks on Submit
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Apprentice | BTAB1 | Building Trade Apprentice Pipefitter | AB12 | 33.70 |
    Then new classification is displayed in grid 
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Apprentice | BTAB1 | Building Trade Apprentice Pipefitter | AB12 | 33.70 |
 
 @SmokeTest @ManageClassification
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
    
    
 @SmokeTest @ManageClassification
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
    
    
@ManageAttendanceCategory @Training
Scenario: Manage Attendance Category - Create Category
	Given The User is logged in
	When User is on Manage Attendance Create Category Page
	And User Enters Valid Data and Clicks on Submit
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classes | 1 | 0.21  |
	Then New Category is displayed in the grid
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classes2 | 1 | 0.21  |

@ManageAttendanceCategory @Training 
Scenario: Manage Attendance Category - Edit Category
	Given The User is logged in
	When User is on Manage Attendance Category Page
	And User User selects Attendance Category and clicks on Edit
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classes2 | 1 | 0.21  |
	And User Edits Valid Data and Clicks on Submit
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classes3 | 2 | 0.51  |
	Then New Category is displayed in the grid
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classes3 | 2 | 0.51  |
    
@ManageAttendanceCategory @Training @Current
Scenario: Manage Attendance Category - Delete Category
	Given The User is logged in
	When User is on Manage Attendance Category Page
	And User User selects Attendance Category and clicks on Delete
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classes3 | 2 | 0.51  |
	And User Clicks on Ok in Deletion Alert
	Then New Category is not displayed in the grid
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classes3 | 2 | 0.51  |