Feature: New Account Opening On ParaBank website

  Scenario: Opening New Account in ParaBank
  Given I am on the Open New Account Page
  When I choose account type and select any old account to transfer funds in new account and click open account button
  Then I should see the Account Opened page
  And I should see the new clickable account no