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
  "name": "Manage Attendance Category - Create Category",
  "description": "",
  "id": "local-13-tests;manage-attendance-category---create-category",
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
  "name": "User is on Manage Attendance Create Category Page",
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
        "Sunday Test Classes",
        "1",
        "0.21"
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
        "Sunday Test Classes2",
        "1",
        "0.21"
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
  "duration": 23342015574,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_is_on_Manage_Attendance_Create_Category_Page()"
});
formatter.result({
  "duration": 13218526900,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_Valid_Data_and_Clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 3965325356,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.new_Category_is_displayed_in_the_grid(DataTable)"
});
formatter.result({
  "duration": 7348178081,
  "error_message": "java.lang.AssertionError: Data is not Present\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat StepDefinations.TestSteps.new_Category_is_displayed_in_the_grid(TestSteps.java:358)\r\n\tat ✽.Then New Category is displayed in the grid(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature:48)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 53,
  "name": "Manage Attendance Category - Edit Category",
  "description": "",
  "id": "local-13-tests;manage-attendance-category---edit-category",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@ManageAttendanceCategory"
    },
    {
      "line": 52,
      "name": "@Training"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "The User is logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "User is on Manage Attendance Category Page",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "User User selects Attendance Category and clicks on Edit",
  "rows": [
    {
      "cells": [
        "AttendanceCategory",
        "Points_Applied",
        "Points_Lost"
      ],
      "line": 57
    },
    {
      "cells": [
        "Sunday Test Classes2",
        "1",
        "0.21"
      ],
      "line": 58
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User Edits Valid Data and Clicks on Submit",
  "rows": [
    {
      "cells": [
        "AttendanceCategory",
        "Points_Applied",
        "Points_Lost"
      ],
      "line": 60
    },
    {
      "cells": [
        "Sunday Test Classes3",
        "2",
        "0.51"
      ],
      "line": 61
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "New Category is displayed in the grid",
  "rows": [
    {
      "cells": [
        "AttendanceCategory",
        "Points_Applied",
        "Points_Lost"
      ],
      "line": 63
    },
    {
      "cells": [
        "Sunday Test Classes3",
        "2",
        "0.51"
      ],
      "line": 64
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.the_User_is_logged_in()"
});
formatter.result({
  "duration": 19804258134,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_is_on_Manage_Attendance_Category_Page()"
});
formatter.result({
  "duration": 11862855419,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_User_selects_Attendance_Category_and_clicks_on_Edit(DataTable)"
});
formatter.result({
  "duration": 6101273729,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Edits_Valid_Data_and_Clicks_on_Submit(DataTable)"
});
formatter.result({
  "duration": 5023427605,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"AttendanceCategoryName\"]\"}\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-9QM2DH8\u0027, ip: \u0027192.168.0.122\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:54017}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387), userDataDir\u003dC:\\Users\\SAMMSA~1\\AppData\\Local\\Temp\\scoped_dir18904_23560}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d73.0.3683.86, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: bf60d66747e13bfe9fca9eb61c38d3cd\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"AttendanceCategoryName\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat StepDefinations.TestSteps.user_Edits_Valid_Data_and_Clicks_on_Submit(TestSteps.java:420)\r\n\tat ✽.And User Edits Valid Data and Clicks on Submit(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature:59)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.new_Category_is_displayed_in_the_grid(DataTable)"
});
formatter.result({
  "status": "skipped"
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
        "Sunday Test Classes3",
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
        "Sunday Test Classes3",
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
  "duration": 19348010499,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d73.0.3683.86)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-9QM2DH8\u0027, ip: \u0027192.168.0.122\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:54080}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387), userDataDir\u003dC:\\Users\\SAMMSA~1\\AppData\\Local\\Temp\\scoped_dir14040_21394}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d73.0.3683.86, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 894c37a9a9ee4bf16553d4f486593e52\n*** Element info: {Using\u003dxpath, value\u003d//*[@title\u003d\"Log Out\"]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:488)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat StepDefinations.TestSteps.the_User_is_logged_in(TestSteps.java:45)\r\n\tat ✽.Given The User is logged in(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/TestCases.feature:68)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.user_is_on_Manage_Attendance_Category_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.user_User_selects_Attendance_Category_and_clicks_on_Delete(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.user_Clicks_on_Ok_in_Deletion_Alert()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.new_Category_is_not_displayed_in_the_grid(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});