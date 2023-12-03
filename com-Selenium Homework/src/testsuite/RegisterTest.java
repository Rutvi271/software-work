package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void open()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
       String ActualTxt= driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).getText();

        String ExpectedTxt="Register";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Rutvi");
        driver.findElement(By.id("LastName")).sendKeys("Shah");
        driver.findElement(By.name("DateOfBirthDay")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[text()='27']")).click();
        driver.findElement(By.name("DateOfBirthMonth")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[text()='January']")).click();
        driver.findElement(By.name("DateOfBirthYear")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[text()='1990']")).click();
        driver.findElement(By.id("Email")).sendKeys("rutvi275@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("@1234567");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("@1234567");
        driver.findElement(By.id("register-button")).click();
        String actualMsg = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();
        System.out.println(actualMsg);
       String  expectedMsg ="Your registration completed";
        Assert.assertEquals(actualMsg, expectedMsg);


    }

    @After
    public void close(){
        closeBrowser();
    }

}
