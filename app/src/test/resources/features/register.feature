Feature: Register On ParaBank website

  Scenario: Opening ParaBank website register page
    Given I am on the ParaBank website
    When I click on the register button
    Then I should see the ParaBank register page

  Scenario Outline: Register user with valid data on ParaBank website
    Given I am on the ParaBank website register page
    When I enter <firstname> , <lastname> , <address> , <city> , <state> , <zipcode> , <phone> , <ssn> , <username> , <password> , <confirm>
    Then I should see the Welcome message
    Examples:
      | firstname | lastname | address       | city    | state | zipcode | phone       | ssn  | username | password | confirm  |
      | "muzammil"  | "hussain"  | "H-99 karachi" | "Karachi" | "Sindh" | 78998   | 03001111111 | 9988 | "muzammil" | "muzammil" | "muzammil" |
