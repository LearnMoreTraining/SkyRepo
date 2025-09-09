package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesforceLoginPage {
    WebDriver driver;

    public SalesforceLoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterUserName(String userName){
      //  driver.findElement(By.id("username")).sendKeys(userName);

     //   driver.findElement(By.xpath("//div[@id='username_container']/child::input[1]")).sendKeys(userName);

        driver.findElement(By.cssSelector("input[id='username']")).sendKeys(userName);
        driver.findElement(By.cssSelector("#username")).sendKeys(userName);

    }

    public void enterPassword(String password){
        driver.findElement(By.name("pw")).sendKeys(password);
    }
}
