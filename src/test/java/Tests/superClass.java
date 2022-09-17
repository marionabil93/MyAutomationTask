package Tests;

import Helpers.javaScriptExecutor;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import webPages.selectItemPage;
import webPages.signInPage;
import webPages.signUpPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class superClass {

    public static WebDriver driver;
    public String baseURL = "http://automationpractice.com/index.php";
    public String fileURL = "./Reports/spark_report.html";
    readExcelFile read = new readExcelFile("/home/mario/IdeaProjects/automationpractice/testdataemails.xlsx");
    javaScriptExecutor javaScriptExecutor ;
    ExtentSparkReporter htmlReporter ;

    ExtentTest test;

    signInPage signInObject ;
    signUpPage signUpObject ;

    selectItemPage selectObject;

    ExtentReports extent ;


    @BeforeClass
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get(baseURL);
        javaScriptExecutor = new javaScriptExecutor(driver);
        htmlReporter = new ExtentSparkReporter(fileURL);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setAnalysisStrategy(AnalysisStrategy.CLASS);
        signInObject = new signInPage(driver);
        signUpObject = new signUpPage(driver);
        selectObject = new selectItemPage(driver);
    }


    @AfterClass
    public void tearDown()
    {
        extent.flush();
        driver.close();
    }
}
