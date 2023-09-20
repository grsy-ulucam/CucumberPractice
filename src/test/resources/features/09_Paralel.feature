Feature: Parallel Execution

  Scenario Outline: Scenario outline A
    Given Print thread id
    Examples:
    |a|
    |1|
    |2|
    |3|
    |4|

    Scenario: Scenario A
      Given Print thread id

  Scenario: Scenario B
    Given Print thread id