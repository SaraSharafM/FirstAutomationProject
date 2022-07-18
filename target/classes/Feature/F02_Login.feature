@smoke
Feature: F02_Login | user should be able to login to the system


Scenario: user login with valid data
When    user navigate to login page
And     user enter valid data
Then    user click on login button
And     user could login successfully and go to home page


Scenario: user login with invalid data
When    user navigate to login page2
And     user enter invalid data
Then    user click on login button2
And     user could not login successfully and go to home page