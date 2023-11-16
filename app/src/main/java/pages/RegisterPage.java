package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends HomePage{
    private final By signUpText = By.className("title");

    public String getSignUpPageTxt() {
        return driver.findElement(signUpText).getText();
    }
}
