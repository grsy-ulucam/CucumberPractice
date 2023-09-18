Feature: Google Search Test

  Background: Users is on google page in every scenario
    Given User is on google page

    Scenario: User see samsung when when user search samsung on google page
      When User search samsung on google page
      Then User verify samsung result

  Scenario: User see cucumber when when user search samsung on google page
    When User search cucumber on google page
    Then User verify cucumber result

  Scenario: User see selenium when when user search samsung on google page
    When User search selenium on google page
    Then User verify selenium result