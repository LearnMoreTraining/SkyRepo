package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.WikiPage;
import utilities.BrowserBase;
import utilities.PageObjectManager;

import java.io.IOException;

public class WikiSteps {

    WebDriver driver;

    @Given("user navigates to wiki page")
    public void navigateWiki() throws IOException {
        BrowserBase b = new BrowserBase();
         driver =b.launchBrowser();
    }

    @When("user extracts the value from the table")
    public void userExtractsTheValueFromTheTable() {
        PageObjectManager pom = new PageObjectManager(driver);
        System.out.println(pom.getWikiPage().getShareHoldersValue2());

        Assert.assertEquals("Promoters group",pom.getWikiPage().getShareHoldersValue2().get(3));

//        WikiPage wikiPage = new WikiPage(driver);
//        wikiPage.getShareHoldersValue();
//        wikiPage.getShareHoldingValue();
//        wikiPage.getCellValue(2,1);
    }
}
