Feature: Titles of ebay pages

  Scenario Outline: check the page contents
    Given Iam on home page
    When I navigate to <link> page
    Then I check contents of the <title> page

    Examples: 
      | link        | title       |
      | Motors      | Motors      |
      | Fashion     | Fashion     |
      | Electronics | Electronics |
