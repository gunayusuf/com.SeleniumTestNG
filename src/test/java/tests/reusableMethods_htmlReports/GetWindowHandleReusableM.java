package tests.reusableMethods_htmlReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class GetWindowHandleReusableM {

    @Test
    public void test01() {
        //Reusable Methodlarini kullanmadan once;

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String ilkSayfaWH=Driver.getDriver().getWindowHandle();
        //          ● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleSeti=Driver.getDriver().getWindowHandles();

        String ikinciSayfaWH="";
        for (String each:windowHandleSeti
             ) {
            if (!each.equals(ilkSayfaWH)){
                ikinciSayfaWH=each;
            }
        }

        Driver.getDriver().switchTo().window(ikinciSayfaWH); // ikinci sayfaya gecis yapildi
        System.out.println(Driver.getDriver().getTitle()); // ikinci sayfanin title'i belirlendi
        //Acilan yeni tab'in title'inin "New Window" oldugunu test edin.

        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle(); // guncel olarak ikinci sayfada
        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Test
    public void withReusableMethod() {
        //Reusable Methodlari ile beraber;
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //          ● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        ReusableMethods.switchToWindow("New Window");
        String expectedTitle="New Window";
        String actualTitle=Driver.getDriver().getTitle();

        ReusableMethods.waitFor(2);

        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();

    }
}
