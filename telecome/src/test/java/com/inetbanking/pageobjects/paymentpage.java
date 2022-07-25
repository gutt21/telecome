package com.inetbanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.base.baseclass;

public class paymentpage extends baseclass {


	public paymentpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	WebElement paytam;


	@FindBy(xpath = "//a[@title='Pay by check.']")
	WebElement check;

	@FindBy(xpath = "//span[normalize-space()='I confirm my order']")
	WebElement confirm;

	public void paytamtest() {
		paytam.click();
	}

	public void checktest() {

		check.click();
	}

	
	public void confirmorder() {
		confirm.click();
		
		if(driver.getPageSource().contains("Your order on My Store is complete.")) {
			System.out.println("my order is completed");
		}else {
			System.out.println("my order not is completed");
		}
	}
	
	
	
	
}
