package com.automationteststore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationteststore.base.PageBase;

public class HomePage extends PageBase {

	@FindBy(partialLinkText = "Login or register")
	WebElement log_Register_btn;

	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickOn_Login_RegisterBtn() {
		log_Register_btn.click();
	}
}
