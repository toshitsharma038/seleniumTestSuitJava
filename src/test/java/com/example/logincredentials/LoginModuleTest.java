package com.example.logincredentials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import com.beust.testng.TestNG;

public class LoginModuleTest {
	
	

	//@Test
	public void loginTest() {
		// create driver

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep 2 sec
		sleep(1000);
		// maximize browser window
		driver.manage().window().maximize();
		// open test page
		String url = "https://www.saucedemo.com/";
		System.out.println(url);
		driver.get(url);

		sleep(4000);

		// Enter the username

		driver.findElement(By.id("user-name"));
		WebElement username = driver.findElement(By.id("user-name"));

		// Enter the Password
		driver.findElement(By.id("password"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		sleep(2000);
		password.sendKeys("secret_sauce");
		sleep(2000);

		// clicking on button
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		sleep(3000);

		// verfication of URL
		String expectedurl = "https://www.saucedemo.com/inventory.html";
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl, expectedurl, "The Url of actualpage  is not same as excepted");

		// Check button is present after login
		WebElement addcart = driver.findElement(By.className("bm-burger-button"));
		Assert.assertTrue(addcart.isDisplayed(), "Add to cart Button is not available");

		// exiting the driver
		driver.quit();

	}

	
	  @Test public void incorrectUserName() {
	  
	  System.setProperty("webdriver.chrome.driver",
	  "src/main/resources/chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver();
	  
	  // sleep 2 sec 
	  sleep(1000); 
	  // maximize browser window
	  driver.manage().window().maximize();
	  
	  // open test page 
	  String url = "https://www.saucedemo.com/"; 
	  driver.get(url);
	  
	  sleep(4000);
	  
	  // Enter the username
	  
	  driver.findElement(By.id("user-name")); 
	  WebElement username = driver.findElement(By.id("user-name"));
	  
	  // Enter the Password 
	  driver.findElement(By.id("password")); 
	  WebElement password = driver.findElement(By.id("password"));
	  username.sendKeys("Incorrect Username"); 
	  sleep(2000);
	  password.sendKeys("secret_sauce"); 
	  sleep(2000);
	  
	  // clicking on button WebElement login =
	  WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
	  System.out.println(login); 
	  login.click();
	  
	  // Verification WebElement errorMessage =
	  WebElement errorMessage= driver.findElement(By.className("error-message-container"));
	  
	  System.out.println("errorMessage->" + errorMessage.getText());
	  
	  String expectedErrorMessage =
	  "Epic sadface: Username and password do not match any user in this service";
	  
	  String actualErrorMessage = errorMessage.getText();
	  
	  boolean b = actualErrorMessage.contains(expectedErrorMessage);
	  
	  Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),
	  "Actual message does not contain expected message");
	  
	  driver.quit();
	  
	  }
	  
	  @Test public void incorrectPassword() {
	  
	  System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver();
	  
	  // sleep 2 sec sleep(1000); // maximize browser window
	  driver.manage().window().maximize();
	  
	  // open test page 
	  String url = "https://www.saucedemo.com/"; 
	  driver.get(url);
	  
	  sleep(4000);
	  
	  // Enter the username
	  
	  driver.findElement(By.id("user-name")); 
	  WebElement username =driver.findElement(By.id("user-name"));
	  
	  // Enter the Password driver.findElement(By.id("password")); WebElement
	 WebElement password = driver.findElement(By.id("password"));
	  username.sendKeys("standard_user"); sleep(2000);
	  password.sendKeys("aaaaaaa"); sleep(2000);
	  
	  // clicking on button WebElement login =
	  WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
	  System.out.println(login); 
	  login.click();
	  
	  // Verification WebElement errorMessage =
	  WebElement errorMessage= driver.findElement(By.className("error-message-container"));
	  
	  System.out.println("errorMessage->" + errorMessage.getText());
	  
	  String expectedErrorMessage ="Epic sadface: Username and password do not match any user in this service";
	  
	  String actualErrorMessage = errorMessage.getText();
	  
	  boolean b = actualErrorMessage.contains(expectedErrorMessage);
	  
	  Assert.assertTrue(actualErrorMessage.contains(expectedErrorMessage),"Actual message does not contain expected message");
	  
	  driver.quit();
	
	  }  
	
	@Test
	public void homepageClickOnButton() 
	{
		// create driver

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// sleep 2 sec
		sleep(1000);
		// maximize browser window
		driver.manage().window().maximize();
		// open test page
		String url = "https://www.saucedemo.com/";
		System.out.println(url);
		driver.get(url);

		sleep(4000);

		// Enter the username

		driver.findElement(By.id("user-name"));
		WebElement username = driver.findElement(By.id("user-name"));

		// Enter the Password
		driver.findElement(By.id("password"));
		WebElement password = driver.findElement(By.id("password"));
		username.sendKeys("standard_user");
		sleep(2000);
		password.sendKeys("secret_sauce");
		sleep(2000);

		// clicking on button
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		sleep(3000);

		// verfication of URL
		String expectedurl = "https://www.saucedemo.com/inventory.html";
		String actualurl = driver.getCurrentUrl();

		Assert.assertEquals(actualurl, expectedurl, "The Url of actualpage  is not same as excepted");

		// Check button is present after login
		WebElement addcart = driver.findElement(By.className("bm-burger-button"));
		Assert.assertTrue(addcart.isDisplayed(), "Add to cart Button is not available");
		//add-to-cart-sauce-labs-backpack
		
		
		
		// exiting the driver
		driver.quit();

	}
	 

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



}
