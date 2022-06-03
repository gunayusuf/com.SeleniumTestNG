package tests.reusableMethods_htmlReports;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class ScreenShotReusableM {

    @Test
    public void screenShotReusable() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("bestbuyUrl"));
        ReusableMethods.getScreenshot("bestbuy");
        Driver.closeDriver();

    }
}
