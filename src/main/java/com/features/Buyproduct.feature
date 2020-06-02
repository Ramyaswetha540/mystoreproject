Feature: Buy product test
Scenario: Buy product

Given user is on homepage and clicks signinlink
Then user enter emailaddress and password and click submitbutton
Then user mousehover on Women and clicks submenu T-shirts 
When user mousehover on displayed product and clicks the more button
Then user increase the quantity and select size and colour
And user clicks on Add to Cart button
And user clicks on Proceed to checkout button
When user performs shoppingprocess
Then user successfully order the product

