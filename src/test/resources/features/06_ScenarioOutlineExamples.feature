Feature: Amazon Search Feature

  Scenario Outline: User can see result of product when searching a product
    Given User is on amazon page
    When User search "<product>" on amazon page.
    Then User verify "<product>" result.
    And  User take screen shoot on page
    And  User close browser

    Examples:
    |product|
    | mac   |
    |windows|
    | linux |
