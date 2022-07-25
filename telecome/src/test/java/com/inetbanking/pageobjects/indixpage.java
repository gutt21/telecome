package com.inetbanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.inetbanking.base.baseclass;

public class indixpage extends baseclass {

	
	public indixpage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement sing;
	
	
	public void singbutton() {
		sing.click();
		
	}
	
	public void gettital() {
		
	String actual=driver.getTitle();	
	String expext="My Store";
	Assert.assertEquals(actual, expext);
	
	}
	
	
	
}
