package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    WebDriver driver ; //Global Variable

    @When("user enter the user name {string} and password {string}")
    public void enterUserName(String userName , String password){

        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.name("pw")).sendKeys(password);
    }

    @Given("user navigates to the login page of salesforce application")
    public void loginPage(){

        driver = new ChromeDriver();  //local variable
        driver.get("https://login.salesforce.com/");

    }

    @And("user clicks the login button")
    public void clickLoginButton() {

        driver.findElement(By.id("Login")).click();
    }

    @Then("user validate the error message")
    public void validateErrorMessage() {

        driver.findElement(By.id("error")).getText();
    }

    @Then("user should navigate to homepage")
    public void homepage() {

    }
}
