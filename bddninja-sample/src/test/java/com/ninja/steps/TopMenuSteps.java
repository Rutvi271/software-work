package com.ninja.steps;

import com.ninja.pages.TopMenuTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    TopMenuTest topMneutest= new TopMenuTest();


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    @When("^I click on Desktops$")
    public void iClickOnDesktops() {
        topMneutest.clickdesktop();
    }

    @And("^I click on Show All Desktop$")
    public void iClickOnShowAllDesktop() {
        topMneutest.clickshowall();
    }



    @Then("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String txt) {
       String desktoptxt = topMneutest.gettext();
        Assert.assertEquals(txt,desktoptxt,"validating Desktop text");
    }


    @When("^I click on Laptops and Notebook$")
    public void iClickOnLaptopsAndNotebook() {
        topMneutest.clickLaptopAndNotebook();

    }

    @And("^I click on show all Laptops and Notebook$")
    public void iClickOnShowAllLaptopsAndNotebook() {
        topMneutest.clickshowallLaptopandNotebook();
    }

    @Then("^I am verifying text \"([^\"]*)\"$")
    public void iAmVerifyingText(String txt1) {
        String laptopandnotebook=topMneutest.gettextLaptopAndNotebook();
        Assert.assertEquals(txt1,laptopandnotebook,"validating laptops and notebooks");
    }

    @When("^I click on Components$")
    public void iClickOnComponents() {
        topMneutest.clickcomponent();
    }

    @And("^I click on show all Components$")
    public void iClickOnShowAllComponents() {
        topMneutest.clickshowallComponents();
    }

    @Then("^I verify \"([^\"]*)\"$")
    public void iVerify(String text2) {
        String component=topMneutest.gettextComponents();
        Assert.assertEquals(text2,component,"validating components");
    }
}

