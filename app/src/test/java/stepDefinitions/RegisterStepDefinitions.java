package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterStepDefinitions {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("I am on the ParaBank website")
    public void iAmOnTheParaBankHomePage(){
        homePage.navigateToHomePage();
    }
    @When("I click on the register button")
    public void iClickOnTheRegisterButton(){
        homePage.clickOnRegisterPageLink();
    }
    @Then("I should see the ParaBank register page")
    @Given("I am on the ParaBank website register page")
    public void iShouldSeeTheParaBankRegisterPage(){
        assertTrue(registerPage.isSignUpPageTxtDisplayed());
    }
    @When("I enter {string} , {string} , {string} , {string} , {string} , {int} , {int} , {int} , {string} , {string} , {string}")
    public void i_enter(String fname, String lname, String address, String city, String state, Integer zip, Integer phone, Integer ssn, String username, String pswd, String cnfpswd) {
        registerPage.enterDataInRegisterForm(fname, lname, address, city, state,  zip,  phone,  ssn,  username,  pswd,  cnfpswd);
    }
    @Then("I should see the Welcome message")
    public void i_should_see_the_welcome_message() {
        registerPage.isWelcomeTxtDisplayed()
    }
}
