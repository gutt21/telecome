package com.inetbanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.inetbanking.base.baseclass;

public class homepage extends baseclass {

	public homepage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'My wishlists')]")
	WebElement my;
	
	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	WebElement ordrelist;
		
	public void wish() {
		boolean ag1=my.isDisplayed();
		Assert.assertTrue(ag1);		
		
	}
	public void order() {
		boolean ag1=ordrelist.isDisplayed();
		Assert.assertTrue(ag1);		
		
	}
	
	
}
