$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Local 13 Tests",
  "description": "",
  "id": "local-13-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 79,
  "name": "Manage Applicant - Create Applicant",
  "description": "",
  "id": "local-13-tests;manage-applicant---create-applicant",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 78,
      "name": "@CreateApplicant"
    },
    {
      "line": 78,
      "name": "@Training"
    },
    {
      "line": 78,
      "name": "@Current"
    }
  ]
});
formatter.step({
  "line": 80,
  "name": "The User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 81,
  "name": "User is on Create Applicant Page",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "User Enters Valid Data for Contact Info Section",
  "rows": [
    {
      "cells": [
        "LastName",
        "FirstName",
        "MiddleName",
        "CareOf",
        "Address1",
        "Address2",
        "Zip",
        "Country",
        "City",
        "State",
        "EmailAddress",
        "AlternateEmail",
        "HomePhone",
        "CellPhone"
      ],
      "line": 83
    },
    {
      "cells": [
        "testb",
        "testb",
        "B",
        "testb",
        "testb",
        "testb",
        "00610",
        "USA",
        "City",
        "PUERTO RICO",
        "test123@test.com",
        "anik.sammsa@gmail.com",
        "1234567893",
        "2345678931"
      ],
      "line": 84
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "User Enters Valid Data for Applicant Census Info",
  "rows": [
    {
      "cells": [
        "SSN",
        "DOB",
        "ApplicantType",
        "ApplicationDate",
        "Gender",
        "MaritalStatus",
        "Race"
      ],
      "line": 86
    },
    {
      "cells": [
        "232323249",
        "03/01/2019",
        "Plumber",
        "03/01/2019",
        "Male",
        "Separated",
        "Asian"
      ],
      "line": 87
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "User Enters Misc Info",
  "rows": [
    {
      "cells": [
        "MILITARY",
        "OVER18",
        "HelmetstoHardhats",
        "HSGEDEquivalent",
        "Resident",
        "DriversLicense",
        "RulesSigned",
        "CITIZEN",
        "CanWork",
        "SignedScholarship",
        "DirectEntry",
        "Folder",
        "RelatedWorkExperience",
        "ApplicantNumber",
        "Veteran"
      ],
      "line": 89
    },
    {
      "cells": [
        "No",
        "No",
        "No",
        "HS",
        "No",
        "testlicense",
        "No",
        "No",
        "No",
        "No",
        "directentry",
        "Folder12",
        "testtWorkExperience",
        "123",
        "No"
      ],
      "line": 90
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "User Enters Training Group",
  "rows": [
    {
      "cells": [
        "StudentID",
        "DepartmentofLaborID",
        "ApprenticeshipNumber"
      ],
      "line": 92
    },
    {
      "cells": [
        "15",
        "213",
        "2334"
      ],
      "line": 93
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "Clicks on Submit",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Applicant Details should be displayed in Grid on Search",
  "rows": [
    {
      "cells": [
        "LastName",
        "FirstName",
        "MiddleName",
        "SSN",
        "ApplicationDate"
      ],
      "line": 96
    },
    {
      "cells": [
        "testb",
        "testb",
        "B",
        "232323249",
        "03/01/2019"
      ],
      "line": 97
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.the_User_is_logged_in()"
});
formatter.result({
  "duration": 28877594831,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_is_on_Create_Applicant_Page()"
});
formatter.result({
  "duration": 16454549660,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_Valid_Data_for_Contact_Info_Section(DataTable)"
});
formatter.result({
  "duration": 1601433191,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_Valid_Data_for_Applicant_Census_Info(DataTable)"
});
formatter.result({
  "duration": 572941074,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_Misc_Info(DataTable)"
});
formatter.result({
  "duration": 964937722,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_Training_Group(DataTable)"
});
formatter.result({
  "duration": 133010677,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.clicks_on_Submit()"
});
formatter.result({
  "duration": 17392247509,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.applicant_Details_should_be_displayed_in_Grid_on_Search(DataTable)"
});
formatter.result({
  "duration": 6657320427,
  "status": "passed"
});
});