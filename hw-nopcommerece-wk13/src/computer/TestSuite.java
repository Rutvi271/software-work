package computer;

import homepage.TopMenuTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TestSuite extends TopMenuTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void open(){
        openBrowser(baseUrl);
    }
    @Test
    public void test(){
        selectMenu("Computers ");
        selectMenu(" Desktops ");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
        driver.findElement(By.id("products-orderby")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
        driver.findElement(By.xpath("//select[@id='products-orderby']/option[@value='6']")).click();
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
        String actual=driver.findElement(By.xpath("//div[@class='item-grid']/div[1]/div/div[2]/h2")).getText();
        String expected="Lenovo IdeaCentre 600 All-in-One PC";
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        selectMenu("Computers ");
        selectMenu(" Desktops ");
        driver.findElement(By.id("products-orderby")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
        driver.navigate().refresh();
        driver.findElement(By.xpath("//select[@id='products-orderby']/option[@value='5']")).click();

        driver.navigate().refresh();
        driver.findElement(By.xpath("//div[@data-productid='1']/div[2]/div[3]/div[2]/button")).click();

        driver.navigate().refresh();
        String actual=driver.findElement(By.xpath("//div[@class='product-name']/h1")).getText();

        String expected="Build your own computer";
        Assert.assertEquals(actual,expected);
        WebElement obj=driver.findElement(By.id("product_attribute_1"));
        Select option =new Select(obj);
        option.selectByValue("1");
        WebElement obj2=driver.findElement(By.id("product_attribute_2"));
        Select option2 = new Select(obj2);

        option2.selectByValue("5");

        driver.findElement(By.id("product_attribute_3_7")).click();

        driver.findElement(By.id("product_attribute_4_9")).click();

        driver.findElement(By.id("product_attribute_5_12")).click();
        driver.findElement(By.id("add-to-cart-button-1")).click();
        String actualTXt=driver.findElement(By.className("success")).getText();
        String expectedTxt=" The product has been added to your shopping cart";
        String actualtxt=driver.findElement(By.id("price-value-1")).getText();

        String expectedtxt="$1,475.00";
        Assert.assertEquals(actualtxt,expectedtxt);
        driver.findElement(By.className("close")).click();
        selectMenu("Shopping cart");
        String actualmsg=driver.findElement(By.className("page-title")).getText();
        String expectedmsg="Shopping cart";
        Assert.assertEquals(actualmsg,expectedmsg);
        WebElement quantity=driver.findElement(By.className("qty-input"));
        quantity.clear();
        quantity.sendKeys("2");
        driver.findElement(By.id("updatecart")).click();
        String price=driver.findElement(By.className("product-subtotal")).getText();
        String expectedprice="$2,950.00";
        Assert.assertEquals(price,expectedprice);
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();
        String actualmsg1=driver.findElement(By.className("page-title")).getText();
        String expectedmsg1="Welcome, Please Sign In!";
        driver.findElement(By.className("checkout-as-guest-button")).click();
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("acb");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("12345");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("acb@gmail.com");
        driver.findElement(By.id("BillingNewAddress_CountryId")).click();
        driver.findElement(By.xpath("//option[@value='133']")).click();
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("aaacdvf");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("sfvdfb");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("23443");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("034322244");
        driver.findElement(By.className("new-address-next-step-button")).click();
        driver.findElement(By.id("shippingoption_1")).click();
        driver.findElement(By.className("shipping-method-next-step-button")).click();
        driver.findElement(By.id("paymentmethod_1")).click();
        driver.findElement(By.className("payment-method-next-step-button")).click();
        driver.findElement(By.id("CreditCardType")).click();
        driver.findElement(By.xpath("//option[@value='MasterCard']")).click();
        driver.findElement(By.id("CardholderName")).sendKeys("asafd");
        driver.findElement(By.id("CardNumber")).sendKeys("374245455400126");
        driver.findElement(By.id("ExpireYear")).click();
        driver.findElement(By.xpath("//option[@value='2028']")).click();
        driver.findElement(By.id("CardCode")).sendKeys("111");
        driver.findElement(By.className("payment-info-next-step-button")).click();
        String actualcard=driver.findElement(By.xpath("//li[@class='payment-method']/span[2]")).getText();
        String expectedcard="Credit Card";
        Assert.assertEquals(actualcard,expectedcard);
        String actualMsg=driver.findElement(By.xpath("//li[@class='shipping-method']/span[2]")).getText();
        String expectedMsg="Next Day Air";
        Assert.assertEquals(actualMsg,expectedMsg);
        String totalprice=driver.findElement(By.className("product-subtotal")).getText();
        String expectedvalue ="$2,950.00";
        Assert.assertEquals(totalprice,expectedvalue);
        driver.findElement(By.className("confirm-order-next-step-button")).click();
        driver.navigate().refresh();
        String finaltxt=driver.findElement(By.className("page-title")).getText();
        String finalexpectedtxt="Thank you";
        Assert.assertEquals(finaltxt,finalexpectedtxt);
        String ActualTxt=driver.findElement(By.className("title")).getText();
        String ExpectedTxt="Your order has been successfully processed!";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
        driver.findElement(By.className("order-completed-continue-button")).click();
        String Txt=driver.findElement(By.className("topic-block-title")).getText();
        String Expect="Welcome to our store";
        Assert.assertEquals(Txt,Expect);

    }

    @After
    public void close(){
       closeBrowser();
    }
}
