package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl="http://the-internet.herokuapp.com/login";
    @Before
    public void open(){
        openBrowser(baseUrl);


    }
    @Test
    public void UserSholdLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[contains(@class,'radius')]")).click();
        String ActualText=driver.findElement(By.xpath("//div[@class='example']/h2")).getText();
        String ExpectedText="Secure Area";
        Assert.assertEquals(ActualText,ExpectedText);
    }

    @Test
    public void verifyTheUsernameErrorMessage()
    {
        driver.findElement(By.id("username")).sendKeys("tomsmith1");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[contains(@class,'radius')]")).click();
        String ActualText=driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        String ExpectedText="Your username is invalid!";
        Assert.assertEquals(ActualText,ExpectedText);
    }
    @Test
    public void verifyThePasswordErrorMessage()
    {
        driver.findElement(By.id("username")).sendKeys("tomsmith1");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[contains(@class,'radius')]")).click();
        String ActualText=driver.findElement(By.xpath("//div[@class='flash error']")).getText();
        String ExpectedText="Your password is invalid!";
        Assert.assertEquals(ActualText,ExpectedText);
    }
    @After
    public void close(){
        closeBrowser();
    }

}
