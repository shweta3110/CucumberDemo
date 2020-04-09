$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("skeleton/RL_RunnerMultiple.feature");
formatter.feature({
  "name": "Demo web shop login Multi Scenario",
  "description": "this is a test to show demos for  Multi Scenario",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "demoWebshop site is opened by the test User",
  "keyword": "Given "
});
formatter.match({
  "location": "RL_RunnerMuliple.demowebshop_site_is_opened_by_the_test_User()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    },
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "Valid demo login password is provided by the test user",
  "keyword": "When "
});
formatter.match({
  "location": "RL_RunnerMuliple.valid_demo_login_password_is_provided_by_the_test_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "next page should be displayed with valid login ID",
  "keyword": "Then "
});
formatter.match({
  "location": "RL_RunnerMuliple.next_page_should_be_displayed_with_valid_login_ID()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "demoWebshop site is opened by the test User",
  "keyword": "Given "
});
formatter.match({
  "location": "RL_RunnerMuliple.demowebshop_site_is_opened_by_the_test_User()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "INValid Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "INValid demo login password is provided by the test user",
  "keyword": "When "
});
formatter.match({
  "location": "RL_RunnerMuliple.invalid_demo_login_password_is_provided_by_the_test_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed for INvalid login",
  "keyword": "Then "
});
formatter.match({
  "location": "RL_RunnerMuliple.error_message_should_be_displayed_for_INvalid_login()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "demoWebshop site is opened by the test User",
  "keyword": "Given "
});
formatter.match({
  "location": "RL_RunnerMuliple.demowebshop_site_is_opened_by_the_test_User()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Blank Login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "No login password is provided by the test user",
  "keyword": "When "
});
formatter.match({
  "location": "RL_RunnerMuliple.no_login_password_is_provided_by_the_test_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message should be displayed for blank login",
  "keyword": "Then "
});
formatter.match({
  "location": "RL_RunnerMuliple.error_message_should_be_displayed_for_blank_login()"
});
formatter.result({
  "status": "passed"
});
});