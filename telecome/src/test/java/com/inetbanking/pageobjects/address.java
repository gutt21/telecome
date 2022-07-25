package com.inetbanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.base.baseclass;

public class address extends baseclass{

	

	public address() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement address;
	
	
	public shippingpage addresstest() {	
		address.click();
		return new shippingpage();
	}

}
