package tests.crossBrowser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRentCarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04_DataProvider {

    BlueRentCarPage brc;

    @DataProvider
    public static Object[][] kullaniciListesi() {

        Object[][] kullaniciBilgisi={{"ahmet123@gmail.com","aasszzc"},
                                    {"mehmet123@gmail.com","aazzxxff"},
                                    {"ayse2233@gmail.com","22563234s"}};

        return kullaniciBilgisi;
    }

    @Test(dataProvider = "kullaniciListesi")
    public void dataProviderTesti(String kullaniciadi, String sifre) {
        brc=new BlueRentCarPage();

        //       https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        //      login butonuna bas
        brc.mainLoginButton.click();
        // test data user email: dataprovider'dan alalim,
        brc.mainEmailTextBox.sendKeys(kullaniciadi);

        // test data password : dataprovider'dan alalim
        brc.mainPasswordTextBox.sendKeys(sifre);

        ReusableMethods.waitFor(2);
        // login butonuna tiklayin
        brc.secondLoginButton.click();

        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et

        Assert.assertTrue(brc.secondLoginButton.isDisplayed());
        Driver.closeDriver();

    }
}
