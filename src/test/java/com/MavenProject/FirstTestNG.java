package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNG {
	@Test
	public void test1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com");
		//scrolling the page
		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		Thread.sleep(2000);
		
		
		//this is closing the browser.
		driver.close();
	}

}
