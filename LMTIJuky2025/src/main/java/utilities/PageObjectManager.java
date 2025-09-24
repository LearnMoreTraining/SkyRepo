package utilities;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

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

    public WikiPage getWikiPage(){
        WikiPage wikiPage = new WikiPage(driver);
        return wikiPage;
    }

    public AmazonSearchResultPage getSearchPage(){
        AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage();
        return searchResultPage;
    }
}
