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
    public void iShouldSeeTheParaBankRegisterPage(){
        System.out.println(registerPage.getSignUpPageTxt());
        assertEquals("SignUp text is not same as expected", registerPage.getSignUpPageTxt(), "Signing up is easy!");
    }

}
