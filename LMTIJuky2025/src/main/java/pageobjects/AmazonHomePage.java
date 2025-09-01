package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AmazonHomePage {

    WebDriver driver ; // null knowlege


    public AmazonHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void selectCategoryDropdownBasedOnValue(String value){
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
        categoryDropdown.selectByValue(value);

    }

    public void selectCategoryDropdownBasedOnIndex(int index){
        WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));
        Select categoryDropdown = new Select(categoryElement);
        categoryDropdown.selectByIndex(index);
    }

    public void enterProductName(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public void clickIcon(){

        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
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
        driver.findElement(By.linkText("Baby Wishlist")).click();
       // driver.findElement(By.partialLinkText("got Your Passwo")).click();
    }

}
