package com.ninja.pages;

import com.ninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TopMenuTest extends Utility {
    private static final Logger log = LogManager.getLogger(TopMenuTest.class);

    public TopMenuTest() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='container']/nav/div[2]/ul/li[1]")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dropdown-menu']/a[text()='Show AllDesktops']")
    WebElement desktopShowAll;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    WebElement textDesktop;

    @CacheLookup
    @FindBy(xpath = "//div[@class='container']/nav/div[2]/ul/li[2]")
    WebElement laptopAndNotebook;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dropdown-menu']/a[text()='Show AllLaptops & Notebooks']")
    WebElement showAlllaptopandNotebook;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    WebElement textlaptopandNotebook;

    @CacheLookup
    @FindBy(xpath = "//div[@class='container']/nav/div[2]/ul/li[3]")
    WebElement components;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dropdown-menu']/a[text()='Show AllComponents']")
    WebElement showAllcomponents;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2[1]")
    WebElement textcomponent;

    public void clickdesktop(){
        mouseHoverToElementAndClick(desktop);
    }
    public void clickshowall(){
        clickOnElement(desktopShowAll);
    }
    public String gettext() {
        return getTextFromElement(textDesktop);
    }

    public void clickLaptopAndNotebook(){
        mouseHoverToElementAndClick(laptopAndNotebook);
    }
    public void clickshowallLaptopandNotebook(){
        clickOnElement(showAlllaptopandNotebook);
    }
    public String gettextLaptopAndNotebook() {
        return getTextFromElement(textlaptopandNotebook);
    }

    public void clickcomponent(){
        mouseHoverToElementAndClick(components);
    }
    public void clickshowallComponents(){
        clickOnElement(showAllcomponents);
    }
    public String gettextComponents(){
        return getTextFromElement(textcomponent);
    }

}
