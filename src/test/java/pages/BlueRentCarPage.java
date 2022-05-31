package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentCarPage {
    public BlueRentCarPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement mainLoginButton;

    @FindBy (xpath = "//input[@id='formBasicEmail']")
    public WebElement mainEmailTextBox;

    @FindBy (xpath = "//input[@id='formBasicPassword']")
    public  WebElement mainPasswordTextBox;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement secondLoginButton;

    @FindBy (xpath = "//button[@id='dropdown-basic-button']")
    public WebElement mainLoginResult;

    @FindBy (xpath = "//a[text()='Create new user']")
    public WebElement secondCreateNewUserButton;

    @FindBy (xpath = "//input[@name='firstName']")
    public WebElement createACFirstName;

    @FindBy (xpath = "//input[@name='lastName']")
    public WebElement createACLastName;

    @FindBy (xpath = "//input[@class='form-control is-invalid']")
    public WebElement createACPhoneNumber;

    @FindBy (xpath = "//input[@name='address']")
    public WebElement createACAdress;

    @FindBy (xpath = "//input[@name='zipCode']")
    public WebElement createACZipCode;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement createACEmail;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement createACPassword;

    @FindBy (xpath = "//input[@name='confirmPassword']")
    public WebElement createACREpassword;

    @FindBy (xpath = "//button[text()=' Register']")
    public WebElement createACRegisterButton;









}
