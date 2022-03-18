package com.konga.stepDefinitions;

import com.konga.pages.BasePage;
import com.konga.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Open_Item_Under_Electronics_Tab_Steps extends BasePage {

    HomePage homePage = new HomePage(driver);

    @Given("I navigate to Konga homepage")
    public void i_navigate_to_konga_homepage() {
        NavigateToHomePage();
        homePage.acceptCookiesPolicy();

    }

    @When("I hover on {string} Tab")
    public void i_hover_on_tab(String string) {

    }

    @When("I click on {string}")
    public void i_click_on(String string) {

    }

    @Then("Televisions page was displayed")
    public void televisions_page_was_displayed() {

    }
}
