package Tests;
import com.aventstack.extentreports.Status;
import org.testng.annotations.*;
import webPages.signInPage;
import org.testng.Assert;
import webPages.selectItemPage;
import webPages.signUpPage;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import static webPages.selectItemPage.dressOrangeButton;

public class mainClass extends extentReport{

    @Test(priority=1)
    public void signUpTestCase(Method method) {
        //Create object of HomePage Class
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        signInObject.signInButton.click();
        javaScriptExecutor.scrollDown(signUpPage.submitCreateButton);
        signUpObject.emailTextBox.sendKeys(read.getData(0, 0, 0));
        signUpObject.submitCreateButton.click();
        Assert.assertTrue(signUpObject.authenticateNewUser.isDisplayed());
        signUpObject.radioButtonTitle.click();
        signUpObject.firstNameText.sendKeys(read.getData(0, 0, 1));
        signUpObject.lastNameText.sendKeys(read.getData(0, 0, 2));
        signUpObject.passwordText.sendKeys(read.getData(0, 0, 3));
        signUpObject.dateDaysField.click();
        signUpObject.selectedDay.click();
        signUpObject.dateMonthField.click();
        signUpObject.selectedMonth.click();
        signUpObject.dateYearField.click();
        signUpObject.selectedYear.click();
        signUpObject.addressTextField.sendKeys(read.getData(0, 0, 4));
        signUpObject.cityTextField.sendKeys(read.getData(0, 0, 5));
        signUpObject.stateTextField.click();
        signUpObject.selectedState.click();
        javaScriptExecutor.scrollDown(signUpPage.registerButton);
        signUpObject.postalCodeTextField.sendKeys(read.getNumericData(0, 0, 6));
        signUpObject.mobileNumberField.sendKeys(read.getNumericData(0, 0, 7));
        signUpObject.aliasNameTextField.sendKeys(read.getData(0, 0, 8));
        signUpObject.registerButton.click();
        Assert.assertTrue(signUpObject.accountLogged.isDisplayed());
        signInPage.logOutButton.click();
        String descriptiveTestNameTC1 = method.getName();
        System.out.println(descriptiveTestNameTC1);
        test = extent.createTest(descriptiveTestNameTC1);
        test.log(Status.PASS,descriptiveTestNameTC1);
    }

    @Test(priority = 2)
    public void loginWithNewUser(Method method){
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        signInPage.signInButton.click();
        signInPage.emailAddressField.sendKeys(read.getData(0, 0, 0));
        signInPage.passwordField.sendKeys(read.getData(0, 0, 3));
        signInPage.loginButton.click();
        Assert.assertTrue(signInPage.accountNameField.isDisplayed());
        String descriptiveTestNameTC2 = method.getName();
        System.out.println(descriptiveTestNameTC2);
        test = extent.createTest(descriptiveTestNameTC2);
        test.log(Status.PASS,descriptiveTestNameTC2);
    }

    @Test(priority=3)
    public void selectItemTestCase(Method method) {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        selectObject.hoverProduct();
        selectObject.largeSizeCheckBox.click();
        selectObject.orangeColorFilterCheckBox.click();
        selectObject.waitForVisibility(dressOrangeButton);
        javaScriptExecutor.OnClickButton(dressOrangeButton);
        selectObject.addToCartItemButton.click();
        selectObject.proceedToCheckOutButtonInPopUpMessage.click();
        selectObject.proceedToCheckOutButtonInSummaryPage.click();
        selectObject.waitForVisibility(selectItemPage.proceedToCheckOutButton);
        selectObject.proceedToCheckOutButton.click();
        selectObject.termsCheckBox.click();
        selectObject.proceedToCheckOutButton.click();
        selectObject.bankWireButton.click();
        selectObject.confirmOrderButton.click();
        Assert.assertTrue(selectObject.OrderStatus.getText().contains("complete"));
        String orderInPaymentPage = selectObject.orderNameInPaymentPage.getText();
        System.out.println(orderInPaymentPage);
        selectObject.backToOrdersButton.click();
        String orderInOrderPage = selectObject.orderNameInOrderPage.getText();
        System.out.println(orderInOrderPage);
        Assert.assertTrue(orderInPaymentPage.contains(orderInOrderPage));
        signInPage.logOutButton.click();
        String descriptiveTestNameTC3 = method.getName();
        System.out.println(descriptiveTestNameTC3);
        test = extent.createTest(descriptiveTestNameTC3);
        test.log(Status.PASS,descriptiveTestNameTC3);
    }

}