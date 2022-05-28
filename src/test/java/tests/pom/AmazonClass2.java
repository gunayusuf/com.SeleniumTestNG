package tests.pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonClass2 {


    @Test
    public void test01() {

        AmazonPage amazonPage=new AmazonPage();

        // amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com.tr/");
        // nutella aratalim
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        // sonuc yazisinin Nutella icerdigini test edelim
        String expectedSonucYazisi="Nutella";
        String actualSonucYazisi=amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedSonucYazisi),"sonuc yazisi nutella icermiyor");

        Driver.closeDriver();


    }
}
