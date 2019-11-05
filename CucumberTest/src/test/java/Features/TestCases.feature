Feature: Local 13 Tests
Description: The Purpse of the tests is to test Local 13
Background:
Given The user is on login page
When The user enters userid and password
|username|password|
|mgg|sammsa@123|
And Clicks on Submit to Login
Then The User is logged in to Local

@SmokeTest @ManageClassification @Today
 Scenario: Manage Classification - Create Classification
    Given User is on Apps Builder Create Classification Page
    When the user enters valid data and clicks on Submit
    | Classification_Group | Classification_Code | Classification_Desc | Short |
    | Apprentice | BTAB1 | Building Trade Apprentice Pipefitter | AB12 |
    Then new classification is displayed in grid 
    | Classification_Group | Classification_Code | Classification_Desc | Short | Wages |
    | Apprentice | BTAB1 | Building Trade Apprentice Pipefitter | AB12 | 33.70 |
 
 @SmokeTest @ManageClassification
 Scenario: Manage Classification - Edit Classification
    Given User is on Apps Builder Edit Classification Page
    When User selects classification and clicks on Edit
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
   // Given The User is logged in
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
	When User is on Manage Attendance Create Category Page
	And User Enters Valid Data and Clicks on Submit
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classs | 1 | 0.21  |
	Then New Category is displayed in the grid
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classs | 1 | 0.21  |

@ManageAttendanceCategory @Training 
Scenario: Manage Attendance Category - Edit Category
	When User is on Manage Attendance Category Page
	And User User selects Attendance Category and clicks on Edit
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classs | 1 | 0.21  |
	And User Edits Valid Data and Clicks on Submit
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classs2 | 2 | 0.51  |
	Then New Category is displayed in the grid
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classs2 | 2 | 0.51  |
    
@ManageAttendanceCategory @Training
Scenario: Manage Attendance Category - Delete Category

	When User is on Manage Attendance Category Page
	And User User selects Attendance Category and clicks on Delete
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classs2 | 2 | 0.51  |
	And User Clicks on Ok in Deletion Alert
	Then New Category is not displayed in the grid
	| AttendanceCategory | Points_Applied | Points_Lost  |
	| Sunday Test Classs2 | 2 | 0.51  |
	
@CreateApplicant @Training @Current
Scenario: Manage Applicant - Create Applicant

	When User is on Create Applicant Page
	And User Enters Valid Data for Contact Info Section
	| LastName | FirstName | MiddleName | CareOf | Address1 | Address2 | Zip | Country | City | State | EmailAddress | AlternateEmail | HomePhone | CellPhone |
	| testb | testb | B | testb | testb | testb | 00610 | USA | City | PUERTO RICO | testrst@test.com | anik.sammsa@gmail.com | 1234567893 | 2345678931 |
	And User Enters Valid Data for Applicant Census Info
	| SSN | DOB | ApplicantType | ApplicationDate | Gender | MaritalStatus | Race |
	| 232623279 | 03/01/2019 | Plumber | 03/01/2019 | Male | Separated | Asian |	
	And User Enters Misc Info
	| MILITARY | OVER18 | HelmetstoHardhats | HSGEDEquivalent | Resident | DriversLicense | RulesSigned | CITIZEN | CanWork | SignedScholarship | DirectEntry | Folder | RelatedWorkExperience | ApplicantNumber | Veteran |
	| No | No | No | HS | No | testlicense | No | No | No | No | directentry | Folder12 | testtWorkExperience | 123 | No |
	And User Enters Training Group
	| StudentID | DepartmentofLaborID | ApprenticeshipNumber |
	| 15 | 213 | 2334 |
	And Clicks on Submit
	Then Applicant Details should be displayed in Grid on Search
	| LastName | FirstName | MiddleName | SSN | ApplicationDate |
	| testb | testb | B | 232623279 | 03/01/2019 |
	
@ManageApplicant @Training	@Current
Scenario: Manage Applicant - Create Applicant

	When User is on Manage Applicant Page
	And  User Selects Member and Click on Edit
	| LastName | FirstName | MiddleName | SSN | ApplicationDate |
	| testb | testb | B | 232623279 | 03/01/2019 |
	And User Edits Data for Contact Info Section
	| LastName | FirstName | MiddleName | CareOf | Address1 | Address2 | Zip | Country | City | State | EmailAddress | AlternateEmail | HomePhone | CellPhone |
	| testedit |testedit | B | testb | testb | testb | 00610 | USA | City | PUERTO RICO | testrst@test.com | anik.sammsa@gmail.com | 1234567893 | 2345678931 |
	And User Enters Edits Data for Applicant Census Info
	| SSN | DOB | ApplicantType | ApplicationDate | Gender | MaritalStatus | Race |
	| 232623279 | 03/01/1992 | Plumber | 03/01/2019 | Male | ENGAGED | Asian |	
	And User Edits Data for Misc Info
	| MILITARY | OVER18 | HelmetstoHardhats | HSGEDEquivalent | Resident | DriversLicense | RulesSigned | CITIZEN | CanWork | SignedScholarship | DirectEntry | Folder | RelatedWorkExperience | ApplicantNumber | Veteran |
	| Yes | Yes | Yes | GED | No | testlicense | No | No | No | No | directentry | Folder12 | testtWorkExperience | 123 | No |
	And User Edits Data for Training Group
	| StudentID | DepartmentofLaborID | ApprenticeshipNumber |
	| 15 | 213 | 2334 |
	And Clicks on Submit
	Then Applicant Details should be displayed in Grid on Search
	| LastName | FirstName | MiddleName | SSN | ApplicationDate |
	| testedit | testedit | B | 232623279 | 03/01/2019 |
	

@ManageApplicant @Training @Current
Scenario: Manage Applicant - Delete Applicant
	//Given The User is logged in
	When User is on Manage Applicant Page
	And  User Selects Member and Click on Delete
	| LastName | FirstName | MiddleName | SSN | ApplicationDate |
	| testedit | testedit | B | 232623279 | 03/01/2019 |
	And User Clicks on OK in Alert
	Then Applicant Details should not be displayed in Grid on Search
	| LastName | FirstName | MiddleName | SSN | ApplicationDate |
	| testedit | testedit | B | 232623279 | 03/01/2019 |
	