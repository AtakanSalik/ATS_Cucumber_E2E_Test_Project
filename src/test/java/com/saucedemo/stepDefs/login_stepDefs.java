package com.saucedemo.stepDefs;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_stepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the Saucedemo login page")
    public void user_is_on_the_saucedemo_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.login();
    }

    @Then("User should be able to see {string}")
    public void userShouldBeAbleToSee(String text) {
        loginPage.VerifyIsUserLogin(text);
    }
}
