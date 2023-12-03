package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void open()
    {
        openBrowser(baseUrl);
    }

   @Test
    public void userShouldNavigateToLoginPageSuccessfully()
    {
        driver.findElement(By.className("ico-login")).click();
        String ActualTxt= driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        String ExpectedTest = "Welcome, Please Sign In!";
        Assert.assertEquals(ActualTxt,ExpectedTest);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("email")).sendKeys("codebuster12@gmail.com");
        driver.findElement(By.className("password")).sendKeys("@12345");
        driver.findElement(By.className("login-button")).click();
        String actualMsg = driver.findElement(By.xpath("//div[@class='topic-block-title']")).getText();
        String expectedMsg = "Welcome to our store";
        Assert.assertEquals(actualMsg, expectedMsg);


    }

   @Test
    public void verifyTheErrorMessage(){
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.className("email")).sendKeys("codebu12@gmail.com");
        driver.findElement(By.className("password")).sendKeys("@15");
        driver.findElement(By.className("login-button")).click();
        String actualMsg = driver.findElement(By.className("validation-summary-errors")).getText();
        String expectedMsg = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualMsg, expectedMsg);


    }



    @After
    public void close(){
        closeBrowser();
    }


}
