package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import utilities.PageObjectManager;
import utilities.TestContext;

public class PayLaterSteps {
    TestContext context;
    public PayLaterSteps(TestContext context){
        this.context = context;
    }

    @Given("Hello")
    public void m1(){
        
    }

    @When("abc")
    public void abc() {

    }

    @When("user extract the dropdown values")
    public void userExtractTheDropdownValues() {

        context.pageObjectManger.getAmazonHomePage().enterProductName("mosue");
//        AmazonHomePage amazonHomePage = new AmazonHomePage(driver); //look for the constructor
//        System.out.println( amazonHomePage.extractDropdownValue());


        context.pageObjectManger.getAmazonHomePage().extractDropdownValue();
       // context.driver.findElement(By.xpath("[id='eret']")).click();
    }
}
