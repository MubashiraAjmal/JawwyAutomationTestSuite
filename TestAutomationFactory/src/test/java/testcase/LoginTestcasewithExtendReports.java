package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import org.testng.Assert;
import utilities.ReadXlData;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestcasewithExtendReports extends BaseTest{

    ExtentReports extent;
    ExtentTest extentTest;

    @BeforeTest
    public void setup() {
        ExtentSparkReporter spark = new ExtentSparkReporter("extend.html");
        //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @Test
    public void LoginTest() {
        extentTest = extent.createTest("LoginTest", "Verify Login Functionality");

        System.out.println("Successfully Navigated to URL");
        driver.manage().window().maximize();

        extentTest.log(Status.INFO, "Maximizing the browser window");

        WebElement translateButton = driver.findElement(By.xpath("//a[@id='translation-btn']"));
        translateButton.click();
        extentTest.log(Status.INFO, "Clicked on the Translate button");

        String exp_title = "Jawwy TV - Watch Online movies, series & live TV | Enjoy Free Trial";
        String act_title = driver.getTitle();
        System.out.println("page title is"+act_title);

        if(exp_title.equals(act_title)==true) {
            extentTest.log(Status.PASS, "Test is PASSED and navigated to the home page of Jewwy TV");
        } else {
            extentTest.log(Status.FAIL, "Test is FAILED");
        }
    }
}
