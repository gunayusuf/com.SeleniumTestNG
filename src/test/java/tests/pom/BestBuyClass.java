package tests.pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BestBuyPage;
import utilities.Driver;

public class BestBuyClass {


    @Test
    public void test01() {

        BestBuyPage bestBuyPage=new BestBuyPage();
        Faker faker=new Faker();

        String fakerpassword=faker.internet().password();

        Driver.getDriver().get("https://www.bestbuy.com/");

        bestBuyPage.usaFlagButton.click();

       // bestBuyPage.feedBackButton.click();

        bestBuyPage.accountButton.click();

        bestBuyPage.menuCreateAccountButton.click();

        bestBuyPage.createAccountFirstNameBox.sendKeys(faker.name().firstName());

        bestBuyPage.createAccountLastNameBox.sendKeys(faker.name().lastName());

        bestBuyPage.createAccountEmailBox.sendKeys(faker.internet().emailAddress());

        bestBuyPage.createAccountPasswordBox.sendKeys(fakerpassword);

        bestBuyPage.createAccountREnterPasswordBox.sendKeys(fakerpassword);

        bestBuyPage.mobilePhoneNumberBox.sendKeys(faker.phoneNumber().phoneNumber());

        bestBuyPage.newCreateAnAccountbutton.click();


        Assert.assertTrue(bestBuyPage.createAccountResultMsg.isDisplayed());


        Driver.closeDriver();



    }
}
