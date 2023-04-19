package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import org.testng.Assert;
import utilities.ReadXlData;


public class SubscriptionTestCase extends BaseTest{

	    @Test
		public static void SelectCountryOptionValidation() {
			// verifying select country option is available or not
	    	driver.findElement(By.xpath("//a[@id='translation-btn']")).click();
        	System.out.println("Successfully translated to English");
	    	driver.findElement(By.xpath("//span[@id='country-name']")).click();
	    	System.out.println("Succesfully clicked the Choose country option");
	    	driver.findElement(By.xpath("//div[@id='ae-contry-flag']//img[@alt='ae']")).click();
	    	System.out.println("Succesfully choose the country");
	    	
	    	WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Choose Your Plan']"));
	    	String actualText = element.getText();
	        String expectedText = "Choose Your Plan";
	        //Assert.assertEquals(actualText, expectedText, "Text not found on page");
	        if(expectedText.equals(actualText)==true)
        	{
        		System.out.println("test is PASSED and User is able to Navigate the Choose your plan page");
        		
        	}
        	else 
        	{
        		System.out.println("test is Failed");
        	}        
	 		
		}
	        
	    @Test
	    public static void subScriptionPackageValidation()
	    {
	    
	    	WebElement classicPackage = driver.findElement(By.xpath("//h4[normalize-space()='CLASSIC']"));
	        String actualclassicPackage = classicPackage.getText();
	        String expectedclassicPackage = "CLASSIC";
	        Assert.assertEquals(actualclassicPackage, expectedclassicPackage, "classic package not found on page");

	        WebElement LitePackage = driver.findElement(By.xpath("//strong[@id='name-lite']"));
	        String actualLitePackage = LitePackage.getText();
	        String expectedLitePackage = "LITE";
	        Assert.assertEquals(actualLitePackage, expectedLitePackage, "Lite package not found on page");

	        WebElement premiumPackage = driver.findElement(By.xpath("//strong[@id='name-premium']"));
	        String actualPremiumPackage = premiumPackage.getText();
	        String expectedPremiumPackage = "PREMIUM";
	        Assert.assertEquals(actualPremiumPackage, expectedPremiumPackage, "Premium package not found on page");
	    }

	   
}
