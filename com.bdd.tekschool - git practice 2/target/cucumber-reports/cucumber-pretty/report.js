$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/Currency.feature");
formatter.feature({
  "line": 2,
  "name": "Currency",
  "description": "",
  "id": "currency",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Currency"
    }
  ]
});
formatter.before({
  "duration": 10176840199,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Tekschool page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click on Test Environment link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should see test environment page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "# @SDET_003"
    },
    {
      "line": 10,
      "value": "# Scenario: SDET2019AUG_SDET_003_Execution"
    }
  ],
  "line": 11,
  "name": "User clicks on My Account Menu on top of the page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User click on space login on myAccount menu",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters username \u0027teststudent@gmail.com\u0027 and password \u0027Tek@Test.com\u0027 in returning menu",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on login buttin",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_Tekschool_page()"
});
formatter.result({
  "duration": 3343624401,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_click_on_Test_Environment_link()"
});
formatter.result({
  "duration": 1354925900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_test_environment_page()"
});
formatter.result({
  "duration": 9718701,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_clicks_on_My_Account_Menu_on_top_of_the_page()"
});
formatter.result({
  "duration": 803608800,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_click_on_login_on_myAccount_menu()"
});
formatter.result({
  "duration": 333506700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "teststudent@gmail.com",
      "offset": 22
    },
    {
      "val": "Tek@Test.com",
      "offset": 59
    }
  ],
  "location": "TekSchoolScenariosStepDefinitions.user_enters_username_username_and_password_password_in_returning_menu(String,String)"
});
formatter.result({
  "duration": 262213301,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_clicks_on_login_buttin()"
});
formatter.result({
  "duration": 930868499,
  "status": "passed"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_should_be_logged_in()"
});
formatter.result({
  "duration": 405099901,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Currency_009",
  "description": "",
  "id": "currency;currency-009",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Curreny_009"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user clicks on Currency tab on the left top of the page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Verify 3 currencies  US Dollar, Euro and Pound are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user clicks on on different currency",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Verify the chosen currency is displayed under Product’s description in the product item in the product list",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user click on a specific product and product details page appeared.",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Verify the chosen currency is displayed On the product details page.",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "User clicks on Add to cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Verify the chosen currency is displayed in the “Shopping cart\"for each individual product.",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User clicks on MyAccount button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User clicks on LogOutButton",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User clicks on Log out of the account button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "User click on space login on myAccount menu",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User enters username \u0027teststudent@gmail.com\u0027 and password \u0027Tek@Test.com\u0027 in returning menu",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User clicks on login buttin",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Verify the chosen currency is saved when the user logs back in the account",
  "keyword": "And "
});
formatter.match({
  "location": "CurrencyStepDefinition.user_clicks_on_Currency_tab_on_the_left_top_of_the_page()"
});
formatter.result({
  "duration": 1092800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 7
    }
  ],
  "location": "CurrencyStepDefinition.verify_currencies_US_Dollar_Euro_and_Pound_are_displayed(int)"
});
formatter.result({
  "duration": 468901,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDefinition.user_clicks_on_on_different_currency()"
});
formatter.result({
  "duration": 9200,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDefinition.verify_the_chosen_currency_is_displayed_under_Product_s_description_in_the_product_item_in_the_product_list()"
});
formatter.result({
  "duration": 9500,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDefinition.user_click_on_a_specific_product_and_product_details_page_appeared()"
});
formatter.result({
  "duration": 8799,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDefinition.verify_the_chosen_currency_is_displayed_On_the_product_details_page()"
});
formatter.result({
  "duration": 9600,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDefinition.user_clicks_on_Add_to_cart_button()"
});
formatter.result({
  "duration": 9301,
  "status": "passed"
});
formatter.match({
  "location": "CurrencyStepDefinition.verify_the_chosen_currency_is_displayed_in_the_Shopping_cart_for_each_individual_product()"
});
formatter.result({
  "duration": 10100,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "CurrencyStepDefinition.user_clicks_on_Log_out_of_the_account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_click_on_login_on_myAccount_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "teststudent@gmail.com",
      "offset": 22
    },
    {
      "val": "Tek@Test.com",
      "offset": 59
    }
  ],
  "location": "TekSchoolScenariosStepDefinitions.user_enters_username_username_and_password_password_in_returning_menu(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_clicks_on_login_buttin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CurrencyStepDefinition.verify_the_chosen_currency_is_saved_when_the_user_logs_back_in_the_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 665391000,
  "status": "passed"
});
});