package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class RegisterTest extends BaseTest {

    String baseUrl="https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void open(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay(){
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        String actual=driver.findElement(By.xpath("//h1[@class='title']")).getText();
        String expected="Signing up is easy!";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("acc");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("customer.lastName")).sendKeys("azcsd");
        driver.findElement(By.id("customer.address.street")).sendKeys("sdcsdszz");
        driver.findElement(By.id("customer.address.city")).sendKeys("london");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("customer.address.state")).sendKeys("sdsdcx");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("ha73af");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("08667576767");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("customer.ssn")).sendKeys("3545664");
        driver.findElement(By.id("customer.username")).sendKeys("dwec");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("customer.password")).sendKeys("12345");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//td[@colspan='2']/input[@class='button']")).click();
        String actual=driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String expected="Your account was created successfully. You are now logged in.";
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Assert.assertEquals(actual,expected);

    }

    @After
    public void close(){
        closeBrowser();
    }
}
