package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.WikiPage;
import utilities.BrowserBase;

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

        WikiPage wikiPage = new WikiPage(driver);
        wikiPage.getShareHoldersValue();
        wikiPage.getShareHoldingValue();
    }
}
