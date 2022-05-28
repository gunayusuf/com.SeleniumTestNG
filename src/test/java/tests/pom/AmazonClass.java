package tests.pom;

import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class AmazonClass {

    @Test
    public void test01() {

        Driver.getDriver().get("https://www.amazon.com.tr/");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.signInMoveToElementi.click();

        Driver.closeDriver();

        Driver.getDriver().get("https://www.facebook.com");

        Driver.closeDriver();

    }
}
