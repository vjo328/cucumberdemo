Feature: Test the login functionality in orange HRM website

Scenario: Test the login for particular user

Given user is in login page
When user enters username and password 
And user clicks on submit button
Then user lands on dashboard


Scenario: Test the valid login for second user

Given user is in login page
When user enters username and password 
And user clicks on submit button
Then user lands on dashboard

