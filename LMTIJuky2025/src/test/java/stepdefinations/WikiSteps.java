package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.WikiPage;
import utilities.BrowserBase;
import utilities.PageObjectManager;

import java.io.IOException;
import java.time.Duration;

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

    @Given("user navigate to learnmore page")
    public void userNavigateToLearnmorePage() {
        BrowserBase b = new BrowserBase();
        driver =b.launchBrowser();
    }

    @When("user handles the wait")
    public void userHandlesTheWait() {
        boolean x;
        driver.findElement(By.cssSelector("#quote")).click();
        try{
             x=  driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).isDisplayed();
        }
        catch(NoSuchElementException e){
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            wait.pollingEvery(Duration.ofSeconds(5));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Hello, Learn More Aspirants']")));
            wait.ignoring(NoSuchElementException.class);
             x=  driver.findElement(By.xpath("//h3[text()='Hello, Learn More Aspirants']")).isDisplayed();
        }
       Assert.assertTrue(x);

       // driver.switchTo().alert().sendKeys("");


    }

    @When("user handle drag and drop")
    public void userHandleDragAndDrop() {
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        WebElement drag = driver.findElement(By.cssSelector("#draggable"));
        WebElement drop = driver.findElement(By.cssSelector("#droppable"));
        Actions a = new Actions(driver);
        a.dragAndDrop(drag,drop).build().perform();
        driver.switchTo().defaultContent();
    }
}
