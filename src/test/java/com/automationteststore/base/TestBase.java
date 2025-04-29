package com.automationteststore.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	protected WebDriver driver;
	
	@BeforeTest
	public void openBrowserOnlink() {
		driver = DriverFactory.getDriverFactoryInstance().initializeDriverInstance("chrome");
		driver.get("");
		driver.manage().window().maximize();
	}
}
