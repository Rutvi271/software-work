package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")
    WebElement myacc;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Register']")
    WebElement register;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Login']")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]/div/h2")
    WebElement loginText;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstname;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastname;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmpassword;
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-10']/label[1]/input[@name='newsletter']")
    WebElement newsletterbutton;
    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement Checkboxbutton;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement Continuebutton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement accCreatedtext;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement Continuebutton1;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")
    WebElement myaccountButton;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutbutton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement acclogout;
    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/div[1]/a")
    WebElement continue2;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement Loginbutton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    WebElement accountText;


    public void clickMyAcc(){
        clickOnElement(myacc);
    }
    public void clickRegister(){
        clickOnElement(register);
    }
    public String registerText(){
        return getTextFromElement(registerText);
    }
    public void clickLogin(){
        clickOnElement(login);
    }
    public String loginText(){
        return getTextFromElement(loginText);
    }
    public void filldetails(){
        firstname.sendKeys("code");
        lastname.sendKeys("buster");
        email.sendKeys("cryuyuyte5674@gmail.com");
        telephone.sendKeys("0343453555");
        password.sendKeys("@123456");
        confirmpassword.sendKeys("@123456");
        clickOnElement(newsletterbutton);
        clickOnElement(Checkboxbutton);
        clickOnElement(Continuebutton);
    }
public String acccreationtxt(){
        return getTextFromElement(accCreatedtext);
}
public void clickcontinue(){
        clickOnElement(Continuebutton1);
}
public void clickAccountButton(){
        clickOnElement(myaccountButton);
}
public void clicklogout(){
        clickOnElement(logoutbutton);
}
public String accLogouttxt(){
        return getTextFromElement(acclogout);
}
public void finalcontinue(){
        clickOnElement(continue2);
}
public void loginDetails(){
    email.sendKeys("cryuyuyte5674@gmail.com");
    password.sendKeys("@123456");
}
public void clickLoginbutton(){
        clickOnElement(Loginbutton);
}
public String accountText(){
        return getTextFromElement(accountText);
}
}
