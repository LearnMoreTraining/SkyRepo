package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {
    WebDriver driver ;
    public WikiPage(WebDriver driver){
        this.driver = driver;
    }

    public List<String> getShareHoldersValue(){
        List<String> shareholderValue = new ArrayList<String>();
      //  WebElement tableElement = driver.findElement(By.className("wikitable sortable jquery-tablesorter"));
       // WebElement tableElement = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody"));
        int size= driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).size();
        for(int i =0; i < size ; i++){
            shareholderValue.add(driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]")).get(i).getText());
        }
        return shareholderValue;
    }

    public List<String> getShareHoldersValue2(){
        List <String > l = new ArrayList<>();
        List <WebElement> element = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[1]"));
         for(WebElement a:element){
                l.add(a.getText());
         }
         return l;
    }

    public void getShareHoldingValue(){

      for (int h =0 ; h < driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]")).size();h++ ){

         String val = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr/child::td[2]"))
                  .get(h).getText();
          System.out.println(val);

      }

    }

    public String getCellValue(int rowIndex, int columnIndex){
      String val =  driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/child::tbody/child::tr["+rowIndex+"]/child::td["+columnIndex+"]")).getText();
        return val;
    }
}
