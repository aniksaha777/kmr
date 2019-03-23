$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Local 13 Login Feature",
  "description": "",
  "id": "local-13-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Local 13 Successful Login Scenario",
  "description": "",
  "id": "local-13-login-feature;local-13-successful-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SmokeTest"
    },
    {
      "line": 2,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the title of Login page is Login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is on Dashboard",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "local-13-login-feature;local-13-successful-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "Password"
      ],
      "line": 10,
      "id": "local-13-login-feature;local-13-successful-login-scenario;;1"
    },
    {
      "cells": [
        "mgg",
        "mgg1105"
      ],
      "line": 11,
      "id": "local-13-login-feature;local-13-successful-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Local 13 Successful Login Scenario",
  "description": "",
  "id": "local-13-login-feature;local-13-successful-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTest"
    },
    {
      "line": 2,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the title of Login page is Login",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"mgg\" and \"mgg1105\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User is on Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.the_title_of_Login_page_is_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "mgg",
      "offset": 13
    },
    {
      "val": "mgg1105",
      "offset": 23
    }
  ],
  "location": "LoginSteps.user_enters_username_and_Password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_Clicks_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_is_on_Dashboard()"
});
formatter.result({
  "status": "skipped"
});
});