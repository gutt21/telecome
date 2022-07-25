package com.inetbanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.base.baseclass;

public class shippingpage  extends baseclass{

	
	public shippingpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "cgv")
	WebElement click;
	
	@FindBy(xpath  = "//*[@id=\"form\"]/p/button/span")
	WebElement check;
	
	public void boxclick() {
		click.click();
	}
	
	
	public void checkout() {
		check.click();
		
	}
}
