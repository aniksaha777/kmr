$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/ManageClassification.feature");
formatter.feature({
  "line": 1,
  "name": "Local 13 Manage Classification",
  "description": "",
  "id": "local-13-manage-classification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Manage Classification - Create Classification",
  "description": "",
  "id": "local-13-manage-classification;manage-classification---create-classification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "The User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User is on Apps Builder Create Classification Page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the user enters valid data and clicks on Submit",
  "rows": [
    {
      "cells": [
        "Classification_Group",
        "Classification_Code",
        "Classification_Desc",
        "Short",
        "Wages"
      ],
      "line": 7
    },
    {
      "cells": [
        "Apprentice",
        "BTAB1",
        "Building Trade Apprentice Pipefitter",
        "AB12",
        "33.70"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "new classification is displayed in grid",
  "rows": [
    {
      "cells": [
        "Classification_Group",
        "Classification_Code",
        "Classification_Desc",
        "Short",
        "Wages"
      ],
      "line": 10
    },
    {
      "cells": [
        "Apprentice",
        "BTAB1",
        "Building Trade Apprentice Pipefitter",
        "AB12",
        "33.70"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateClassification.the_User_is_logged_in()"
});
formatter.result({
  "duration": 20456249267,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.user_is_on_Apps_Builder_Create_Classification_Page()"
});
formatter.result({
  "duration": 11561408018,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.the_user_enters_valid_data_and_clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 4397585790,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.new_classification_is_displayed_in_grid(DataTable)"
});
formatter.result({
  "duration": 12106924530,
  "status": "passed"
});
});