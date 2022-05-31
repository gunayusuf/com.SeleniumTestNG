package tests.smokeTest;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentCarPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.security.Key;

public class BrcCreateAccount {


    @Test
    public void brcCreateAccount() {

        /*
        Bu testte anasayfadan login ile create new account buttonundan
        yeni bir kullanici olusturmayi test ettim sonuc olarak basarili oldu

        Ayrica ayni olusturdugum kullanici bilgileri ile yeni bir kullanici
        olusturmayi denedim sonuc olarak testi gecmedi
        beklenilen sekilde calisiyor
         */


        BlueRentCarPage brc =new BlueRentCarPage();


        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));


        brc.mainLoginButton.click();
        brc.secondCreateNewUserButton.click();

        brc.createACFirstName.sendKeys(ConfigReader.getProperty("brcFirstName"));
        brc.createACLastName.sendKeys(ConfigReader.getProperty("brcLastName"));
        brc.createACLastName.sendKeys(Keys.TAB); // NORMAL SENDKEYS İLE GONDERMEDE HATA VAR
        // O YUZDEN TAB İLE GECİS YAPINCA SORUN DUZELDI
        brc.createACPhoneNumber.sendKeys(ConfigReader.getProperty("brcPhoneNum"));
        brc.createACAdress.sendKeys(ConfigReader.getProperty("brcAddress"));
        brc.createACZipCode.sendKeys(ConfigReader.getProperty("brcZipCode"));
        brc.createACEmail.sendKeys(ConfigReader.getProperty("brcEmail"));
        brc.createACPassword.sendKeys(ConfigReader.getProperty("brcPassword"));
        brc.createACREpassword.sendKeys(ConfigReader.getProperty("brcREPassword"));
        brc.createACREpassword.sendKeys(Keys.TAB, Keys.ENTER);

        Assert.assertTrue(brc.secondLoginButton.isDisplayed());

    }

    @Test
    public void brcNewAcLogin() {

        /*
        Bu Testte olusturdugum yeni kullanici ile
        sayfaya basarili bir sekilde giris yapilabildigini test ettim
        beklenilen sekilde calisiyor
         */

        BlueRentCarPage brc =new BlueRentCarPage();

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brc.mainLoginButton.click();
        brc.mainEmailTextBox.sendKeys(ConfigReader.getProperty("brcnewLogin"));
        brc.mainPasswordTextBox.sendKeys(ConfigReader.getProperty("brcnewPassword"));
        brc.secondLoginButton.click();


        Assert.assertTrue(brc.mainLoginResult.isEnabled());

        Driver.closeDriver();


    }
}
