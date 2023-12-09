package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl="https://parabank.parasoft.com/parabank/index.htm";
    @Before
    public void open(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.xpath("//div[@class='login']/input[@name='username']")).sendKeys("sdc");
        driver.findElement(By.xpath("//div[@class='login']/input[@name='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//div[@class='login']/input[@value='Log In']")).click();
        String actual=driver.findElement(By.xpath("//div[@class='ng-scope']/h1")).getText();
        String expected="Accounts Overview";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void verifyTheErrorMessage(){
        driver.findElement(By.xpath("//div[@class='login']/input[@name='username']")).sendKeys("sdc");
        driver.findElement(By.xpath("//div[@class='login']/input[@name='password']")).sendKeys("145");
        driver.findElement(By.xpath("//div[@class='login']/input[@value='Log In']")).click();
        String actual = driver.findElement(By.xpath("//div[@id='rightPanel']/p")).getText();
        String expected="An internal error has occurred and has been logged.";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        driver.findElement(By.xpath("//div[@class='login']/input[@name='username']")).sendKeys("sdc");
        driver.findElement(By.xpath("//div[@class='login']/input[@name='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//div[@class='login']/input[@value='Log In']")).click();
        driver.findElement(By.xpath("//a[text()='Log Out']")).click();
        String actual=driver.findElement(By.xpath("//div[@id='leftPanel']/h2")).getText();
        String expected="Customer Login";
        Assert.assertEquals(actual,expected);

    }
    @After
    public void close(){
       closeBrowser();
    }

}
