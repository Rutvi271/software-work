package com.ninja.steps;

import com.ninja.pages.Desktop;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DesktopStep {
    Desktop desktop=new Desktop();

    @And("^I sort Z to A$")
    public void iSortZToA() {
        desktop.sortZtoA();
    }

    @Then("^I am verifying sorting \"([^\"]*)\"$")
    public void iAmVerifyingSorting(String txt) {
        String sort=desktop.sortZtoAtext();
        Assert.assertEquals(txt,sort,"validating sorting");
    }

    @And("^I sort it A to Z$")
    public void iSortItAToZ() {
        desktop.sortAtoZ();
    }

    @And("^I select product HP LP(\\d+)$")
    public void iSelectProductHPLP(int arg0) {
        desktop.selectHp();
    }

    @Then("^I verify text  \"([^\"]*)\"$")
    public void iVerifyText(String txt1)  {
        String sort1=desktop.textHplp();
        Assert.assertEquals(txt1,sort1,"validating product");
    }

    @And("^I select date$")
    public void iSelectDate() {
        desktop.selectdate11nov();
    }

    @Then("^I add quantity$")
    public void iAddQuantity() {
        desktop.clickAddToCart();
    }

    @And("^I click cart button$")
    public void iClickCartButton() {
        desktop.clickcart();
    }

    @And("^I verify success message \"([^\"]*)\"$")
    public void iVerifySuccessMessage(String txt2) {
        String ActualText1= desktop.showsuccessmsg();
        String[] ar=ActualText1.split("\\R");
        String ActualText = ar[0];
        Assert.assertEquals(txt2,ActualText,"validating successs message");
    }

    @And("^I click on shopping cart on message$")
    public void iClickOnShoppingCartOnMessage() {
        desktop.clickshoppingcart();
    }

    @And("^I verify shopping cart text \"([^\"]*)\"$")
    public void iVerifyShoppingCartText(String txt3){
        String actual=desktop.textshoppingCart();
        Assert.assertEquals(txt3,actual,"validating text shoppingcart");
    }

    @And("^I verify product name \"([^\"]*)\"$")
    public void iVerifyProductName(String txt4)  {
        String actual1=desktop.textHp();
        Assert.assertEquals(txt4,actual1,"validating text Hp");
    }

    @And("^I verify delivery date \"([^\"]*)\"$")
    public void iVerifyDeliveryDate(String txt5)  {
        String actual2=desktop.textDeliveryDate();
        Assert.assertEquals(txt5,actual2,"validating delivery date");

    }

    @Then("^I verify the price \"([^\"]*)\"$")
    public void iVerifyThePrice(String txt6)  {
        String actual3=desktop.textPrice();
        Assert.assertEquals(txt6,actual3,"validating price");
    }

    @And("^I verify product \"([^\"]*)\"$")
    public void iVerifyProduct(String txt7)  {
        String actual4=desktop.textProduct();
        Assert.assertEquals(txt7,actual4,"validating product");
    }
}
