package com.ninja.pages;

import com.ninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Desktop extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[contains(@id,'input-sort')]/option[3]")
    WebElement sortZtoA;

    @CacheLookup
    @FindBy(xpath = "//div[@id='product-category']/div[1]/div/div[4]/div[1]/div[1]/div[2]/div[1]/h4")
    WebElement sonyvio;

    @CacheLookup
    @FindBy(xpath = "//select[contains(@id,'input-sort')]/option[2]")
    WebElement sortAtoZ;

    @CacheLookup
    @FindBy(xpath = "//a[text()='HP LP3065']")
    WebElement productHPLp;
    @CacheLookup
    @FindBy(xpath = "//div[@class='col-sm-4']/h1")
    WebElement textHpLp;

    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group date']/span")
    WebElement calender;

    @CacheLookup
    @FindBy(xpath= "//th[text()='April 2011']")
    WebElement dateyearchanger;

    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker-months']/table/thead/tr/th[2]")
    WebElement montharrow;

    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker-years']/table[@class='table-condensed']/thead/tr/th[3]")
    WebElement yeararrow;
    @CacheLookup
    @FindBy(xpath = "//span[text()='2022']")
    WebElement year2022;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Nov']")
    WebElement monthNov;
    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr[5]/td[3]")
    WebElement date30;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantity;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement cartbutton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successmessage;

    @CacheLookup
    @FindBy(xpath = "//a[text()='shopping cart']")
    WebElement shoppingcart;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Shopping Cart']")
    WebElement textshoppingcart;

    @CacheLookup
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[2]/a[text()='HP LP3065']")
    WebElement HpText;

    @CacheLookup
    @FindBy(xpath = "//small[text()='Delivery Date:2022-11-30']")
    WebElement deliverydatetext;

    @CacheLookup
    @FindBy(xpath = "//td[text()='Product 21']")
    WebElement TextProduct;
    @CacheLookup
    @FindBy(xpath = "//table[@class='table table-bordered']/tbody/tr/td[6]")
    WebElement TextPrice;

    public void sortZtoA(){
        clickOnElement(sortZtoA);
    }

    public String sortZtoAtext(){
         return getTextFromElement(sonyvio);
    }
    public  void sortAtoZ(){
        clickOnElement(sortAtoZ);
    }
    public void selectHp(){
        clickOnElement(productHPLp);
    }
    public String textHplp(){
        return getTextFromElement(textHpLp);
    }

    public void selectdate11nov(){
        clickOnElement(calender);
        clickOnElement(dateyearchanger);
        clickOnElement(montharrow);
        clickOnElement(yeararrow);
        clickOnElement(year2022);
        clickOnElement(monthNov);
        clickOnElement(date30);

    }

    public void clickAddToCart(){
        clickOnElement(quantity);
    }
    public void clickcart(){
        clickOnElement(cartbutton);
    }

    public String showsuccessmsg(){
        return getTextFromElement(successmessage);
    }

    public void clickshoppingcart(){
        clickOnElement(shoppingcart);
    }
    public String textshoppingCart(){
        return getTextFromElement(textshoppingcart);
    }
    public String textHp(){
        return getTextFromElement(HpText);
    }

    public String textDeliveryDate(){
        return getTextFromElement(deliverydatetext);
    }

    public String textProduct(){
        return getTextFromElement(TextProduct);
    }
    public String textPrice(){
        return getTextFromElement(TextPrice);
    }
}
