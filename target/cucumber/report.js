$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/List.feature");
formatter.feature({
  "line": 2,
  "name": "Listpage background color functionality validation",
  "description": "",
  "id": "listpage-background-color-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ListFeature"
    }
  ]
});
formatter.before({
  "duration": 2982604300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "1 Sky Blue Background",
  "description": "",
  "id": "listpage-background-color-functionality-validation;1-sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The \"\u003csetSkyBlueBackground\u003e\" button exists in \"SetSkyBlueBackground\" field",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the \"\u003csetSkyBlueBackground\u003e\" button in the \"SetSkyBlueBackground\" field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The background color will change to \"\u003csky blue\u003e\" in the \"SkyBlueBackground\" field",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csetSkyBlueBackground\u003e",
      "offset": 5
    },
    {
      "val": "SetSkyBlueBackground",
      "offset": 47
    }
  ],
  "location": "ListStepDefinition.the_button_exists_in_field(String,String)"
});
formatter.result({
  "duration": 4126196000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csetSkyBlueBackground\u003e",
      "offset": 16
    },
    {
      "val": "SetSkyBlueBackground",
      "offset": 55
    }
  ],
  "location": "ListStepDefinition.i_click_on_the_button_in_the_field(String,String)"
});
formatter.result({
  "duration": 4063447800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csky blue\u003e",
      "offset": 37
    },
    {
      "val": "SkyBlueBackground",
      "offset": 57
    }
  ],
  "location": "ListStepDefinition.the_background_color_will_change_to_in_the_field(String,String)"
});
formatter.result({
  "duration": 4116645100,
  "status": "passed"
});
formatter.after({
  "duration": 18768118800,
  "status": "passed"
});
formatter.before({
  "duration": 2071364100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "2 White Background Change",
  "description": "",
  "id": "listpage-background-color-functionality-validation;2-white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "The \"\u003csetWhiteBackground\u003e\" button exists in \"SetWhiteBackground\" field",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I click on the \"\u003csetWhiteBackground\u003e\" button in the \"SetWhiteBackground\" field",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "The background color will change to \"\u003cwhite\u003e\" in the \"WhiteBackground\" field",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csetWhiteBackground\u003e",
      "offset": 5
    },
    {
      "val": "SetWhiteBackground",
      "offset": 45
    }
  ],
  "location": "ListStepDefinition.the_button_exists_in_field(String,String)"
});
formatter.result({
  "duration": 4059139300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003csetWhiteBackground\u003e",
      "offset": 16
    },
    {
      "val": "SetWhiteBackground",
      "offset": 53
    }
  ],
  "location": "ListStepDefinition.i_click_on_the_button_in_the_field(String,String)"
});
formatter.result({
  "duration": 4101800700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cwhite\u003e",
      "offset": 37
    },
    {
      "val": "WhiteBackground",
      "offset": 54
    }
  ],
  "location": "ListStepDefinition.the_background_color_will_change_to_in_the_field(String,String)"
});
formatter.result({
  "duration": 4159968400,
  "status": "passed"
});
formatter.after({
  "duration": 18771314100,
  "status": "passed"
});
});