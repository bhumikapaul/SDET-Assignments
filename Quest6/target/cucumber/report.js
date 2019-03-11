$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Mult.feature");
formatter.feature({
  "line": 1,
  "name": "Multiplication of numbers",
  "description": "",
  "id": "multiplication-of-numbers",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify Multiplication of given  numbers",
  "description": "",
  "id": "multiplication-of-numbers;verify-multiplication-of-given--numbers",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "First number is  \"\u003cFirst Number\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Second number is\"\u003cSecond Number\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Third number is\"\u003cThird Number\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I multiply 4 and 5 and 6",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The result should be 120",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "multiplication-of-numbers;verify-multiplication-of-given--numbers;",
  "rows": [
    {
      "cells": [
        "First Number",
        "Second Number",
        "Third Number"
      ],
      "line": 11,
      "id": "multiplication-of-numbers;verify-multiplication-of-given--numbers;;1"
    },
    {
      "cells": [
        "4",
        "5",
        "6"
      ],
      "line": 12,
      "id": "multiplication-of-numbers;verify-multiplication-of-given--numbers;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Verify Multiplication of given  numbers",
  "description": "",
  "id": "multiplication-of-numbers;verify-multiplication-of-given--numbers;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "First number is  \"4\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Second number is\"5\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Third number is\"6\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I multiply 4 and 5 and 6",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The result should be 120",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 18
    }
  ],
  "location": "Stepdef.first_number_is(String)"
});
formatter.result({
  "duration": 338986667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 17
    }
  ],
  "location": "Stepdef.second_number_is(String)"
});
formatter.result({
  "duration": 372923,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 16
    }
  ],
  "location": "Stepdef.third_number_is(String)"
});
formatter.result({
  "duration": 439795,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 11
    },
    {
      "val": "5",
      "offset": 17
    },
    {
      "val": "6",
      "offset": 23
    }
  ],
  "location": "Stepdef.i_multiply_and_and(int,int,int)"
});
formatter.result({
  "duration": 3356718,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "120",
      "offset": 21
    }
  ],
  "location": "Stepdef.i_should_display(int)"
});
formatter.result({
  "duration": 299488,
  "status": "passed"
});
});