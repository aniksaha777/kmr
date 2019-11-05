$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/AFMOnlineJoin.feature");
formatter.feature({
  "line": 1,
  "name": "AFM online Join",
  "description": "Description: The purpose of these test is to test AFM online join form with different sets of data",
  "id": "afm-online-join",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Login to Local",
  "description": "",
  "id": "afm-online-join;login-to-local",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@AFM"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The User is on the AFM Online join Page",
  "rows": [
    {
      "cells": [
        "https://10.2.5.99/afmlocal802/public/online-join"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User Enters the Member Details",
  "rows": [
    {
      "cells": [
        "SSN",
        "JoiningReason",
        "OtherReason",
        "LastName",
        "FirstName",
        "Initial",
        "DirName",
        "Gender",
        "DOB"
      ],
      "line": 9
    },
    {
      "cells": [
        "123652782",
        "HEALTHCARE,WORKCOND,REQUIRE,PENSION,PAC,OTHER",
        "Test Reason\u0027ab",
        "TestLastName\u0027ab",
        "FirstName\u0027abc",
        "M",
        "DirName\u0027Testbc",
        "Female",
        "10101970"
      ],
      "line": 10
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Clicks on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User Enters the Contact Details",
  "rows": [
    {
      "cells": [
        "Address1",
        "Address2",
        "Zip"
      ],
      "line": 13
    },
    {
      "cells": [
        "Address1",
        "Address2",
        "99501"
      ],
      "line": 14
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Clicks on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Enters Instrument Details",
  "rows": [
    {
      "cells": [
        "CBA"
      ],
      "line": 17
    },
    {
      "cells": [
        "N"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Clicks on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Accepts Terms and Conditions with Signature",
  "rows": [
    {
      "cells": [
        "sign1",
        "sign2"
      ],
      "line": 21
    },
    {
      "cells": [
        "TestSignature",
        "TestSignature"
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Clicks on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Verifies the Payment Page",
  "rows": [
    {
      "cells": [
        "Quarters",
        "tempo802Fed",
        "tempo_ny",
        "musicianfund",
        "anniewalkerfund"
      ],
      "line": 25
    },
    {
      "cells": [
        "1",
        "20",
        "35",
        "50",
        "0"
      ],
      "line": 26
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Clicks on Continue",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Checks out to Pay through Paypal",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Logs into paypal",
  "rows": [
    {
      "cells": [
        "Paypalid",
        "PaypalPassword"
      ],
      "line": 30
    },
    {
      "cells": [
        "mousum_1345005826_per@gmail.com",
        "345005801"
      ],
      "line": 31
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Completes payment through Paypal",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "The user should be Registered Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.the_User_is_on_the_AFM_Online_join_Page(DataTable)"
});
formatter.result({
  "duration": 27381257700,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.user_Enters_the_Member_Details(DataTable)"
});
formatter.result({
  "duration": 19834911400,
  "error_message": "java.lang.RuntimeException: Unexpected result for screenshot command: null\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:397)\r\n\tat runner.Screenshots.capture(Screenshots.java:16)\r\n\tat StepDefinations.TestSteps.user_Enters_the_Member_Details(TestSteps.java:126)\r\n\tat ✽.When User Enters the Member Details(C:/Users/SAMMSALAPTOP1/Desktop/Automation/MyGitHub/CucumberTest/src/test/java/Features/AFMOnlineJoin.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestSteps.clicks_on_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.user_Enters_the_Contact_Details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.clicks_on_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.user_Enters_Instrument_Details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.clicks_on_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.user_Accepts_Terms_and_Conditions_with_Signature(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.clicks_on_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.user_Verifies_the_Payment_Page(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.clicks_on_Continue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.checks_out_to_Pay_through_Paypal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.logs_into_paypal(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.completes_payment_through_Paypal()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestSteps.the_user_should_be_Registered_Successfully()"
});
formatter.result({
  "status": "skipped"
});
});