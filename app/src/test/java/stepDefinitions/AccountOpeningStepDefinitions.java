package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountDetailsPage;
import pages.AccountOpeningPage;
import static org.junit.Assert.*;

public class AccountOpeningStepDefinitions {
    AccountOpeningPage accountOpeningPage = new AccountOpeningPage();
    AccountDetailsPage accountDetailsPage = new AccountDetailsPage();

    @Given("I am on the Open New Account Page")
    public void i_am_on_the_open_new_account_page() {
        accountOpeningPage.clickOnAccountOpeningPageLink();
    }
    @When("I choose account type and select any old account to transfer funds in new account and click open account button")
    public void i_choose_account_type_and_select_any_old_account_to_transfer_funds_in_new_account_and_click_open_account_button() {
        accountOpeningPage.selectAccountType("SAVINGS");
        assertTrue("SAVINGS not found as selected item", accountOpeningPage.getSelectedAccountType().contains("SAVINGS"));
        accountOpeningPage.selectAccountId();
        accountOpeningPage.clickOpenAccountBtn();
    }
    @Then("I should see the Account Opened page")
    @Given("I am on the Account Opened page")
    public void i_should_see_the_account_opened_page() {
        assertEquals("Welcome Msg not same as expected",accountOpeningPage.getAccountOpenedWelcomeMsg(),"Open New Account");
    }
    @When("I should see the new clickable account no and click the account no")
    public void i_should_see_the_new_clickable_account_no() {
        assertTrue("new account id is not visible",accountOpeningPage.isNewAccountIdVisible());
        accountOpeningPage.clickNewAccountId();
    }
    @Then("I should see the Account Details page")
    public void i_should_see_the_account_details_page() {
        assertEquals("Welcome Msg not same as expected",accountDetailsPage.getAccountDetailWelcomeMsg(),"Account Details");
    }
}
