package com.dell.com.jahanpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firsttestng_demo {
	


	@Test
	public void varify_user_login(){
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/");// launch URL
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);//for loading page
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//wait to load hTML or we elements.
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//pageload wait statement
		// Implicit wait
	
	}
}
