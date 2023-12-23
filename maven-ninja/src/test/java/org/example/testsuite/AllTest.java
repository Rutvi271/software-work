package org.example.testsuite;

import org.example.pages.Components;
import org.example.pages.Desktops;
import org.example.pages.LaptopAndNotebook;
import org.example.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

;

public class LoginTest extends TestBase {
    Desktops desktop = new Desktops();
    LaptopAndNotebook laptop=new LaptopAndNotebook();
    Components component=new Components();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        desktop.clickdesktop();
        desktop.clickshowall();
        String actual=desktop.gettext();
        String expected="Desktops";
        Assert.assertEquals(actual,expected);


    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        laptop.clicklaptoptopandnotebook();
        laptop.clickshowall();
        String actual=laptop.gettext();
        String expected="Laptops & Notebooks";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        component.clickcomponent();
        component.clickshowall();
        String actual=component.gettext();
        String expected="Components";
        Assert.assertEquals(actual,expected);

    }

  /*  @Test
    public void userShouldNotLoginWithInValidCredentials() {

        homePage.clickOnLoginLink();

        //driver.findElement(By.id("Email")).sendKeys("codebuster@gmail.com");
        sendTextToElement(By.id("Email"), "codebuster@gmail.com");

        //driver.findElement(By.id("Password")).sendKeys("123456");
        sendTextToElement(By.id("Password"), "123456");

        //driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //String actualErrorMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        String actualErrorMsg = getTextFromElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String expectedErrorMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

    }*/

}
