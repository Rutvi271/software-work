package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class TopMenuTest extends BaseTest {
    String menu;
    String baseUrl="http://tutorialsninja.com/demo/index.php?";
    public void selectMenu(String menu){
        driver.findElement(By.xpath("//a[text()='"+menu+"']")).click();
    }
    @Before
    public void open(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        selectMenu("Show AllDesktops");
        String ActualText = driver.findElement(By.xpath("//h2[text()='Desktops']")).getText();
        String ExpectedText = "Desktops";
        Assert.assertEquals(ActualText,ExpectedText);
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMenu("Show AllLaptops & Notebooks");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String ActualText = driver.findElement(By.xpath("//h2[text()='Laptops & Notebooks']")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String ExpectedText = "Laptops & Notebooks";
        Assert.assertEquals(ActualText,ExpectedText);
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//a[text()='Components']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMenu("Show AllComponents");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String ActualText = driver.findElement(By.xpath("//h2[text()='Components']")).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String ExpectedText = "Components";
        Assert.assertEquals(ActualText,ExpectedText);
    }
    @After
    public void close(){
       closeBrowser();
    }



}
