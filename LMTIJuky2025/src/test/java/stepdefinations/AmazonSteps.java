package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSteps {

    WebDriver driver ;

    @Given("user navigates to amazon homepage")
    public void amazonHomePage(){
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

    @When("user extract the dropdown values")
    public void userExtractTheDropdownValues() {

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
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
}
