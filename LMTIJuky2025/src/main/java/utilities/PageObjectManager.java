package utilities;

import org.openqa.selenium.WebDriver;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonProductPage;
import pageobjects.SalesforceLoginPage;

public class PageObjectManager {

    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage homePage = new AmazonHomePage(driver);
        return homePage;
    }

    public AmazonProductPage getAmazonProductPage(){
        AmazonProductPage productPage = new AmazonProductPage(driver);
        return productPage;
    }

    public SalesforceLoginPage getSalesforceLoginPage(){

        SalesforceLoginPage loginPage = new SalesforceLoginPage(driver);
        return loginPage;
    }
}
