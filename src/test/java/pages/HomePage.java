package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;


public class HomePage {

    public static String addIndustry_div_xpath="//*[@id=\"admin_panel\"]/div/div[2]/div/div/div/app-list-industries/section/div[1]/div[2]/div";

    static WebDriver driver = new BrowserDriver().getDriver();
    public static void click_addBusinessIndustry_button() throws InterruptedException {
        if(driver!=null){
        Thread.sleep(200);
        driver.findElement(By.xpath(addIndustry_div_xpath)).click();
    }else {
            System.out.println("Driver is not initialized");
        }

    }

    public static String enter_industry_input_xpath="//*[@id=\"mat-input-6\"]e";

    public static void businessIndustry_creation() throws InterruptedException {
        if(driver!=null){
            Thread.sleep(2000);
            driver.findElement(By.xpath(enter_industry_input_xpath)).sendKeys("testing1");
        }else {
                System.out.println("Driver is not initialized");
            }
    }



}
