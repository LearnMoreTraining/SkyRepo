package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonSteps {

    WebDriver driver ;
    WebElement dropdown;

    @Given("user navigates to amazon homepage")
    public void amazonHomePage(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @When("user extract the dropdown values")
    public void userExtractTheDropdownValues() {

       dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
       int dropdownSize = dropdown.findElements(By.tagName("option")).size();
        System.out.println(dropdownSize);
        for(int i=0 ; i < dropdownSize ; i++ ){

           String dropdownValue = dropdown.findElements(By.tagName("option")).get(i).getText();
            System.out.println(dropdownValue);
        }

    }

    @Then("validate the dropdown vaues")
    public void validateTheDropdownVaues() {
        
    }

    @And("user select the dropdownvalue")
    public void selectValue() {

        Select s = new Select(dropdown);
      //  s.selectByVisibleText("Baby");
      //  s.selectByIndex(5);
        s.selectByValue("search-alias=computers");

//        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
//        Select currecyDropdown = new Select(currencyElement);
//        currecyDropdown.selectByValue("");

    }
}
