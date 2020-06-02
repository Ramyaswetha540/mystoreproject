Feature: Mystore Signin Test
Scenario: Create new account

Given user opens browser and user is on homepage
Then user clicks on siginlink 
Then user enter emailaddress in create new account 
When user clicks on create an account
Then user enter following details 
 |Firstname|Lastname|Email|Password|firstname|lastname|Address|City|Zip|Mobilenum|Alias|
 |micky|mouse|bluesky@gmail.com|micky|minne|mouse|1850|Edison|08803|7345567892|Newyork|
Then user clicks on registration button