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
  "location": "ManageClassification.the_User_is_logged_in()"
});
formatter.result({
  "duration": 51147301519,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.user_is_on_Apps_Builder_Create_Classification_Page()"
});
formatter.result({
  "duration": 20055924590,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.the_user_enters_valid_data_and_clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 6416126737,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.new_classification_is_displayed_in_grid(DataTable)"
});
formatter.result({
  "duration": 22615885543,
  "status": "passed"
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
  "location": "ManageClassification.the_User_is_logged_in()"
});
formatter.result({
  "duration": 26419197704,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.user_is_on_Apps_Builder_Edit_Classification_Page()"
});
formatter.result({
  "duration": 15120491478,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.user_selects_classification_and_clicks_on_Edit(DataTable)"
});
formatter.result({
  "duration": 13475602936,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.user_Edits_classification_data_and_clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 5410698313,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.new_classification_is_displayed_in_grid(DataTable)"
});
formatter.result({
  "duration": 21859216189,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Manage Classification - Delete Classification",
  "description": "",
  "id": "local-13-manage-classification;manage-classification---delete-classification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "The User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "User is on Apps Builder Edit Classification Page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "User selects classification and clicks on Delete",
  "rows": [
    {
      "cells": [
        "Classification_Group",
        "Classification_Code",
        "Classification_Desc",
        "Short",
        "Wages"
      ],
      "line": 33
    },
    {
      "cells": [
        "Journeyman",
        "BTAB2",
        "Building Trade Apprentice Plumber",
        "AB12",
        "21.56"
      ],
      "line": 34
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User Clicks on Ok in Alert",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "new classification is not displayed in grid",
  "rows": [
    {
      "cells": [
        "Classification_Group",
        "Classification_Code",
        "Classification_Desc",
        "Short",
        "Wages"
      ],
      "line": 37
    },
    {
      "cells": [
        "Journeyman",
        "BTAB2",
        "Building Trade Apprentice Plumber",
        "AB12",
        "21.56"
      ],
      "line": 38
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "ManageClassification.the_User_is_logged_in()"
});
formatter.result({
  "duration": 33386345972,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.user_is_on_Apps_Builder_Edit_Classification_Page()"
});
formatter.result({
  "duration": 13959431269,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.user_selects_classification_and_clicks_on_Delete(DataTable)"
});
formatter.result({
  "duration": 12817115060,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.user_Clicks_on_Ok_in_Alert()"
});
formatter.result({
  "duration": 21961984,
  "status": "passed"
});
formatter.match({
  "location": "ManageClassification.new_classification_is_not_displayed_in_grid(DataTable)"
});
formatter.result({
  "duration": 22859403305,
  "status": "passed"
});
});