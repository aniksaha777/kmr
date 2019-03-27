$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature");
formatter.feature({
  "line": 1,
  "name": "Local 13 Tests",
  "description": "",
  "id": "local-13-tests",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 42,
  "name": "Manage Attendence Category - Create Category",
  "description": "",
  "id": "local-13-tests;manage-attendence-category---create-category",
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
  "duration": 37454842720,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_is_on_Manage_Attendence_Create_Category_Page()"
});
formatter.result({
  "duration": 15416825681,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_Valid_Data_and_Clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 3163154805,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.new_Category_is_displayed_in_the_grid(DataTable)"
});
formatter.result({
  "duration": 6703587394,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-9QM2DH8\u0027, ip: \u0027192.168.0.122\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50125}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387), userDataDir\u003dC:\\Users\\SAMMSA~1\\AppData\\Local\\Temp\\scoped_dir9996_9497}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d73.0.3683.86, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: c48f3b1848d5e02d44aea41e7a4505d7\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"list\"]//tr/td[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:443)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:522)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:404)\r\n\tat StepDefinations.TestSteps.new_Category_is_displayed_in_the_grid(TestSteps.java:331)\r\n\tat ✽.Then New Category is displayed in the grid(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature:48)\r\n",
  "status": "failed"
});
});