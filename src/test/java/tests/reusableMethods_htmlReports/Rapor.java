package tests.reusableMethods_htmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Rapor extends TestBaseRapor {

    @Test
    public void test01() {

        extentTest=extentReports.createTest("positive login","gecerli id ve email girisi yapildi");

        // Bir test method olustur positiveLoginTest()
        //               https://www.bluerentalcars.com/ adresine git
        BlueRentCarPage brcpage=new BlueRentCarPage();
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        //              login butonuna bas
        brcpage.mainLoginButton.click();
        extentTest.info("login butonuna tiklandi");
        // test data user email: customer@bluerentalcars.com ,
        brcpage.mainEmailTextBox.sendKeys(ConfigReader.getProperty("brcTrueEmail"));
        extentTest.info("gecerli email yazildi");
        // test data password : 12345
        brcpage.mainPasswordTextBox.sendKeys(ConfigReader.getProperty("brcTruePassword"));
        extentTest.info("gecerli password yazildi");
        // login butonuna tiklayin
        brcpage.secondLoginButton.click();
        extentTest.info("login butonuna basildi");
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        String actualUsername=brcpage.mainLoginResult.getText();
        String expectedUsername=ConfigReader.getProperty("brcFirstName");

        Assert.assertEquals(actualUsername,expectedUsername);

        extentTest.pass("kullanici basarili sekilde giris yapti");

        Driver.closeDriver();




    }
}
