package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends HomePage{

    private final By signUpText = By.className("title");
    private final By fnameLocator = By.id("customer.firstName");
    private final By lnameLocator = By.id("customer.lastName");
    private final By addressLocator = By.id("customer.address.street");
    private final By cityLocator = By.id("customer.address.city");
    private final By stateLocator = By.id("customer.address.state");
    private final By zipLocator = By.id("customer.address.zipCode");
    private final By phoneLocator = By.id("customer.phoneNumber");
    private final By ssnLocator = By.id("customer.ssn");
    private final By usernameLocator = By.id("customer.username");
    private final By passwordLocator = By.id("customer.password");
    private final By confirmPasswordLocator = By.id("repeatedPassword");
    private final By registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
    private final By welcomeText = By.className("title");
    private final By logoutTxt = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");


    public boolean isSignUpPageTxtDisplayed() {
        return driver.findElement(signUpText).isDisplayed();
    }

    public void enterDataInRegisterForm(String fname, String lname, String address, String city, String state, Integer zip, Integer phone, Integer ssn, String username, String pswd, String cnfpswd) {
        driver.findElement(fnameLocator).sendKeys(fname);
        driver.findElement(lnameLocator).sendKeys(lname);
        driver.findElement(addressLocator).sendKeys(address);
        driver.findElement(cityLocator).sendKeys(city);
        driver.findElement(stateLocator).sendKeys(state);
        driver.findElement(zipLocator).sendKeys(zip.toString());
        driver.findElement(phoneLocator).sendKeys(phone.toString());
        driver.findElement(ssnLocator).sendKeys(ssn.toString());
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(pswd);
        driver.findElement(confirmPasswordLocator).sendKeys(cnfpswd);
        driver.findElement(registerButton).click();
    }

    public boolean isWelcomeTxtDisplayed() {
        return driver.findElement(welcomeText).isDisplayed();
    }
    public String getWelcomeTxt() {
        return driver.findElement(welcomeText).getText();
    }
    public boolean isLogoutTxtDisplayed() {
        return driver.findElement(logoutTxt).isDisplayed();
    }
}
