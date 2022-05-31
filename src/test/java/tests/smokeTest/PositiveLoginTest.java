package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {

    @Test
    public void positiveLoginTest() {
        BlueRentCarPage brc=new BlueRentCarPage();

        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brc.mainLoginButton.click();
        // test data user email: customer@bluerentalcars.com
        brc.mainEmailTextBox.sendKeys(ConfigReader.getProperty("brcTrueEmail"));
        // test data password : 12345
        brc.mainPasswordTextBox.sendKeys(ConfigReader.getProperty("brcTruePassword"));
        // login butonuna tiklayin
        brc.secondLoginButton.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


        Assert.assertTrue(brc.mainLoginResult.isEnabled());

        Driver.closeDriver();

    }
}
