package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;
import pageobjects.AmazonSearchResultPage;
import utilities.BrowserBase;
import utilities.PageObjectManager;
import utilities.TestContext;

import java.io.IOException;
import java.util.List;

public class AmazonSteps {
    TestContext context;
    public AmazonSteps(TestContext context){
        this.context = context;
    }

    @Then("validate the dropdown vaues")
    public void validateTheDropdownVaues() {
        boolean flag = false ;
        List<String> val =context.pageObjectManger.getAmazonHomePage().extractDropdownValue();
        for(String j:val ){

            if(j.equals("abc")){
               flag = true;
               break;
            }
        }

        Assert.assertTrue(flag);
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

        context.pageObjectManger.getAmazonHomePage().selectCategoryDropdownBasedOnIndex(8);
        context.pageObjectManger.getAmazonHomePage().enterProductName("iphone");
        context.pageObjectManger.getAmazonHomePage().clickIcon();
    }

    @And("sort the product and select the chepest product")
    public void sortTheProductAndSelectTheChepestProduct() {

        context.pageObjectManger.getSearchPage().sortProduct();
        context.pageObjectManger.getSearchPage().selectProduct();
    }

    @Then("verify the page navigation")
    public void verifyThePageNavigation() {

        String expected = "Baby Wishlist";
        Assert.assertEquals(expected,context.pageObjectManger.getAmazonHomePage().getBabyText());
    }

    @When("user clicks the baby wishlist link")
    public void userClicksTheBabyWishlistLink() {


        context.pageObjectManger.getAmazonHomePage().clickBabyWishList();
        context.pageObjectManger.getAmazonHomePage().switchToWindow();
    }
}
