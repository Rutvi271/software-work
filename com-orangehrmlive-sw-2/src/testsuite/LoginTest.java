package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String baseUrl="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void open(){
        openBrowser(baseUrl);
    }

  @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

     driver.findElement(By.xpath("//input[contains(@placeholder,'Username')]")).sendKeys("Admin");
       driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("admin123");
       driver.findElement(By.className("orangehrm-login-button")).click();
       String actualText=driver.findElement(By.xpath("//h6[contains(@class,'oxd-topbar-header-breadcrumb-module')]")).getText();
       String ExpectedText="Dashboard";
      Assert.assertEquals(actualText,ExpectedText);
  }
    @After
    public void close(){
        closeBrowser();
    }

}
