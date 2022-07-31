#Author
#Date
#Description

Feature: feature to test login functionality

Scenario: check login is sucessful with valid credentials

Given user is on login page
When user enters username and password
And clicks on login button
Then user is navigated to the home page

Scenario Outline: check login is sucessful with valid credentials

Given user is on login page
When user enters <username> and <password>
And clicks on login button
Then user is navigated to the home page

Examples: 
| username | password |
| admin | admin |
