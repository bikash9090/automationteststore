package com.automationteststore.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	private final static DriverFactory instance = new DriverFactory();
	private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

	/*
	 * Making the constructor as private to restrict the object creation publicly.
	 * Implementing singleton design pattern.
	 */
	private DriverFactory() {
	}

	// Get the instance of DriverFactory class by calling the method.
	public static DriverFactory getDriverFactoryInstance() {
		return instance;
	}

	// Get the driver instance from the ThreadLocal pool associated with a separate
	// thread.
	public WebDriver getDriver() {
		return driverPool.get();
	}

	//initializing the browser objects based on parameter.
	public WebDriver initializeDriverInstance(String browserName) {
		WebDriver driver;
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driverPool.set(driver);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driverPool.set(driver);
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driverPool.set(driver);

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driverPool.set(driver);
			break;
		}
		return getDriver();
	}
}
