$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/LoginDemo.feature");
formatter.feature({
  "name": "Test login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "trinh duyet duoc mo",
  "keyword": "Given "
});
formatter.step({
  "name": "user dang o trang login",
  "keyword": "And "
});
formatter.step({
  "name": "user nhap \u003cusername\u003e va \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user click vao nut dang nhap",
  "keyword": "And "
});
formatter.step({
  "name": "user den trang chu",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Raghav",
        "123455"
      ]
    },
    {
      "cells": [
        "Ele",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "trinh duyet duoc mo",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.trinh_duyet_duoc_mo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user dang o trang login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_dang_o_trang_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user nhap Raghav va 123455",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_nhap_username_va_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click vao nut dang nhap",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_click_vao_nut_dang_nhap()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user den trang chu",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_den_trang_chu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "trinh duyet duoc mo",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.trinh_duyet_duoc_mo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user dang o trang login",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_dang_o_trang_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user nhap Ele va 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_nhap_username_va_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click vao nut dang nhap",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_click_vao_nut_dang_nhap()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user den trang chu",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoSteps.user_den_trang_chu()"
});
formatter.result({
  "status": "passed"
});
});