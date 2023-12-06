package desktops;

import homepage.TopMenuTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class DesktopsTest extends TopMenuTest {
    String baseUrl="http://tutorialsninja.com/demo/index.php?";

    @Before
    public void open(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        selectMenu("Desktops");
        selectMenu("Show AllDesktops");
        driver.findElement(By.id("input-sort")).click();
        driver.findElement(By.xpath("//select[contains(@id,'input-sort')]/option[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String ActualText = driver.findElement(By.xpath("//a[text()='Sony VAIO']")).getText();
        String ExpectedText = "Sony VAIO";
       Assert.assertEquals(ActualText,ExpectedText);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        selectMenu("Desktops");
        selectMenu("Show AllDesktops");
        driver.findElement(By.id("input-sort")).click();
        driver.findElement(By.xpath("//select[contains(@id,'input-sort')]/option[2]")).click();
        selectMenu("HP LP3065");
        driver.findElement(By.className("fa-calendar")).click();
        driver.findElement(By.xpath("//th[@colspan='5']")).click();
        driver.findElement(By.xpath("//div[@class='datepicker-months']/table[@class='table-condensed']/thead/tr/th[2]")).click();
        driver.findElement(By.xpath("//div[@class='datepicker-years']/table[@class='table-condensed']/thead/tr/th[3]")).click();
        driver.findElement(By.xpath("//span[text()='2022']")).click();
        driver.findElement(By.xpath("//span[text()='Nov']")).click();
        driver.findElement(By.xpath("//div[@class='datepicker-days']/table[@class='table-condensed']/tbody/tr[5]/td[3]")).click();
        driver.findElement(By.xpath("//input[@id='input-quantity']")).click();
        driver.findElement(By.id("button-cart")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String ActualText1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        String[] ar=ActualText1.split("\\R");
        String ActualText = ar[0];
        String ExpectedText = "Success: You have added HP LP3065 to your shopping cart!";
        Assert.assertEquals(ActualText,ExpectedText);
        selectMenu("shopping cart");
        String ActualTxt=driver.findElement(By.xpath("//a[text()='Shopping Cart']")).getText();
        String ExpectedTxt="Shopping Cart";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        String actualText=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[2]/a[text()='HP LP3065']")).getText();
        String expectedText="HP LP3065";
        Assert.assertEquals(actualText,expectedText);

        String Actaultxt=driver.findElement(By.xpath("//small[text()='Delivery Date:2022-11-30']")).getText();
        String Expectedtxt="Delivery Date:2022-11-30";
        Assert.assertEquals(Actaultxt,Expectedtxt);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        String acatualtxt=driver.findElement(By.xpath("//td[text()='Product 21']")).getText();
        String expectedtxt="Product 21";
        Assert.assertEquals(acatualtxt,expectedtxt);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String actualTxt = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[6]")).getText();
        String expectedTxt="$122.00";
        Assert.assertEquals(actualTxt,expectedTxt);

    }

    @After
    public void close(){
        closeBrowser();
    }

}
