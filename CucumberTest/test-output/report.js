$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Local 13 Tests",
  "description": "",
  "id": "local-13-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 67,
  "name": "Manage Attendance Category - Delete Category",
  "description": "",
  "id": "local-13-tests;manage-attendance-category---delete-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 66,
      "name": "@ManageAttendanceCategory"
    },
    {
      "line": 66,
      "name": "@Training"
    },
    {
      "line": 66,
      "name": "@Current"
    }
  ]
});
formatter.step({
  "line": 68,
  "name": "The User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 69,
  "name": "User is on Manage Attendance Category Page",
  "keyword": "When "
});
formatter.step({
  "line": 70,
  "name": "User User selects Attendance Category and clicks on Delete",
  "rows": [
    {
      "cells": [
        "AttendanceCategory",
        "Points_Applied",
        "Points_Lost"
      ],
      "line": 71
    },
    {
      "cells": [
        "Sunday Test Class3",
        "2",
        "0.51"
      ],
      "line": 72
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "User Clicks on Ok in Deletion Alert",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "New Category is not displayed in the grid",
  "rows": [
    {
      "cells": [
        "AttendanceCategory",
        "Points_Applied",
        "Points_Lost"
      ],
      "line": 75
    },
    {
      "cells": [
        "Sunday Test Class3",
        "2",
        "0.51"
      ],
      "line": 76
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.the_User_is_logged_in()"
});
formatter.result({
  "duration": 21339830320,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_is_on_Manage_Attendance_Category_Page()"
});
formatter.result({
  "duration": 11798141377,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_User_selects_Attendance_Category_and_clicks_on_Delete(DataTable)"
});
formatter.result({
  "duration": 6310919791,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Clicks_on_Ok_in_Deletion_Alert()"
});
formatter.result({
  "duration": 19056583,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.new_Category_is_not_displayed_in_the_grid(DataTable)"
});
formatter.result({
  "duration": 7004581785,
  "status": "passed"
});
});