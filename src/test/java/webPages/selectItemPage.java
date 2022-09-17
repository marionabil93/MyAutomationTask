package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Tests.extentReport.driver;


public class selectItemPage {


    public selectItemPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    Actions action = new Actions(driver);

    @FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']//descendant::a[@title='Dresses'][2]")
    public static WebElement dressesTab;

    @FindBy(xpath = "//*[@class='sfHover']//*[@title='Summer Dresses']")
    public static WebElement summerDresses;

    @FindBy(xpath = "//*[@id='uniform-layered_id_attribute_group_3']")
    public static WebElement largeSizeCheckBox;

    @FindBy(xpath = "//*[@id='layered_id_attribute_group_13']")
    public static WebElement orangeColorFilterCheckBox;

    @FindBy(xpath = "//*[@id='color_21']")
    public static WebElement dressOrangeButton;


    @FindBy(xpath = "//*[@class='product-image-container']")
    public static WebElement resultedProduct;

    @FindBy(xpath = "//*[@class='exclusive']")
    public static WebElement addToCartItemButton;

    @FindBy(xpath = "//*[@class='btn btn-default button button-medium']")
    public static WebElement proceedToCheckOutButtonInPopUpMessage;

    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//*[@title='Proceed to checkout']")
    public static WebElement proceedToCheckOutButtonInSummaryPage;

    @FindBy(xpath = "//*[@class='cart_navigation clearfix']//*[@type='submit']")
    public static WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//*[@id='uniform-cgv']")
    public static WebElement termsCheckBox;

    @FindBy(xpath = "//*[@class='bankwire']")
    public static WebElement bankWireButton;

    @FindBy(xpath = "//*[@id='cart_navigation']//*[@type='submit']")
    public static WebElement confirmOrderButton;

    @FindBy(xpath = "//*[@class='cheque-indent']")
    public static WebElement OrderStatus;

    @FindBy(xpath = "//*[@class='button-exclusive btn btn-default']")
    public static WebElement backToOrdersButton;

    @FindBy(xpath = "//*[@class='box']")
    public static WebElement orderNameInPaymentPage;

    @FindBy(xpath = "//*[@class='first_item ']//*[@class='color-myaccount']")
    public static WebElement orderNameInOrderPage;

    public void hoverProduct(){
        action.moveToElement(dressesTab);
        action.build().perform();
        summerDresses.click();
    }

    public void waitForVisibility(WebElement element) throws Error{
        WebDriverWait wait = new WebDriverWait(driver,100);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}


