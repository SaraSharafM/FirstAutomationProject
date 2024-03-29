@smoke

Feature: F04_Search | users will be able to search for products with different parameters


  Scenario: user could search using product name
    Given user click on search bar
    When user search for product
    And user click on search Button
    Then user could search successfully and go to search page


  Scenario: user search using SKU
    Given   user click on search bar
    When    user search for product with SKU
    And     user click on search Button
    Then    user could search successfully with SKU


  Scenario: user search using invalid product name
    Given   user click on search bar
    When    user search for product like "Xiaomi"
    And     user click on search Button
    Then    user could not search