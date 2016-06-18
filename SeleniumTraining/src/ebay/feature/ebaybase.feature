Feature: Titles of ebay pages

  Scenario: check the motor contents
    Given Iam on home page
    When I navigate to "Motors" page
    Then I check contents of the "Motors" page
    And close the browser

  Scenario: check the fashion contents
    Given Iam on home page
    When I navigate to "Fashion" page
    Then I check contents of the "Fashion" page
    And close the browser

  Scenario: check the electronics contents
    Given Iam on home page
    When I navigate to "Electronics" page
    Then I check contents of the "Electronics" page
    And close the browser