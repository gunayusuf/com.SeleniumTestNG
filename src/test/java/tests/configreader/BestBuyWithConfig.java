package tests.configreader;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BestBuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BestBuyWithConfig {

    @Test
    public void test01() throws InterruptedException {

        BestBuyPage bestBuyPage=new BestBuyPage();

        Driver.getDriver().get(ConfigReader.getProperty("bestbuyUrl"));

        bestBuyPage.usaFlagButton.click();
        bestBuyPage.accountButton.click();
        bestBuyPage.menuCreateAccountButton.click();
        bestBuyPage.createAccountFirstNameBox.sendKeys(ConfigReader.getProperty("wrongUsername"));
        bestBuyPage.createAccountLastNameBox.sendKeys(ConfigReader.getProperty("wrongUsername"));
        bestBuyPage.createAccountEmailBox.sendKeys(ConfigReader.getProperty("wrongEmail"));
        bestBuyPage.createAccountPasswordBox.sendKeys(ConfigReader.getProperty("wrongPassword"));
        bestBuyPage.createAccountREnterPasswordBox.sendKeys(ConfigReader.getProperty("wrongPassword"));
        bestBuyPage.mobilePhoneNumberBox.sendKeys(ConfigReader.getProperty("wrongPhone"));
        bestBuyPage.newCreateAnAccountbutton.click();

        Assert.assertTrue(bestBuyPage.createAccountResultMsg.isDisplayed());
        Thread.sleep(4000);

        Driver.closeDriver();



    }
}
