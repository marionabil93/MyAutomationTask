package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class signInPage {


    public signInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@class='login']")
    public static WebElement signInButton;

    @FindBy(xpath = "//*[@class='logout']")
    public static WebElement logOutButton;


    @FindBy(xpath = "//*[@id='email']")
    public static WebElement emailAddressField;

    @FindBy(xpath = "//*[@id='passwd']")
    public static WebElement passwordField;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    public static WebElement loginButton;

    @FindBy(xpath = "//*[@class='account']")
    public static WebElement accountNameField;






}


