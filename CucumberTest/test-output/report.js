$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Local 13 Manage Classification",
  "description": "",
  "id": "local-13-manage-classification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 42,
  "name": "Manage Attendence Category - Create Category",
  "description": "",
  "id": "local-13-manage-classification;manage-attendence-category---create-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@ManageAttendanceCategory"
    },
    {
      "line": 41,
      "name": "@Training"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "The User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User is on Manage Attendence Create Category Page",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User Enters Valid Data and Clicks on Submit",
  "rows": [
    {
      "cells": [
        "AttendanceCategory",
        "Points_Applied",
        "Points_Lost"
      ],
      "line": 46
    },
    {
      "cells": [
        "Sunday Test Class",
        "1",
        "0.2"
      ],
      "line": 47
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "New Category is displayed in the grid",
  "rows": [
    {
      "cells": [
        "AttendanceCategory",
        "Points_Applied",
        "Points_Lost"
      ],
      "line": 49
    },
    {
      "cells": [
        "Sunday Test Class",
        "1",
        "0.2"
      ],
      "line": 50
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.the_User_is_logged_in()"
});
formatter.result({
  "duration": 22719341165,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_is_on_Manage_Attendence_Create_Category_Page()"
});
formatter.result({
  "duration": 15160905808,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_Valid_Data_and_Clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 6468843044,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.new_Category_is_displayed_in_the_grid(DataTable)"
});
formatter.result({
  "duration": 7696227134,
  "status": "passed"
});
});