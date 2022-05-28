package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

   public FacebookPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//input[@class='inputtext _55r1 _6luy']")
    public WebElement kullaniciMailKutusu;


   @FindBy (xpath = "//input[@type='password']")
    public WebElement kullaniciPasswordKutusu;


   @FindBy (xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement loginButon;


    @FindBy (xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
    public WebElement yeniHesapOlusturButon;


    @FindBy (xpath = "//div[@class='_9ay7']")
    public WebElement girisYapilamadiSonucu;

}
