$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/AdactinLogin.feature");
formatter.feature({
  "name": "Validation of Login Page in Adactin Web Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Tc01_Validation of Login Page with Valid Username and Valid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch Adactin Web Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Verifies Adactin Web Page Is Displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User Enters Valid \"\u003cUsername\u003e\" and Valid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Clicks Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "User Verify Serch Hotel Page is Displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User Selects Valid \"\u003cLocation\u003e\",\"\u003cHotelName\u003e\",\"\u003cHotelType\u003e\",\"\u003cNoOfRooms\u003e\",\"\u003cCheckInDate\u003e\",\"\u003cCheckOutDate\u003e\",\"\u003cAdultsPerRooms\u003e\",\"\u003cChildrenPerRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Clicks Serch Button",
  "keyword": "And "
});
formatter.step({
  "name": "User Verify Adactin Select Hotel Page Is Displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User Clicks Radio Button and Continue Button",
  "keyword": "When "
});
formatter.step({
  "name": "User Verify Adactin Book a Hotel Page Is Displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "User Enters Valid \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cBillingAddress\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Entres Valid \"\u003cCreditCardNo\u003e\",Card Type,ExpMonth,ExpYear and \"\u003cCVV\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Clicks Book Now Button",
  "keyword": "And "
});
formatter.step({
  "name": "User Verify Order ID is Displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "CheckInDate",
        "CheckOutDate",
        "FirstName",
        "LastName",
        "BillingAddress",
        "CreditCardNo",
        "CVV"
      ]
    },
    {
      "cells": [
        "Nolan425",
        "Karthik425@",
        "13/02/2022",
        "15/02/2022",
        "Nolan",
        "John",
        "Doorno-456,SouthRoad,Delhi",
        "9876564789765345",
        "456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Tc01_Validation of Login Page with Valid Username and Valid Password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Launch Adactin Web Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.user_Launch_Adactin_Web_Page()"
});
