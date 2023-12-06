package laptopsandnotebooks;

import homepage.TopMenuTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LaptopsAndNotebooksTest extends TopMenuTest {
    String baseUrl="http://tutorialsninja.com/demo/index.php?";
    @Before
    public void open(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        selectMenu("Laptops & Notebooks");
        selectMenu("Show AllLaptops & Notebooks");
        driver.findElement(By.id("input-sort")).click();
        driver.findElement(By.xpath("//select[contains(@id,'input-sort')]/option[5]")).click();
        String actualtxt=driver.findElement(By.xpath("//div[@class='caption']/p[@class='price']")).getText();
        String expectedtxt="$2,000.00\n" +
                "Ex Tax:$2,000.00";
        Assert.assertEquals(actualtxt,expectedtxt);

    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMenu("Laptops & Notebooks");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMenu("Show AllLaptops & Notebooks");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-sort")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.xpath("//select[contains(@id,'input-sort')]/option[5]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String actualtxt=driver.findElement(By.xpath("//a[text()='MacBook Pro']")).getText();
        String expected="MacBook Pro";
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Assert.assertEquals(actualtxt,expected);
        selectMenu("MacBook Pro");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("button-cart")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        String ActualText1 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        String[] ar=ActualText1.split("\\R");
        String ActualText = ar[0];
        String ExpectedText = "Success: You have added MacBook Pro to your shopping cart!";
        Assert.assertEquals(ActualText,ExpectedText);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        selectMenu("shopping cart");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String ActualTxt=driver.findElement(By.xpath("//a[text()='Shopping Cart']")).getText();
        String ExpectedTxt="Shopping Cart";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String actualText=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[2]/a[text()='MacBook Pro']")).getText();
        String expectedText="MacBook Pro";
        Assert.assertEquals(actualText,expectedText);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        WebElement quantity = driver.findElement(By.xpath("//td[@class='text-left']/div[@class='input-group btn-block']/input[@value='1']"));
        quantity.clear();
        quantity.sendKeys("2");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String actualTxt=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
        String expectedTxt="Success: You have modified your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualTxt,expectedTxt);
        String actualtxt1=driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[6]")).getText();
        String expectedtxt1="$4,000.00";
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Assert.assertEquals(actualtxt1,expectedtxt1);
        selectMenu("Checkout");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String actualtxt2=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
        String expectedtxt2="Checkout";
        Assert.assertEquals(actualtxt2,expectedtxt2);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
        String actaultxt3=driver.findElement(By.xpath("//div[@class='row']/div[1]/h2")).getText();
        String expectedtxt3="New Customer";
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(9000));
        Assert.assertEquals(actaultxt3,expectedtxt3);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        driver.findElement(By.xpath("//div[2]/label/input[@name='account']")).click();
        driver.findElement(By.id("button-account")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        driver.findElement(By.id("input-payment-firstname")).sendKeys("sample");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-payment-lastname")).sendKeys("test");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-payment-email")).sendKeys("odlppter12@gmail.com");
        driver.findElement(By.id("input-payment-telephone")).sendKeys("07834843894");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-payment-company")).sendKeys("asaad");
        driver.findElement(By.id("input-payment-address-1")).sendKeys("18 frtgt ");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("input-payment-city")).sendKeys("harrow");
        driver.findElement(By.id("input-payment-postcode")).sendKeys("ha37af");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.id("input-payment-zone")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        driver.findElement(By.xpath("//option[@value='3553']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.findElement(By.id("button-guest")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.findElement(By.xpath("//div[@class='panel-body']/p[4]/textarea")).sendKeys("hellllloooooo iiiittttssss ffuuuunnnnn");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.id("button-shipping-method")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        driver.findElement(By.xpath("//div[@class='pull-right']/input[@type='checkbox']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        driver.findElement(By.id("button-payment-method")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        driver.findElement(By.id("button-confirm")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        selectMenu("Continue");


    }


    @After
    public void close(){
        closeBrowser();
    }
}
