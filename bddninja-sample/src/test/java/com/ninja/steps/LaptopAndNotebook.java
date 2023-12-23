package com.ninja.steps;

import com.ninja.pages.LaptopAndNotebooks;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.time.Duration;

import static com.ninja.driverfactory.ManageDriver.driver;

public class LaptopAndNotebook {
    LaptopAndNotebooks obj=new LaptopAndNotebooks();

    @And("^I sort the price high to low$")
    public void iSortThePriceHighToLow() {
        obj.sortit();
    }

    @Then("^I verify price \"([^\"]*)\"$")
    public void iVerifyPrice(String txt)  {
       String actual=obj.sortValue();
        Assert.assertEquals(txt,actual,"validating the price");
    }

    @And("^I select MacBook$")
    public void iSelectMacBook() {
        obj.clickMacBook();
    }



    @And("^I click on cart button$")
    public void iClickOnCartButton() {
        obj.addToCartButton();
    }



    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        obj.clickShoppingCart();
    }

    @And("^I check the text \"([^\"]*)\"$")
    public void iCheckTheText(String arg2) {
     String txt=obj.textShoppingCart();
        Assert.assertEquals(arg2,txt,"validating the shopping cart");
    }




    @And("^I verify  \"([^\"]*)\"$")
    public void iVerify(String prdct)  {
        String actualtext=obj.macbookText();
        Assert.assertEquals(prdct,actualtext,"validating the price");
    }


    @And("^I verify success text \"([^\"]*)\"$")
    public void iVerifySuccessText(String arg){
        String ActualText1=obj.successCartText();
        String[] ar=ActualText1.split("\\R");
        String Actualmsgs = ar[0];
        Assert.assertEquals(arg,Actualmsgs,"validating the success message");

    }

    @And("^I verify the product \"([^\"]*)\"$")
    public void iVerifyTheProduct(String txts) {
        String actualmsg=obj.Macbooktextverify();
        Assert.assertEquals(txts,actualmsg,"validating the product");


    }


    @And("^I update the quantity$")
    public void iUpdateTheQuantity() {
        obj.updatequantity();
    }

    @And("^I verify updated cart text \"([^\"]*)\"$")
    public void iVerifyUpdatedCartText(String updateText)  {
        String ActualtxtMsg= obj.updateCartText();
        String[] artxt=ActualtxtMsg.split("\\R");
        String Actualmsgs1 = artxt[0];
        Assert.assertEquals(updateText,Actualmsgs1,"validating the text");

    }

    @And("^I verify total price \"([^\"]*)\"$")
    public void iVerifyTotalPrice(String totalprc)  {
       String actualtotalprice=obj.totalPrice();
        Assert.assertEquals(totalprc,actualtotalprice,"validating the total price");
    }


    @And("^I click Checkout$")
    public void iClickCheckout() {
        obj.clickCheckOut();
    }

    @And("^I verify the checkout page \"([^\"]*)\"$")
    public void iVerifyTheCheckoutPage(String txtcheckout)  {
        String actualCheckout= obj.checkoutText();
        Assert.assertEquals(txtcheckout,actualCheckout,"validating the checkout text");
    }

    @And("^I verify the text for new customer \"([^\"]*)\"$")
    public void iVerifyTheTextForNewCustomer(String txtnewcustomer) {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        String newcustomer= obj.newCustomerText();
        Assert.assertEquals(txtnewcustomer,newcustomer,"validating the new customer text");
    }

    @And("^I click on guest checkout button$")
    public void iClickOnGuestCheckoutButton() {
        obj.clickGuestbutton();
    }

    @And("^I click continue to fill the details$")
    public void iClickContinueToFillTheDetails() {
        obj.clickContinueButton();
    }

    @And("^I fill all the details$")
    public void iFillAllTheDeatails() {
        obj.details();
        obj.giveregionvalue();
        obj.clickContinueButton1();

    }

    @And("^I write comment$")
    public void iWriteComment() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        obj.writeComment();
    }

    @And("^I verify warning text \"([^\"]*)\"$")
    public void iVerifyWarningText(String Text3) {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
        String txtwarning = obj.getWarningText();
        String[] wrtxt=txtwarning.split("\\R");
        String wrnmsg = wrtxt[0];
        Assert.assertEquals(Text3,wrnmsg,"validating the warning");
    }
}
