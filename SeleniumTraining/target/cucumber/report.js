$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addingnumber.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber can convert Gherkin data tables to a list of a type you specify.",
  "description": "",
  "id": "cucumber-can-convert-gherkin-data-tables-to-a-list-of-a-type-you-specify.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "The sum of a list of numbers should be calculated",
  "description": "",
  "id": "cucumber-can-convert-gherkin-data-tables-to-a-list-of-a-type-you-specify.;the-sum-of-a-list-of-numbers-should-be-calculated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a list of numbers",
  "rows": [
    {
      "cells": [
        "17",
        "20"
      ],
      "line": 5
    },
    {
      "cells": [
        "42",
        "30"
      ],
      "line": 6
    },
    {
      "cells": [
        "4711",
        "50"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I summarize them",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "should I get correct number",
  "keyword": "Then "
});
formatter.match({
  "location": "AddingNumbers.a_list_of_numbers(Integer\u003e)"
});
formatter.result({
  "duration": 96614376,
  "status": "passed"
});
formatter.match({
  "location": "AddingNumbers.i_summarize_them()"
});
formatter.result({
  "duration": 83443,
  "status": "passed"
});
formatter.match({
  "location": "AddingNumbers.should_I_get_correct_number()"
});
formatter.result({
  "duration": 135204,
  "status": "passed"
});
formatter.uri("ebayparameters.feature");
formatter.feature({
  "line": 1,
  "name": "Titles of ebay pages",
  "description": "",
  "id": "titles-of-ebay-pages",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "check the motor contents",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-motor-contents",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Iam on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to \"Motors\" page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I check contents of the \"Motors\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "check the fashion contents",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-fashion-contents",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Iam on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I navigate to \"Fashion\" page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I check contents of the \"Fashion\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 15,
  "name": "check the electronics contents",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-electronics-contents",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Iam on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I navigate to \"Electronics\" page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I check contents of the \"Electronics\" page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("ebayscenariotable.feature");
formatter.feature({
  "line": 1,
  "name": "Titles of ebay pages",
  "description": "",
  "id": "titles-of-ebay-pages",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "check the page contents",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-page-contents",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Iam on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to \u003clink\u003e page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I check contents of the \u003ctitle\u003e page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-page-contents;",
  "rows": [
    {
      "cells": [
        "link",
        "title"
      ],
      "line": 9,
      "id": "titles-of-ebay-pages;check-the-page-contents;;1"
    },
    {
      "cells": [
        "Motors",
        "Motors"
      ],
      "line": 10,
      "id": "titles-of-ebay-pages;check-the-page-contents;;2"
    },
    {
      "cells": [
        "Fashion",
        "Fashion"
      ],
      "line": 11,
      "id": "titles-of-ebay-pages;check-the-page-contents;;3"
    },
    {
      "cells": [
        "Electronics",
        "Electronics"
      ],
      "line": 12,
      "id": "titles-of-ebay-pages;check-the-page-contents;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "check the page contents",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-page-contents;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Iam on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Motors page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I check contents of the Motors page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "check the page contents",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-page-contents;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Iam on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Fashion page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I check contents of the Fashion page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "check the page contents",
  "description": "",
  "id": "titles-of-ebay-pages;check-the-page-contents;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Iam on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Electronics page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I check contents of the Electronics page",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});