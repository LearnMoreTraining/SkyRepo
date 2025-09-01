package utilities;

import org.openqa.selenium.WebDriver;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonProductPage;

public class PageObjectManager {

    WebDriver driver;
    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomePage getAmazonHomePage(){
        AmazonHomePage homePage = new AmazonHomePage(driver);
        return homePage;
    }

    public void getAmazonProductPage(){
        AmazonProductPage productPage = new AmazonProductPage(driver);
    }
}
