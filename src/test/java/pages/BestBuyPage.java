package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BestBuyPage {

   public BestBuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy (xpath = "(//img[@alt='United States'])[1]")
    public WebElement usaFlagButton;



    @FindBy (id = "gh-search-input")
    public WebElement searchBox;


    @FindBy (xpath = "//span[@class='cart-label']")
    public WebElement cartButton;


    @FindBy (className = "store-display-name")
    public WebElement bangorButton;


    @FindBy (xpath = "//a[@data-lid='hdr_td_topdeals']")
    public WebElement topDealsButton;


    @FindBy (xpath = "//a[@data-lid='hdr_dotd']")
    public WebElement dealOfTheDayButton;


    @FindBy (xpath = "//span[@class='v-p-right-xxs line-clamp']")
    public WebElement accountButton;


    @FindBy (xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
    public WebElement signInButton;



    @FindBy (xpath = "//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
    public WebElement menuCreateAccountButton;



    @FindBy (xpath = "//input[@id='firstName']")
    public WebElement createAccountFirstNameBox;


    @FindBy (xpath = "//input[@id='lastName']")
    public WebElement createAccountLastNameBox;


    @FindBy (xpath = "//input[@id='email']")
    public WebElement createAccountEmailBox;


    @FindBy (xpath = "//input[@id='fld-p1']")
    public WebElement createAccountPasswordBox;


    @FindBy (xpath = "//input[@id='reenterPassword']")
    public WebElement createAccountREnterPasswordBox;


    @FindBy (xpath = "//input[@id='phone']")
    public WebElement mobilePhoneNumberBox;


    @FindBy (xpath = "//button[@class='c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit ']")
    public WebElement newCreateAnAccountbutton;


    @FindBy (xpath = "//button[@id='survey_invite_no']")
    public  WebElement feedBackButton;


    @FindBy (xpath = "//strong[text()='An account with this email already exists.']")
    public  WebElement createAccountResultMsg;

}
