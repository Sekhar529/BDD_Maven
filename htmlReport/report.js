$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("a.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feautre",
  "description": "",
  "id": "free-crm-login-feautre",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14993916697,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Login Page of Free CRM",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Login_Page_of_Free_CRM()"
});
formatter.result({
  "duration": 250278174,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login with valid crendentials",
  "description": "",
  "id": "free-crm-login-feautre;login-with-valid-crendentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@validLogin"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User landed on Home page of CRM",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_enter_username_and_password()"
});
formatter.result({
  "duration": 109881,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Login_button()"
});
formatter.result({
  "duration": 113503,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_landed_on_Home_page_of_CRM()"
});
formatter.result({
  "duration": 412960,
  "status": "passed"
});
formatter.after({
  "duration": 828309094,
  "status": "passed"
});
formatter.before({
  "duration": 8918636123,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Login Page of Free CRM",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Login_Page_of_Free_CRM()"
});
formatter.result({
  "duration": 92373,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login with invalid crendentials",
  "description": "",
  "id": "free-crm-login-feautre;login-with-invalid-crendentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@invalidLogin1"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User provided \"validUserName\" and \"validPassword\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User landed on Home page of CRM",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "validUserName",
      "offset": 15
    },
    {
      "val": "validPassword",
      "offset": 35
    }
  ],
  "location": "LoginStepDefination.user_provided_and(String,String)"
});
formatter.result({
  "duration": 10777396,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Login_button()"
});
formatter.result({
  "duration": 87543,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_landed_on_Home_page_of_CRM()"
});
formatter.result({
  "duration": 82713,
  "status": "passed"
});
formatter.after({
  "duration": 926162972,
  "status": "passed"
});
formatter.before({
  "duration": 8908120147,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Login Page of Free CRM",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Login_Page_of_Free_CRM()"
});
formatter.result({
  "duration": 199235,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Login with invalid crendentials",
  "description": "",
  "id": "free-crm-login-feautre;login-with-invalid-crendentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@invalidLogin2"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I entered credentials to login",
  "rows": [
    {
      "cells": [
        "mouna",
        "df"
      ],
      "line": 24
    },
    {
      "cells": [
        "david",
        "dfs"
      ],
      "line": 25
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User landed on Home page of CRM",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.i_entered_credentials_to_login(DataTable)"
});
formatter.result({
  "duration": 2355197,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Login_button()"
});
formatter.result({
  "duration": 67015,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_landed_on_Home_page_of_CRM()"
});
formatter.result({
  "duration": 83921,
  "status": "passed"
});
formatter.after({
  "duration": 883620302,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 31,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "free-crm-login-feautre;login-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@invalidLoginWithExamples"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User landed on Home page of CRM",
  "keyword": "Then "
});
formatter.examples({
  "line": 35,
  "name": "",
  "description": "",
  "id": "free-crm-login-feautre;login-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 36,
      "id": "free-crm-login-feautre;login-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "raj",
        "123"
      ],
      "line": 37,
      "id": "free-crm-login-feautre;login-with-invalid-credentials;;2"
    },
    {
      "cells": [
        "sekhar",
        "234"
      ],
      "line": 38,
      "id": "free-crm-login-feautre;login-with-invalid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8568945812,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Login Page of Free CRM",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Login_Page_of_Free_CRM()"
});
formatter.result({
  "duration": 76675,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "free-crm-login-feautre;login-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@invalidLoginWithExamples"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Enter \"raj\" and \"123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User landed on Home page of CRM",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "raj",
      "offset": 7
    },
    {
      "val": "123",
      "offset": 17
    }
  ],
  "location": "LoginStepDefination.enter_and(String,String)"
});
formatter.result({
  "duration": 185348,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Login_button()"
});
formatter.result({
  "duration": 70638,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_landed_on_Home_page_of_CRM()"
});
formatter.result({
  "duration": 83316,
  "status": "passed"
});
formatter.after({
  "duration": 2775272786,
  "status": "passed"
});
formatter.before({
  "duration": 8388533251,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Login Page of Free CRM",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_Login_Page_of_Free_CRM()"
});
formatter.result({
  "duration": 85127,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Login with invalid credentials",
  "description": "",
  "id": "free-crm-login-feautre;login-with-invalid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@invalidLoginWithExamples"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Enter \"sekhar\" and \"234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User landed on Home page of CRM",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "sekhar",
      "offset": 7
    },
    {
      "val": "234",
      "offset": 20
    }
  ],
  "location": "LoginStepDefination.enter_and(String,String)"
});
formatter.result({
  "duration": 612798,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_click_on_Login_button()"
});
formatter.result({
  "duration": 77883,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_landed_on_Home_page_of_CRM()"
});
formatter.result({
  "duration": 82713,
  "status": "passed"
});
formatter.after({
  "duration": 2726148121,
  "status": "passed"
});
});