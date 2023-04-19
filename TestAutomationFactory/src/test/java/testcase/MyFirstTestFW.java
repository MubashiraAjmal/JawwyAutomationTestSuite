package testcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import org.testng.Assert;
import utilities.ReadXlData;


public class FirstTestFW extends BaseTest{

	    @Test
	    public static void LoginTest()
		
		{
			
        	System.out.println("Successfully Navigated to URL");
        	driver.manage().window().maximize();
        	
        	driver.findElement(By.xpath("//a[@id='translation-btn']")).click();
        	System.out.println("Successfully translated to English");
        	
        	String exp_title = "Jawwy TV - Watch Online movies, series & live TV | Enjoy Free Trial";
        	String act_title = driver.getTitle();
        	System.out.println("page title is"+act_title);
        	
        	if(exp_title.equals(act_title)==true)
        	{
        		System.out.println("test is PASSED and navigated to the home page of Jewwy TV");
        		
        	}
        	else 
        	{
        		System.out.println("test is Failed");
        	}
        	
        	driver.findElement(By.linkText("Sign in")).click();
        	driver.findElement(By.name("username")).sendKeys("pvmubashira92@gmail.com");
        	driver.findElement(By.xpath("//button[@type='submit']")).click();
        	WebElement signinpage = driver.findElement(By.xpath("//span[@class='error-msg-top']"));
	        String actualmessage = signinpage.getText();
	        System.out.println(actualmessage);
	        String expectedmessage = "Success";
	        if(expectedmessage.equals(actualmessage)==true)
        	{
        		System.out.println("test is PASSED and navigated to the home page of Jewwy TV");
        		
        	}
        	else 
        	{
        		System.out.println("test is Failed");
        	}
	        //Assert.assertEquals(actualmessage, expectedmessage, "login id does not exist"); 
        	
        	
		}
	    
	   
}
