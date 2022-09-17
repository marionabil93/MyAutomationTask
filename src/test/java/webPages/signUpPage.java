package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signUpPage {

    public signUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath = "//*[@id='SubmitCreate']")
    public static WebElement submitCreateButton;

    @FindBy(xpath = "//*[@id='email_create']")
    public static WebElement emailTextBox;

    @FindBy(xpath = "//*[@class='form-group form-ok']")
    public static WebElement authenticateNewUser;


    @FindBy(xpath = "//*[@id='uniform-id_gender1']")
    public static WebElement radioButtonTitle;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    public static WebElement firstNameText;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    public static WebElement lastNameText;

    @FindBy(xpath = "//*[@id='passwd']")
    public static WebElement passwordText;

    @FindBy(xpath = "//*[@id='uniform-days']")
    public static WebElement dateDaysField;

    @FindBy(xpath = "//*[@id='days']//option[@value='1']")
    public static WebElement selectedDay;

    @FindBy(xpath = "//*[@id='uniform-months']")
    public static WebElement dateMonthField;

    @FindBy(xpath = "//*[@id='months']//option[@value='1']")
    public static WebElement selectedMonth;

    @FindBy(xpath = "//*[@id='uniform-years']")
    public static WebElement dateYearField;

    @FindBy(xpath = "//*[@id='years']//option[@value='1993']")
    public static WebElement selectedYear;

    @FindBy(xpath = "//*[@id='firstname']")
    public static WebElement firstNameYourAddress;

    @FindBy(xpath = "//*[@id='lastname']")
    public static WebElement lastNameYourAddress;

    @FindBy(xpath = "//*[@id='address1']")
    public static WebElement addressTextField;

    @FindBy(xpath = "//*[@id='city']")
    public static WebElement cityTextField;

    @FindBy(xpath = "//*[@id='id_state']")
    public static WebElement stateTextField;

    @FindBy(xpath = "//*[@id='id_state']//option[@value='1']")
    public static WebElement selectedState;

    @FindBy(xpath = "//*[@id='postcode']")
    public static WebElement postalCodeTextField;


    @FindBy(xpath = "//*[@id='phone_mobile']")
    public static WebElement mobileNumberField;


    @FindBy(xpath = "//*[@id='alias']")
    public static WebElement aliasNameTextField;

    @FindBy(xpath = "//*[@id='submitAccount']")
    public static WebElement registerButton;

    @FindBy(xpath = "//*[@class='account']")
    public static WebElement accountLogged;

    @FindBy(xpath = "//*[@id='create_account_error']")
    public static WebElement accountErrorMessage;

}
