package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesforceLoginPage {
    WebDriver driver;

    public void enterUserName(String userName){
        driver.findElement(By.id("username")).sendKeys(userName);

    }

    public void enterPassword(String password){
        driver.findElement(By.name("pw")).sendKeys(password);
    }
}
