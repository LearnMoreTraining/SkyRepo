package utilities;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {

    WebDriver driver;
    public void launchBrowser() throws IOException {

        File file = new File("src/main/resources/configurations/frameworkconfig.properties");
        FileInputStream fis = new FileInputStream(file); // read
        Properties prop = new Properties();
        prop.load(fis);
        if( prop.getProperty("browser").equalsIgnoreCase("chrome")){
         driver = new ChromeDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
          driver = new EdgeDriver();
        }
        else if(prop.getProperty("browser").equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }
        else{
           throw new InvalidArgumentException("enter valid browser name");
        }

        driver.get(prop.getProperty("environment"));
    }
}
