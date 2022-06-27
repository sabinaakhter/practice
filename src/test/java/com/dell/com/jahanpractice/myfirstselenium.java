package com.dell.com.jahanpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirstselenium {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/");// launch URL
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Contact")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("recipient-email")).sendKeys("text");
		driver.findElement(By.id("recipient-name")).sendKeys("sabina");
		driver.findElement(By.id("message-text")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();
		
		Thread.sleep(10000);
		driver.quit();
		
		

	}

}
