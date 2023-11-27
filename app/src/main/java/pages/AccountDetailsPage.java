package pages;

import org.openqa.selenium.By;

public class AccountDetailsPage extends HomePage {
    private final By accountDetailsWelcomeMsg = By.className("title");
    public String getAccountDetailWelcomeMsg(){
        return driver.findElement(accountDetailsWelcomeMsg).getText();
    }
}
