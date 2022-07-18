@smoke

Feature: F01_Register | users could register with new accounts

  Scenario:  user register with valid data successfully

    Given user go to register page
    When  user choose male or female and enter valid data
    Then  user press on register button
    And   user could register successfully
