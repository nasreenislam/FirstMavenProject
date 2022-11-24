package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		
		
		driver.close();
	}


	

}
