Feature: Search product test

Scenario: search product

Given user is on homepage
When user mousehover on Women tab and clicks on tshirts
Then user will get Text of the first product in the page
When user enters the product name and clicks on submit button
Then user will  Validate that same product is displayed on searched page by taking screenshot