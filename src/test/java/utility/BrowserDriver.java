package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserDriver {

    private ChromeOptions options = new ChromeOptions();
    public  WebDriver driver;

    public BrowserDriver(){
        driver =  new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        options.setBinary("C:\\Users\\Anand\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        driver.manage().window().maximize();
        driver.get("https://simpo-admin.simpo.ai");
    }

    public WebDriver getDriver(){
        return driver;
    }
    public void close(){
        // Close the WebDriver instance
        driver.close();
    }
}



