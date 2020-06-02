$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/14388/eclipse-workspace/mystoreecommerce_cucumber/src/main/java/com/features/searchproduct.feature");
formatter.feature({
  "line": 1,
  "name": "Search product test",
  "description": "",
  "id": "search-product-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "search product",
  "description": "",
  "id": "search-product-test;search-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user mousehover on Women tab and clicks on tshirts",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will get Text of the first product in the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the product name and clicks on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user will  Validate that same product is displayed on searched page by taking screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "Searchproductstepdefination.user_is_on_homepage()"
});
formatter.result({
  "duration": 10370588300,
  "status": "passed"
});
formatter.match({
  "location": "Searchproductstepdefination.user_mousehover_on_Women_tab_and_clicks_on_tshirts()"
});
formatter.result({
  "duration": 1527862100,
  "status": "passed"
});
formatter.match({
  "location": "Searchproductstepdefination.user_will_get_Text_of_the_first_product_in_the_page()"
});
formatter.result({
  "duration": 43544000,
  "status": "passed"
});
formatter.match({
  "location": "Searchproductstepdefination.user_enters_the_product_name_and_clicks_on_submit_button()"
});
formatter.result({
  "duration": 1234434000,
  "status": "passed"
});
formatter.match({
  "location": "Searchproductstepdefination.user_will_Validate_that_same_product_is_displayed_on_searched_page_by_taking_screenshot()"
});
formatter.result({
  "duration": 3230894500,
  "status": "passed"
});
});