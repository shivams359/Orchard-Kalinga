package com.mindtree;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium {
	
	Logger logger = Logger.getLogger("TestSelenium");
	@Test
	public void test1() throws InterruptedException{
		
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1043021\\Downloads\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\www.google.com");
		logger.info("opened google");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("Gmail");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		Thread.sleep(3000);
				
	} 		
}
