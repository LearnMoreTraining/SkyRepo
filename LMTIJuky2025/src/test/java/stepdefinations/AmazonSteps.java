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

import java.io.IOException;

public class AmazonSteps {

    WebDriver driver ;
    WebElement dropdown;

    @Given("user navigates to amazon homepage")
    public void amazonHomePage() throws IOException {
        BrowserBase bb = new BrowserBase();
        bb.launchBrowser();
    }

    @When("user extract the dropdown values")
    public void userExtractTheDropdownValues() {

        AmazonHomePage amazonHomePage = new AmazonHomePage(); //look for the constructor
        amazonHomePage.extractDropdownValue();
    }

    @Then("validate the dropdown vaues")
    public void validateTheDropdownVaues() {
        
    }

    @And("user select the dropdownvalue")
    public void selectValue() {
        AmazonHomePage amazonHomePage = new AmazonHomePage();
        amazonHomePage.selectCategoryDropdownBasedOnValue("search-alias=appliances");
    }

    @When("user select baby value from the dropdown and navigate to search page")
    public void userSelectBabyValueFromTheDropdown() {

        //  dropdown
        // input inject
        // click search icon

        AmazonHomePage homePage = new AmazonHomePage();
        homePage.selectCategoryDropdownBasedOnIndex(8);
        homePage.enterProductName("iphone");
        homePage.clickIcon();

    }

    @And("sort the product and select the chepest product")
    public void sortTheProductAndSelectTheChepestProduct() {
        AmazonSearchResultPage searchResultPage = new AmazonSearchResultPage();
        searchResultPage.sortProduct();
        searchResultPage.selectProduct();
    }
}
