package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void open()
    {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
       String ActualTxt= driver.findElement(By.xpath("//a[@href='/computers']")).getText();
       System.out.println(ActualTxt);
       String ExpectedTxt="Computers";
        Assert.assertEquals(ActualTxt,ExpectedTxt);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        String ActualTxt= driver.findElement(By.xpath("//a[@href='/electronics']")).getText();
        System.out.println(ActualTxt);
        String ExpectedTxt="Electronics";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        String ActualTxt= driver.findElement(By.xpath("//a[@href='/apparel']")).getText();
        System.out.println(ActualTxt);
        String ExpectedTxt="Apparel";
        Assert.assertEquals(ActualTxt,ExpectedTxt);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        String ActualTxt= driver.findElement(By.xpath("//a[@href='/digital-downloads']")).getText();
        System.out.println(ActualTxt);
        String ExpectedTxt="Digital downloads";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        String ActualTxt= driver.findElement(By.xpath("//a[@href='/books']")).getText();
        System.out.println(ActualTxt);
        String ExpectedTxt="Books";
        Assert.assertEquals(ActualTxt,ExpectedTxt);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        String ActualTxt= driver.findElement(By.xpath("//a[@href='/jewelry']")).getText();
        System.out.println(ActualTxt);
        String ExpectedTxt="Jewelry";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        String ActualTxt= driver.findElement(By.xpath("//a[@href='/gift-cards']")).getText();
        System.out.println(ActualTxt);
        String ExpectedTxt="Gift Cards";
        Assert.assertEquals(ActualTxt,ExpectedTxt);
    }

    @After
    public void close(){
        closeBrowser();
    }

}
