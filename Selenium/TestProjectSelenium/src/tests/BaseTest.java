package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    public WebDriver driver;
    String validUsername = "standard_user";
    String validPassword = "secret_sauce";
    
    @Before 
    public void setup(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\QA23\\Desktop\\Selenium\\TestProjectSelenium\\lib\\geckodriver.exe");
        // FirefoxOptions options = new FirefoxOptions();
        // options.setHeadless(true);
        // driver = new FirefoxDriver(options);// ovde gore mu zadas putanju
        driver = new FirefoxDriver();
        // kazes od cega mu zadajes putanju(FIREFOX) i u produzetku putanju
        // driver.manage().window().maximize();// maksimizira firefox
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
