$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/CreateNewBranch.feature");
formatter.feature({
  "line": 1,
  "name": "Create a new Branch in the system",
  "description": "  Verify is user is able to create a new branch in the system",
  "id": "create-a-new-branch-in-the-system",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Navigate to Branch Page verify if user is able to create a new branch",
  "description": "",
  "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is logged in to the application with username \"admin\" and password \"admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Branch Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on create new Branch button and enters \"\u003cName\u003e\" and \"\u003cCode\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create a new Branch with \"\u003cName\u003e\" and \"\u003cCode\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;",
  "rows": [
    {
      "cells": [
        "Name",
        "Code"
      ],
      "line": 10,
      "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;;1"
    },
    {
      "cells": [
        "PHYSICS",
        "B1"
      ],
      "line": 11,
      "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;;2"
    },
    {
      "cells": [
        "BIOLOGY",
        "B2"
      ],
      "line": 12,
      "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;;3"
    },
    {
      "cells": [
        "CHEMISTRY",
        "B3"
      ],
      "line": 13,
      "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Navigate to Branch Page verify if user is able to create a new branch",
  "description": "",
  "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is logged in to the application with username \"admin\" and password \"admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Branch Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on create new Branch button and enters \"PHYSICS\" and \"B1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create a new Branch with \"PHYSICS\" and \"B1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 52
    },
    {
      "val": "admin",
      "offset": 73
    }
  ],
  "location": "NavigateVerifyBranchPgStepDef.user_is_logged_in_to_the_application_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 4670133333,
  "status": "passed"
});
formatter.match({
  "location": "NavigateVerifyBranchPgStepDef.user_clicks_on_Branch_Link()"
});
formatter.result({
  "duration": 385561192,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PHYSICS",
      "offset": 47
    },
    {
      "val": "B1",
      "offset": 61
    }
  ],
  "location": "CreateNewBranchStepDef.clicks_on_create_new_Branch_button_and_enters_and(String,String)"
});
formatter.result({
  "duration": 624579343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PHYSICS",
      "offset": 49
    },
    {
      "val": "B1",
      "offset": 63
    }
  ],
  "location": "CreateNewBranchStepDef.user_should_be_able_to_create_a_new_Branch_with_and(String,String)"
});
formatter.result({
  "duration": 3111300374,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Navigate to Branch Page verify if user is able to create a new branch",
  "description": "",
  "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is logged in to the application with username \"admin\" and password \"admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Branch Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on create new Branch button and enters \"BIOLOGY\" and \"B2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create a new Branch with \"BIOLOGY\" and \"B2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 52
    },
    {
      "val": "admin",
      "offset": 73
    }
  ],
  "location": "NavigateVerifyBranchPgStepDef.user_is_logged_in_to_the_application_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 3468973453,
  "status": "passed"
});
formatter.match({
  "location": "NavigateVerifyBranchPgStepDef.user_clicks_on_Branch_Link()"
});
formatter.result({
  "duration": 395242735,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BIOLOGY",
      "offset": 47
    },
    {
      "val": "B2",
      "offset": 61
    }
  ],
  "location": "CreateNewBranchStepDef.clicks_on_create_new_Branch_button_and_enters_and(String,String)"
});
formatter.result({
  "duration": 634275664,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BIOLOGY",
      "offset": 49
    },
    {
      "val": "B2",
      "offset": 63
    }
  ],
  "location": "CreateNewBranchStepDef.user_should_be_able_to_create_a_new_Branch_with_and(String,String)"
});
formatter.result({
  "duration": 2780978000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Navigate to Branch Page verify if user is able to create a new branch",
  "description": "",
  "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is logged in to the application with username \"admin\" and password \"admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Branch Link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on create new Branch button and enters \"CHEMISTRY\" and \"B3\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to create a new Branch with \"CHEMISTRY\" and \"B3\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 52
    },
    {
      "val": "admin",
      "offset": 73
    }
  ],
  "location": "NavigateVerifyBranchPgStepDef.user_is_logged_in_to_the_application_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 3589626521,
  "status": "passed"
});
formatter.match({
  "location": "NavigateVerifyBranchPgStepDef.user_clicks_on_Branch_Link()"
});
formatter.result({
  "duration": 450709407,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CHEMISTRY",
      "offset": 47
    },
    {
      "val": "B3",
      "offset": 63
    }
  ],
  "location": "CreateNewBranchStepDef.clicks_on_create_new_Branch_button_and_enters_and(String,String)"
});
formatter.result({
  "duration": 680366652,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CHEMISTRY",
      "offset": 49
    },
    {
      "val": "B3",
      "offset": 65
    }
  ],
  "location": "CreateNewBranchStepDef.user_should_be_able_to_create_a_new_Branch_with_and(String,String)"
});
formatter.result({
  "duration": 890123817,
  "status": "passed"
});
formatter.uri("src/test/java/features/DeleteBranchesCreated.feature");
formatter.feature({
  "line": 1,
  "name": "Create a new Branch in the system",
  "description": "  Verify is user is able to create a new branch in the system",
  "id": "create-a-new-branch-in-the-system",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Pre-requisite for this test script is CreateNewBranch.feature"
    },
    {
      "line": 4,
      "value": "#First execute the feature CreateNewBranch then execute the feeature DeleteBranchesCreated"
    }
  ],
  "line": 6,
  "name": "Navigate to Branch Page verify if user is able to create a new branch",
  "description": "",
  "id": "create-a-new-branch-in-the-system;navigate-to-branch-page-verify-if-user-is-able-to-create-a-new-branch",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is logged in to the application with username \"admin\" and password \"admin\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Branch Link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should be able to delete a new branch created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 52
    },
    {
      "val": "admin",
      "offset": 73
    }
  ],
  "location": "NavigateVerifyBranchPgStepDef.user_is_logged_in_to_the_application_with_username_and_password(String,String)"
});
formatter.result({
  "duration": 3497900252,
  "status": "passed"
});
formatter.match({
  "location": "NavigateVerifyBranchPgStepDef.user_clicks_on_Branch_Link()"
});
formatter.result({
  "duration": 364248416,
  "status": "passed"
});
formatter.match({
  "location": "DeleteBranchStepDef.user_should_be_able_to_delete_a_new_branch_created()"
});
formatter.result({
  "duration": 261211552,
  "status": "passed"
});
});