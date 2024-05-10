package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;


import java.time.Duration;

import static java.time.Duration.*;

public class LoginPage {
     Duration timeout = ofSeconds(10);
   static BrowserDriver browserDriver = new BrowserDriver();
    WebDriverWait wait = new WebDriverWait(browserDriver.getDriver(), timeout);
    public static String userName_input_xpath="//*[@id=\"mat-input-0\"]";
    public static String password_input_xapth="//*[@id=\"mat-input-1\"]";
    public static String login_button_xpath="/html/body/app-root/app-signin-signup/div/div[1]/div[2]/div[4]/button";
  static  WebDriver driver = browserDriver.getDriver();
    public static void sendkeys_username() throws InterruptedException {
        if(driver!=null) {
            Thread.sleep(5000);
            driver.findElement(By.xpath(userName_input_xpath)).sendKeys("manikanta1995k@gmail.com");
        }else{
            System.out.println("Driver is not initialized");
    }
    }
    public static void sendKeys_password(){
        if(driver!= null) {
            driver.findElement(By.xpath(password_input_xapth)).sendKeys("simpoAdmin@1357");
        }else {
            System.out.println("Driver is not initialized");
        }

    }
    public static void click_submit_button(){
        if(driver!=null) {
            driver.findElement(By.xpath(login_button_xpath)).click();
        }else {
            System.out.println("Driver is not initialized");
        }

    }
}
