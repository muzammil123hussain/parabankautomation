package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver ==  null){
            System.setProperty("webdriver.chrome.driver", "/home/muzammil/Documents/practice/parabankautomation/app/assets/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver !=  null){
            driver.quit();
            driver = null;
        }
    }
}
