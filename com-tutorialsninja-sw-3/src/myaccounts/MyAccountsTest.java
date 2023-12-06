package myaccounts;

import homepage.TopMenuTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class MyAccountsTest extends TopMenuTest {
    String baseUrl="http://tutorialsninja.com/demo/index.php?";
    public void selectMyAccountOptions(String option){
        driver.findElement(By.xpath("//a[text()='"+option+"']")).click();
    }
    @Before
    public void open(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMyAccountOptions("Register");
        String actualtext=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        String expectedtext="Register Account";
        Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMyAccountOptions("Login");
        String actualtext=driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/h2")).getText();
        String expectedtext="Returning Customer";
        Assert.assertEquals(actualtext,expectedtext);

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMyAccountOptions("Register");
        driver.findElement(By.id("input-firstname")).sendKeys("code");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-lastname")).sendKeys("buster");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-email")).sendKeys("baffase@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-telephone")).sendKeys("0343453555");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-password")).sendKeys("@123456");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-confirm")).sendKeys("@123456");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//div[@class='col-sm-10']/label[1]/input[@name='newsletter']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String actualtext=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        String expectedtext="Your Account Has Been Created!";
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        Assert.assertEquals(actualtext,expectedtext);
        selectMyAccountOptions("Continue");
        driver.findElement(By.xpath("//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMyAccountOptions("Logout");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String Actualtxt=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        String Expectedtxt="Account Logout";
        Assert.assertEquals(Actualtxt,Expectedtxt);
        selectMyAccountOptions("Continue");
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMyAccountOptions("Login");
        driver.findElement(By.id("input-email")).sendKeys("baffase@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("@123456");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        String Actual=driver.findElement(By.xpath("//div[@id='content']/h2[1]")).getText();
        String Expected="My Account";
        Assert.assertEquals(Actual,Expected);
        driver.findElement(By.xpath("//ul[@class='list-inline']/li[2]/a/span[@class='hidden-xs hidden-sm hidden-md']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMyAccountOptions("Logout");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String Actualtxt=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        String Expectedtxt="Account Logout";
        Assert.assertEquals(Actualtxt,Expectedtxt);
        selectMyAccountOptions("Continue");

    }

    @After
    public void close(){
        closeBrowser();
    }

}
