package tests.crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {

    AmazonPage amazonPage;

    @DataProvider
    public static Object[][] AranacakKelimeler() {

        Object[][] arananKelimeArrayi={{"Nutella"},{"Java"},{"Yusuf"},{"USA"}};

        return arananKelimeArrayi;
    }

    @Test(dataProvider = "AranacakKelimeler")
    public void dataProviderTest(String arananKelime) {
       amazonPage=new AmazonPage();

        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // Nutella , Java , Yusuf ve Netherlands icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(arananKelime+ Keys.ENTER);

        //sonuclarin aradigimiz kelime icerdigini test edelim
        String expectedKelime=arananKelime;
        String actualKelime=amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));

        //sayfayi kapatalim

        Driver.closeDriver();
    }
}
