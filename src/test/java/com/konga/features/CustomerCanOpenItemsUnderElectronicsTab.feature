Feature: Open_Item_Under_Electronics_Tab

  Scenario Outline: Customer can open item under electronics tab
    Given I navigate to Konga homepage
    When I hover on "<Item>" Tab
    And I click on "<Sub_Item>"
    Then Televisions page was displayed



    Examples: Search Teas Data
      | Item        | Sub_Item                        |
      | Electronics | Televisions                     |
      | Electronics | DVD Players and Recorders       |
      | Electronics | Cameras                         |
      | Electronics | Accessories                     |
      | Electronics | Home Theatres And Audio Systems |
      | Electronics | Games And Consoles              |
      | Electronics | Electronic Bundles              |
