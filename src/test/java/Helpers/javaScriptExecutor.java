package Helpers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javaScriptExecutor {
    JavascriptExecutor js;

    public javaScriptExecutor(WebDriver driver){
        js = (JavascriptExecutor) driver;
    }


    public void OnClickButton(WebElement element){
        js.executeScript("arguments[0].click();", element);
    }


    public void scrollDown(WebElement element){
        js.executeScript("window.scrollBy(0,500)",element);

    }

}
