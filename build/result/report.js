$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/WebsiteBukalapak.feature");
formatter.feature({
  "name": "Bukalapak Website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Web"
    }
  ]
});
formatter.scenario({
  "name": "User Login with valid username and password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Web"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User open login page bukalapak",
  "keyword": "Given "
});
formatter.match({
  "location": "project.steps_definition.WebsiteBukalapakSteps.userOpenLoginPageBukalapak()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input email \"fanikim00@gmail.com\" on email field",
  "keyword": "When "
});
formatter.match({
  "location": "project.steps_definition.WebsiteBukalapakSteps.userInputEmailOnEmailField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input password \"P@ssw0rd\" on password field",
  "keyword": "And "
});
formatter.match({
  "location": "project.steps_definition.WebsiteBukalapakSteps.userInputPasswordOnPasswordField(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Login on login page",
  "keyword": "And "
});
formatter.match({
  "location": "project.steps_definition.WebsiteBukalapakSteps.userClickLoginOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "project.steps_definition.WebsiteBukalapakSteps.userIsOnHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});