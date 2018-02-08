package com.mindtree.SeleniumApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium {
	
//	@Test
//	public void test1(){
//		Assert.assertEquals("Ravi", "abs");
//	}
	@Test
	public void test2(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1043021\\Downloads\\chromedriver.exe");
		WebDriver wb=new ChromeDriver();
		wb.get("https://www.google.co.in");
	}

}
