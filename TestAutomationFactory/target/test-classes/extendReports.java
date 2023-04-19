package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;	`
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ExtendReports {
	
	
	public static void main(String[] args) {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentXReporter extentxReporter = new ExtentXReporter();
		extent.attachreporter(htmlReports);
		ExtentTest test1 = extent.createTest("Jawwy application test");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://subscribe.stctv.com/");// This is hardcoded
		driver.get(prop.getProperty("testurl"));
		test1.log(INFO)

	}

}
