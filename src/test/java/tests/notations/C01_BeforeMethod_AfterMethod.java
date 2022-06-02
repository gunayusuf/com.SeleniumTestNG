package tests.notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_AfterMethod extends TestBase {

    //@BeforeMethod ve @AfterMethod notasyonlari
    //JUnit'deki @Before ve @After gibidir
    //Her test method'undan once ve sonra calisirlar
    // Buradaki tek fark natural order yani alfabetik siraya gore calisti
    // once techproedTesti sonra test01 ve son olarak test02 calisti.

    @Test(groups = "grup2")
    public void test01() {
    driver.get("https://www.amazon.com.tr/");

    }



    @Test(groups = "grup2")
    public void test02() {
        driver.get("https://www.bestbuy.com/");

    }


    @Test(groups = "grup1")
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com/");

    }




}//CLASS SONU
