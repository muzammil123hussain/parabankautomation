package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class AccountOpeningPage extends HomePage{
    private final By accountType = By.id("type");
    private final By AccountId = By.id("fromAccountId");
    private final By AccountOpenedWelcomePageMsg = By.className("title");
    private final By newAccountId = By.id("newAccountId");
    private final By OpenAccountBtn = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");

    public void selectAccountType(String accountTypeParam){
        findElements(accountType).selectByVisibleText(accountTypeParam);
    }
    public List<String> getSelectedAccountType(){
        List<WebElement> selectedOptions =  findElements(accountType).getAllSelectedOptions();
        return selectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    public void selectAccountId(){
        findElements(AccountId).selectByIndex(0);
    }
    public void clickOpenAccountBtn(){
        driver.findElement(OpenAccountBtn).click();
    }
    private Select findElements(By dropdownLocator){
        return new Select(driver.findElement(dropdownLocator));
    }
    public String getAccountOpenedWelcomeMsg(){
        return driver.findElement(AccountOpenedWelcomePageMsg).getText();
    }
    public boolean isNewAccountIdVisible(){
        System.out.println(driver.findElement(newAccountId));
        return driver.findElement(newAccountId).isDisplayed();
    }
    public void clickNewAccountId(){
        driver.findElement(newAccountId).click();
    }
}
