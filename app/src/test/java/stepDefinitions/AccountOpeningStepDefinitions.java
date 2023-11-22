package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountOpeningPage;
import pages.HomePage;

public class AccountOpeningStepDefinitions {

    HomePage homePage =  new HomePage();
    AccountOpeningPage accountOpeningPage = new AccountOpeningPage();

    @Given("I am on the Open New Account Page")
    public void i_am_on_the_open_new_account_page() {
        accountOpeningPage.clickOnAccountOpeningPageLink();
    }
    @When("I choose account type and select any old account to transfer funds in new account and click open account button")
    public void i_choose_account_type_and_select_any_old_account_to_transfer_funds_in_new_account_and_click_open_account_button() {
    }
    @Then("I should see the Account Opened page")
    public void i_should_see_the_account_opened_page() {
    }
    @And("I should see the new clickable account no")
    public void i_should_see_the_new_clickable_account_no() {
    }
}
