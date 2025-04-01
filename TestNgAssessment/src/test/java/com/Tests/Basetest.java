package com.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest {
	protected static  WebDriver driver;
	  @BeforeMethod
	  public void setup() {
		  driver=new ChromeDriver();
		  driver.get("https://www.saucedemo.com/v1/index.html");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  PageFactory.initElements(driver, this);
	  }
	  @AfterMethod
	  public void  teardown() {
		  driver.quit();
	  }
}
