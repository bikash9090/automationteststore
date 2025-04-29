package com.automationteststore.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationteststore.base.TestBase;
import com.automationteststore.pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage hpage;

	@BeforeMethod
	public void initialize() {
		hpage = new HomePage(driver);
	}

	@Test
	public void validateLoginPageUrlTest() {
		hpage.clickOn_Login_RegisterBtn();
	}
}
