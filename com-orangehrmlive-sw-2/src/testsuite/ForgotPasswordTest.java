package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void open() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.findElement(By.xpath("//p[contains(@class,'orangehrm-login-forgot-header')]")).click();
        String actualText=driver.findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text--h6 orangehrm-forgot-password-title')]")).getText();
        String ExpectedText="Reset Password";
        Assert.assertEquals(actualText,ExpectedText);

    }

    @After
    public void close() {
        closeBrowser();

    }
}
