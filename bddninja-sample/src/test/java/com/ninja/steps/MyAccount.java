package com.ninja.steps;

import cucumber.api.java.en.And;
import org.testng.Assert;

public class MyAccount {
    com.ninja.pages.MyAccount acc = new com.ninja.pages.MyAccount();
    @And("^I click on my account$")
    public void iClickOnMyAccount() {
        acc.clickMyAcc();
    }

    @And("^I click on register$")
    public void iClickOnRegister() {
        acc.clickRegister();
    }

    @And("^I verify the register page \"([^\"]*)\"$")
    public void iVerifyTheRegisterPage(String rg)  {
        String reg= acc.registerText();
        Assert.assertEquals(rg,reg,"validating register account");
    }

    @And("^I verify the login page \"([^\"]*)\"$")
    public void iVerifyTheLoginPage(String logintxt) throws Throwable {
        String Actuallogintxt= acc.loginText();
        Assert.assertEquals(logintxt,Actuallogintxt,"validating login page");
    }

    @And("^I click on login$")
    public void iClickOnLogin() {
        acc.clickLogin();
    }

    @And("^I enter all details$")
    public void iEnterAllDetails() {
        acc.filldetails();
    }

    @And("^I verify acc created \"([^\"]*)\"$")
    public void iVerifyAccCreated(String acccrt)  {
        String acccreat=acc.acccreationtxt();
        Assert.assertEquals(acccrt,acccreat,"validating acc creation");
    }

    @And("^I click continue$")
    public void iClickContinue() {
        acc.clickcontinue();
    }

    @And("^I click on my account on page$")
    public void iClickOnMyAccountOnPage() {
        acc.clickAccountButton();
    }

    @And("^I logout$")
    public void iLogout() {
        acc.clicklogout();
    }

    @And("^I verify text for logging out \"([^\"]*)\"$")
    public void iVerifyTextForLoggingOut(String acclogout) {
        String Actuallogout = acc.accLogouttxt();
        Assert.assertEquals(acclogout,Actuallogout,"validating the logout");
    }

    @And("^I continue to main page$")
    public void iContinueToMainPage() {
        acc.finalcontinue();
    }

    @And("^I enter login details$")
    public void iEnterLoginDetails() {
        acc.loginDetails();
    }

    @And("^I click continue to login$")
    public void iClickContinueToLogin() {
        acc.clickLoginbutton();
    }

    @And("^I verify my account \"([^\"]*)\"$")
    public void iVerifyMyAccount(String arg4)  {
        String actxt= acc.accountText();
        Assert.assertEquals(arg4,actxt,"validating the account");
    }
}
