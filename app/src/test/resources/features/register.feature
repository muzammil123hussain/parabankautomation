Feature: Register On ParaBank website

  Scenario: Opening ParaBank website
    Given I am on the ParaBank website
    When I click on the register button
    Then I should see the ParaBank register page