Feature: Google Search Feature

  Scenario Outline: Product Search On Google
    Given User is on google page
    When User search "<search>" on google page
    Then User verify "<verify>" result



    Examples:
    |search  |verify  |
    |samsung |samsung |
    |cucumber|cucumber|
    |selenium|selenium|
