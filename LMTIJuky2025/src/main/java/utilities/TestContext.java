package utilities;

import org.openqa.selenium.WebDriver;

public class TestContext {

   public WebDriver driver;
   public PageObjectManager pageObjectManger;

    public TestContext(){
        BrowserBase base = new BrowserBase();
        driver = base.launchBrowser();
        pageObjectManger = new PageObjectManager(driver);
    }
}
