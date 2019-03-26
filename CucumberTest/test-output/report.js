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
  "duration": 21150008533,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.user_is_on_Apps_Builder_Create_Classification_Page()"
});
formatter.result({
  "duration": 12146369535,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.the_user_enters_valid_data_and_clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 4116242811,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.new_classification_is_displayed_in_grid(DataTable)"
});
formatter.result({
  "duration": 5171242101,
  "error_message": "java.lang.AssertionError: Data not Matching\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat StepDefinations.CreateClassification.new_classification_is_displayed_in_grid(CreateClassification.java:121)\r\n\tat ✽.Then new classification is displayed in grid(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/ManageClassification.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "Manage Classification - Edit Classification",
  "description": "",
  "id": "local-13-manage-classification;manage-classification---edit-classification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "The User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User is on Apps Builder Edit Classification Page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User selects classification and clicks on Edit",
  "rows": [
    {
      "cells": [
        "Classification_Group",
        "Classification_Code",
        "Classification_Desc",
        "Short",
        "Wages"
      ],
      "line": 18
    },
    {
      "cells": [
        "Apprentice",
        "BTAB1",
        "Building Trade Apprentice Pipefitter",
        "AB12",
        "33.70"
      ],
      "line": 19
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Edits classification data and clicks on Submit",
  "rows": [
    {
      "cells": [
        "Classification_Group",
        "Classification_Code",
        "Classification_Desc",
        "Short",
        "Wages"
      ],
      "line": 21
    },
    {
      "cells": [
        "Journeyman",
        "BTAB2",
        "Building Trade Apprentice Plumber",
        "AB12",
        "21.56"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
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
      "line": 24
    },
    {
      "cells": [
        "Journeyman",
        "BTAB2",
        "Building Trade Apprentice Plumber",
        "AB12",
        "21.56"
      ],
      "line": 25
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreateClassification.the_User_is_logged_in()"
});
formatter.result({
  "duration": 19202410817,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.user_is_on_Apps_Builder_Edit_Classification_Page()"
});
formatter.result({
  "duration": 11736763076,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.user_selects_classification_and_clicks_on_Edit(DataTable)"
});
formatter.result({
  "duration": 9614648726,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.user_Edits_classification_data_and_clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 3789584314,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.new_classification_is_displayed_in_grid(DataTable)"
});
formatter.result({
  "duration": 5182909615,
  "error_message": "java.lang.AssertionError: Data not Matching\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat StepDefinations.CreateClassification.new_classification_is_displayed_in_grid(CreateClassification.java:121)\r\n\tat ✽.Then new classification is displayed in grid(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/ManageClassification.feature:23)\r\n",
  "status": "failed"
});
});