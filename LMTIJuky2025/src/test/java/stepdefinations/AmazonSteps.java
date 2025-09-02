package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSearchResultPage;
import utilities.BrowserBase;
import utilities.PageObjectManager;

import java.io.IOException;

public class AmazonSteps {

    WebDriver driver ;
    PageObjectManager pom;


    @Given("user navigates to amazon homepage")
    public void amazonHomePage() throws IOException {
        BrowserBase bb = new BrowserBase();
       driver = bb.launchBrowser();
    }

    @When("user extract the dropdown values")
    public void userExtractTheDropdownValues() {

//        AmazonHomePage amazonHomePage = new AmazonHomePage(driver); //look for the constructor
//        System.out.println( amazonHomePage.extractDropdownValue());

        pom = new PageObjectManager(driver);
        pom.getAmazonHomePage().extractDropdownValue();
    }

    @Then("validate the dropdown vaues")
    public void validateTheDropdownVaues() {
        
    }

    @And("user select the dropdownvalue")
    public void selectValue() {
//        AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
//        amazonHomePage.selectCategoryDropdownBasedOnValue("search-alias=appliances");
        pom.getAmazonHomePage().selectCategoryDropdownBasedOnValue("search-alias=appliances");

    }

    @When("user select baby value from the dropdown and navigate to search page")
    public void userSelectBabyValueFromTheDropdown() {

        //  dropdown
        // input inject
        // click search icon

//        AmazonHomePage homePage = new AmazonHomePage(driver);
//        homePage.selectCategoryDropdownBasedOnIndex(8);
//        homePage.enterProductName("iphone");
//        homePage.clickIcon();

        pom.getAmazonHomePage().selectCategoryDropdownBasedOnIndex(8);
        pom.getAmazonHomePage().enterProductName("iphone");
        pom.getAmazonHomePage().clickIcon();
    }

    @And("sort the product and select the chepest product")
    public void sortTheProductAndSelectTheChepestProduct() {
        AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage();
        searchResultPage.sortProduct();
        searchResultPage.selectProduct();
    }

    @Then("verify the page navigation")
    public void verifyThePageNavigation() {

    }

    @When("user clicks the baby wishlist link")
    public void userClicksTheBabyWishlistLink() {

        AmazonHomePage homePage = new AmazonHomePage(driver);
        homePage.clickBabyWishList();
    }
}
