package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiPage {
    WebDriver driver ;
    public WikiPage(WebDriver driver){
        this.driver = driver;
    }

    public void getShareHoldersValue(){

      //  WebElement tableElement = driver.findElement(By.className("wikitable sortable jquery-tablesorter"));
       // WebElement tableElement = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody"));
        int size= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for(int i =0; i < size ; i++){
           String val= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText();
            System.out.println(val);
        }
    }

    public void getShareHoldingValue(){

      for (int h =0 ; h < driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();h++ ){

         String val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                  .get(h).getText();
          System.out.println(val);

      }

    }
}
