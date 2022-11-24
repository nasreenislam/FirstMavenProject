package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnoTestNG {
	WebDriver driver;
	
	@BeforeClass
	public void openingBrowser() {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void test2_openingURL() {
		driver.get("https://demoqa.com");
	}
	
	@Test
	public void test3_scrolling() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
		Thread.sleep(2000);
		
	}
	@Test
	public void test4_clickingBookStore() throws InterruptedException {
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void test5_clickingElements() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closingBrowser() {
		driver.close();
	}

}
