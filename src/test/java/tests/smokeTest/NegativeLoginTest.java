package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentCarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {

    @Test
    public void negativeLogin() {

        BlueRentCarPage brc=new BlueRentCarPage();

        // Bir test method olustur negativeLogin()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brc.mainLoginButton.click();
        // test data user email: client@bluerentalcars.com
        brc.mainEmailTextBox.sendKeys(ConfigReader.getProperty("brcFalseEmail"));
        // test data password : 54321
        brc.mainPasswordTextBox.sendKeys(ConfigReader.getProperty("brcFalsePassword"));
        // login butonuna tiklayin
        brc.secondLoginButton.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et


        // secondLoginButton yapmamin sebebi eger login tusu gorunuyor ise
        // zaten giris yapilamamis demektir...
        Assert.assertTrue(brc.secondLoginButton.isDisplayed());

        Driver.closeDriver();
    }

    // Bu class'da 2 test methodu daha olusturun
    // biri yanlisKullanici testi
    // digeri de yanlis sifre ve kullanici adi testi


    @Test
    public void yanlisKullaniciTesti() {

        BlueRentCarPage brc=new BlueRentCarPage();
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brc.mainLoginButton.click();
        brc.mainEmailTextBox.sendKeys(ConfigReader.getProperty("brcFalseEmail"));
        brc.mainPasswordTextBox.sendKeys(ConfigReader.getProperty("brcTruePassword"));
        brc.secondLoginButton.click();


        // secondLoginButton yapmamin sebebi eger login tusu gorunuyor ise
        // zaten giris yapilamamis demektir...
        Assert.assertTrue(brc.secondLoginButton.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void dogruKullaniciyanlisSifre() {

        BlueRentCarPage brc=new BlueRentCarPage();

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        brc.mainLoginButton.click();
        brc.mainEmailTextBox.sendKeys(ConfigReader.getProperty("brcTrueEmail"));
        brc.mainPasswordTextBox.sendKeys(ConfigReader.getProperty("brcFalsePassword"));

        // secondLoginButton yapmamin sebebi eger login tusu gorunuyor ise
        // zaten giris yapilamamis demektir...
        Assert.assertTrue(brc.secondLoginButton.isDisplayed());

    }
}
