$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://www.walgreens.com/login.jsp\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"qa.test.jhon.smith@gmail.com\" and Password as \"12345ABC!\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on SignIn button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.click_on_SignIn_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Page Title should be \"Your Account | Walgreens\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_Page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Log out link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Log out Page Title should be \"Logged Out | Walgreens\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.log_out_Page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});