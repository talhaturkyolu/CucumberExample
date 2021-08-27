package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SeleniumTestStep_definition {
    WebDriver driver= Driver.getDriver();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        driver.get("");

    }



    @And("user enters password and username with valid credentials")
    public void userEntersPasswordAndUsernameWithValidCredentials() {
        LoginPage login=new LoginPage();
        login.login("store manager");


    }

    @And("user should verify the title is on {string}")
    public void userShouldVerifyTheTitleIsOn(String homePage) {
       String ff= driver.getTitle();
        Assert.assertEquals(homePage,ff);
    }
}
