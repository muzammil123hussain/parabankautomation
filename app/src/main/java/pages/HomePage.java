package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    private final By registerLink = By.linkText("Register");


    public HomePage() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToHomePage() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    public RegisterPage clickOnRegisterPageLink() {
        driver.findElement(registerLink).click();
        return new RegisterPage();
    }
}
