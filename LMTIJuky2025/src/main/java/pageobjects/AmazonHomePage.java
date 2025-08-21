package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage {

    WebDriver driver ; // null knowlege
    WebElement categoryElement = driver.findElement(By.id("searchDropdownBox"));

    public void selectCategoryDropdownBasedOnValue(String value){
        Select categoryDropdown = new Select(categoryElement);
        categoryDropdown.selectByValue(value);

    }

    public void selectCategoryDropdownBasedOnIndex(int index){
        Select categoryDropdown = new Select(categoryElement);
        categoryDropdown.selectByIndex(index);
    }

    public void enterProductName(String productName){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
    }

    public void clickIcon(){

        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
    }

    public void extractDropdownValue(){
        categoryElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        int dropdownSize = categoryElement.findElements(By.tagName("option")).size();
        System.out.println(dropdownSize);
        for(int i=0 ; i < dropdownSize ; i++ ){
            String dropdownValue = categoryElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(dropdownValue);
        }
    }

}
