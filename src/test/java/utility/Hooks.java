package utility;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static BrowserDriver driver;

    public static ChromeOptions options;

    @Before
    public void setUP(){
        driver = new BrowserDriver();
    }
    @After
    public void tearDown(){
        driver.close();
    }


}