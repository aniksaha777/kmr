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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});