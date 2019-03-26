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
  "duration": 35745355510,
  "status": "passed"
});
formatter.match({
  "location": "CreateClassification.user_is_on_Apps_Builder_Create_Classification_Page()"
});
formatter.result({
  "duration": 15241417332,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: element not interactable\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-9QM2DH8\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56558}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387), userDataDir\u003dC:\\Users\\SAMMSA~1\\AppData\\Local\\Temp\\scoped_dir5088_23915}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d73.0.3683.86, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 09277ff9165f4684587139769dc64a93\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat StepDefinations.CreateClassification.user_is_on_Apps_Builder_Create_Classification_Page(CreateClassification.java:59)\r\n\tat ✽.When User is on Apps Builder Create Classification Page(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/ManageClassification.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateClassification.the_user_enters_valid_data_and_clicks_on_Submit(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CreateClassification.new_classification_is_displayed_in_grid(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});