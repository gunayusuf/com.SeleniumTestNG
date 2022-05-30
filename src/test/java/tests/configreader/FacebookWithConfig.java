package tests.configreader;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;


public class FacebookWithConfig {


    @Test
    public void test01() throws InterruptedException {

        FacebookPage fcpage=new FacebookPage();
        //  facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        //kullanici mail kutusuna yanlis bir isim yazdirin
        fcpage.kullaniciMailKutusu.sendKeys(ConfigReader.getProperty("wrongUsername"));
        //kullanici sifre kutusuna rastgele bir password yazdirin
        fcpage.kullaniciPasswordKutusu.sendKeys(ConfigReader.getProperty("wrongPassword"));
        //login butonuna basin
        fcpage.loginButon.click();
        //giris yapilamadigini test edin
        Assert.assertTrue(fcpage.girisYapilamadiSonucu.isDisplayed());
        Thread.sleep(3000);
        Driver.closeDriver();
    }
}
