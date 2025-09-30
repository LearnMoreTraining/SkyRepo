package pageobjects;

import io.cucumber.java.et.Ja;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ExcelHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonHomePage {

    WebDriver driver ; // null knowlege


    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }

    public AmazonHomePage selectCategoryDropdownBasedOnValue(String value){
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
        categoryDropdown.selectByValue(value);
        return this;

    }

    public AmazonHomePage selectCategoryDropdownBasedOnIndex(int index){
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
        categoryDropdown.selectByIndex(index);
        return this;
    }

    public AmazonHomePage enterProductName(String sheet, int row , int col){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(ExcelHandler.getExcelData(sheet,row,col));
        return this;
    }

    public AmazonHomePage enterProductName(String productName){

        try{
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        }
        catch(ElementNotInteractableException e){

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='hello'",driver.findElement(By.id("twotabsearchtextbox")));
           String valu = (String) js.executeScript("return arguments[0].value",driver.findElement(By.id("twotabsearchtextbox")));
        }
        return this;
    }

    public void clickIcon(){
        try {
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
         }
        catch(ElementClickInterceptedException e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")));

            js.executeScript("window.scrollBy(0,500)","");

            js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")));
        }
    }

    public List<String> extractDropdownValue(){
        List<String> value = new ArrayList<String>(); // emptylist
                WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        categoryElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        int dropdownSize = categoryElement.findElements(By.tagName("option")).size();
        System.out.println(dropdownSize);
        for(int i=0 ; i < dropdownSize ; i++ ){
            String dropdownValue = categoryElement.findElements(By.tagName("option")).get(i).getText();
           value.add(dropdownValue);
        }
        return value;
    }

    public void clickBabyWishList(){
        WebElement element = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.clickAndHold(element).build().perform();
       // driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
       // driver.findElement(By.partialLinkText("got Your Passwo")).click();
        action.scrollToElement(driver.findElement(By.linkText("About Amazon"))).build().perform();
    }

    public void switchToWindow(){
        String parentWindow = driver.getWindowHandle();
       Set<String> winProperty = driver.getWindowHandles();
       String childWindow = null ;

//        Iterator<String> i = winProperty.iterator();
//        i.next(); //parent window
//       String childwin = i.next(); //firstchild
  //      driver.switchTo().window(childwin);

       for(String a:winProperty){
           if(!a.equals(parentWindow)){
               childWindow = a;
               break;
           }
       }
        System.out.println(winProperty);
        driver.switchTo().window(childWindow);
    }

    public String getBabyText(){

     //   driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected();
//        String a = driver.findElement(By.cssSelector("#marketDate_2")).getAttribute("style");
//        //display: block; opacity: 1; pointer-events: inherit;
//
//        if(a.contains("1")){
//
//        }
//        else{
//
//        }
//
       return driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).getText();
    }

}
