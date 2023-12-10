package Electronics;

import homepage.TopMenuTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ElectronicsTest extends TopMenuTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void open(){
        openBrowser(baseUrl);
    }
    @Test
    public void textverified(){
        selectMenu("Electronics ");
        selectMenu(" Cell phones ");
        String actual=driver.findElement(By.className("page-title")).getText();
        String expected="Cell phones";
        Assert.assertEquals(actual,expected);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        selectMenu("Electronics ");
        selectMenu(" Cell phones ");
        String actual=driver.findElement(By.className("page-title")).getText();
        String expected="Cell phones";
        Assert.assertEquals(actual,expected);
        driver.findElement(By.className("list")).click();
        selectMenu("Nokia Lumia 1020");
        String actualname=driver.findElement(By.className("product-name")).getText();
        String expectedname="Nokia Lumia 1020";
        Assert.assertEquals(actualname,expectedname);
        String price=driver.findElement(By.id("price-value-20")).getText();
        String expectedprice="$349.00";
        Assert.assertEquals(price,expectedprice);
        WebElement quantity=driver.findElement(By.id("product_enteredQuantity_20"));
        quantity.clear();
        quantity.sendKeys("2");
        driver.findElement(By.id("add-to-cart-button-20")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        String success=driver.findElement(By.className("content")).getText();
        String expectedsuccess="The product has been added to your shopping cart";
        Assert.assertEquals(success,expectedsuccess);
        driver.findElement(By.className("close")).click();
        driver.findElement(By.xpath("//li[@id='topcartlink']/a")).click();
        String actualtxt=driver.findElement(By.className("page-title")).getText();
        String expectedtxt="Shopping cart";
        Assert.assertEquals(actualtxt,expectedtxt);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.className("qty-input")).click();
        driver.navigate().refresh();
        String total=driver.findElement(By.xpath("//td[@class='subtotal']/span")).getText();
        String expectedtotal="$698.00";
        //Assert.assertEquals(total,expectedprice);
        driver.findElement(By.id("termsofservice")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.findElement(By.id("checkout")).click();
        String actualstr=driver.findElement(By.className("page-title")).getText();
        String expectedstr="Welcome, Please Sign In!";
        Assert.assertEquals(actualstr,expectedstr);
        driver.findElement(By.className("register-button")).click();
        String actualtitle=driver.findElement(By.className("page-title")).getText();
        String expectedtitle="Register";
        Assert.assertEquals(actualtitle,expectedtitle);
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("qwe");
        driver.findElement(By.id("LastName")).sendKeys("xfbg");

        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[19]")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[3]")).click();
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[40]")).click();
        driver.findElement(By.id("Email")).sendKeys("qw@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("1234567");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567");
        driver.findElement(By.id("register-button")).click();
        String actualresult=driver.findElement(By.xpath("//div[@class='page-body']/div[1]")).getText();
        String expectedresult="Your registration completed";
        Assert.assertEquals(actualresult,expectedresult);
        selectMenu("Continue");
        String actualTxt=driver.findElement(By.className("page-title")).getText();
        String expectedTxt="Shopping cart";
        Assert.assertEquals(actualTxt,expectedTxt);


    }
    @After
    public void close(){
       closeBrowser();
    }
}
