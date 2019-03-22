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
  "duration": 7945817488,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_title_of_Login_page_is_Login()"
});
formatter.result({
  "duration": 8325648,
  "status": "passed"
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
  "duration": 107680303,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_Clicks_on_Login_button()"
});
formatter.result({
  "duration": 12776095787,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_Dashboard()"
});
formatter.result({
  "duration": 28445280,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Local 13 Negative Login Scenario",
  "description": "",
  "id": "local-13-login-feature;local-13-negative-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the title of Login page is Login",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters \"\u003cusername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User is on Dashboard",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "local-13-login-feature;local-13-negative-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "Password"
      ],
      "line": 21,
      "id": "local-13-login-feature;local-13-negative-login-scenario;;1"
    },
    {
      "cells": [
        "mgg",
        "mgg1101"
      ],
      "line": 22,
      "id": "local-13-login-feature;local-13-negative-login-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 22,
  "name": "Local 13 Negative Login Scenario",
  "description": "",
  "id": "local-13-login-feature;local-13-negative-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "the title of Login page is Login",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters \"mgg\" and \"mgg1101\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User is on Dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 13815065845,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_title_of_Login_page_is_Login()"
});
formatter.result({
  "duration": 6028000107,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d72.0.3626.121)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-9QM2DH8\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:60864}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387), userDataDir\u003dC:\\Users\\SAMMSA~1\\AppData\\Local\\Temp\\scoped_dir2912_17798}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d72.0.3626.121, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 556c8ce8984df780102ce584024478e3\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:703)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:374)\r\n\tat StepDefinations.LoginSteps.the_title_of_Login_page_is_Login(LoginSteps.java:24)\r\n\tat ✽.When the title of Login page is Login(Login.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "mgg",
      "offset": 13
    },
    {
      "val": "mgg1101",
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