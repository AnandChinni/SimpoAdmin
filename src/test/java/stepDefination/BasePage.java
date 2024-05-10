package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static pages.LoginPage.*;

import static pages.HomePage.*;

public class BasePage {

    @Given("^user navigate to website$")
    public void navigate_to_simpo_admin_page() throws InterruptedException {
        sendkeys_username();
        sendKeys_password();
        click_submit_button();
    }
    @When("^user successfully enters the log in details$")
    public void click_BusinessIndustry_button() throws InterruptedException {
            click_addBusinessIndustry_button();
    }
    @Then("^user able to navigate to the new page$")
    public void  businessIndustry_creation_page() throws InterruptedException {
        businessIndustry_creation();


    }


}
