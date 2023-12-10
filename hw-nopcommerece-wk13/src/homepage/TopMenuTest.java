package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {


    public void selectMenu(String menu) {
        driver.findElement(By.xpath("//a[text()='" + menu + "']")).click();
    }

    @Before
    public void open() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyPageNavigation(){
        selectMenu("Computers ");
        String ActualText = driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
        String ExpectedText = "Computers";
        Assert.assertEquals(ActualText,ExpectedText);

    }

    @After
    public void close(){
        closeBrowser();
    }
}