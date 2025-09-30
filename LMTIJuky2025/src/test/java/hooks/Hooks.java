package hooks;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestContext;

public class Hooks {
    TestContext context;
    public  Hooks(TestContext context){
        this.context = context;
    }

    @BeforeStep()
    public void beforeStep(){
        System.out.println("before step");
    }


//    @Before()
//    public void before(){
//        System.out.println("before");
//    }


    @AfterStep()
    public void afterStep(Scenario s){
        System.out.println("after step");
        TakesScreenshot ts = (TakesScreenshot)context.driver;
      byte[] b=  ts.getScreenshotAs(OutputType.BYTES);
      s.attach(b,"image/png",s.getName());
    }

    @After()
    public void after(){

        context.driver.quit();
    }
}
