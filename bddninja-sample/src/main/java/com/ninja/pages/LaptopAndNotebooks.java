package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopAndNotebooks extends Utility {
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sort;

    @CacheLookup
    @FindBy(xpath = "//select[contains(@id,'input-sort')]/option[5]")
    WebElement priceHightoLow;

    @CacheLookup
    @FindBy(xpath = "//div[@class='caption']/p[@class='price']/span")
    WebElement price;
    @CacheLookup
    @FindBy(xpath = "//a[text()='MacBook']")
    WebElement macbook;

    @CacheLookup
    @FindBy(xpath="//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']/a[2]")
    WebElement shoppingCartButton;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Shopping Cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    WebElement macBooktext2;
    @CacheLookup
    @FindBy(xpath = "//a[text()='MacBook']")
    WebElement macBook;

    @CacheLookup
    @FindBy(xpath = "//td[@class='text-left']/div[@class='input-group btn-block']/input[@value='1']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement updatebutton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement updateCartText;
    @CacheLookup
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[6]")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement checkOutbutton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement checkOuttext;

    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-body']/div/div[1]/h2[1]")
    WebElement newCustomertext;
    @CacheLookup
    @FindBy(xpath = "//div[2]/label/input[@name='account']")
    WebElement guestCheckout;
    @CacheLookup
    @FindBy(id = "button-account")
    WebElement continueButton;
    @CacheLookup
    @FindBy(id = "input-payment-firstname")
    WebElement firstname;
    @CacheLookup
    @FindBy(id = "input-payment-lastname")
    WebElement lastname;
    @CacheLookup
    @FindBy(id = "input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-payment-company")
    WebElement company;
    @CacheLookup
    @FindBy(id = "input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "input-payment-city")
    WebElement city;
    @CacheLookup
    @FindBy(id = "input-payment-postcode")
    WebElement postcode;
    @CacheLookup
    @FindBy(id = "input-payment-zone")
    WebElement region;
    @CacheLookup
    @FindBy(xpath = "//option[@value='3553']")
    WebElement regionvalue;
    @CacheLookup
    @FindBy(id = "button-guest")
    WebElement continueButton1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-body']/p[2]/textarea")
    WebElement commentArea;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']/input[@type='checkbox']")
    WebElement checkbox;
    @CacheLookup
    @FindBy(id = "button-payment-method")
    WebElement continueButton2;
    @CacheLookup
    @FindBy(id = "button-confirm")
    WebElement confirmButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningText;
    public void sortit(){
        clickOnElement(sort);
        clickOnElement(priceHightoLow);
    }
    public String sortValue(){
        return getTextFromElement(price);
    }
    public String macbookText(){
        return getTextFromElement(macbook);
    }
    public void addToCartButton(){
        clickOnElement(addToCart);
    }
    public String successCartText(){
        return getTextFromElement(successCart);
    }
    public void clickShoppingCart(){
        clickOnElement(shoppingCartButton);
    }
    public String textShoppingCart(){
        return getTextFromElement(shoppingCartText);
    }
    public String Macbooktextverify(){ return getTextFromElement(macBooktext2);}
    public void clickMacBook(){
        clickOnElement(macBook);
    }
    public void updatequantity(){
        clickOnElement(quantity);
        quantity.clear();
        quantity.sendKeys("2");
        clickOnElement(updatebutton);
    }
    public String updateCartText(){
        return getTextFromElement(updateCartText);
    }
    public String totalPrice(){
        return getTextFromElement(totalPrice);
    }

    public void clickCheckOut(){
        clickOnElement(checkOutbutton);
    }
    public String checkoutText() {
       return getTextFromElement(checkOuttext);
    }
    public String newCustomerText(){
        return getTextFromElement(newCustomertext);
    }

    public void clickGuestbutton(){
        clickOnElement(guestCheckout);
    }
    public void clickContinueButton(){
        clickOnElement(continueButton);
    }
    public void details(){
        firstname.sendKeys("sample");
        lastname.sendKeys("test");
        email.sendKeys("odtere12@gmail.com");
        telephone.sendKeys("07834843894");
        company.sendKeys("asaad");
        address.sendKeys("18 frtgt");
        city.sendKeys("harrow");
        postcode.sendKeys("ha39ak");

    }
    public void giveregionvalue(){
        clickOnElement(region);
        clickOnElement(regionvalue);
    }
    public void clickContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void writeComment(){
        clickOnElement(commentArea);
        commentArea.sendKeys("hellllloooooo iiiittttssss ffuuuunnnnn");
        clickOnElement(checkbox);
        clickOnElement(continueButton2);
    }
    public String getWarningText(){
        return  getTextFromElement(warningText);
    }
}
