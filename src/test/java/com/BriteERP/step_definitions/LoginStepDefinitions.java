package com.BriteERP.step_definitions;

import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilities.ConfigurationReader;
import com.BriteERP.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginStepDefinitions {


    LoginPage loginPage = new LoginPage();


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("bitRix_url"));
    }


    @When("User logs in this credentials")
    public void user_logs_in_this_credentials() {

        loginPage.login();
    }


    @Then("User should see the dashboard")
    public void user_should_see_the_dashboard() {

        String expected = "Portal";
        String actual = Driver.getDriver().getTitle();

        Assert.assertTrue(actual.contains((expected)));
    }

}
