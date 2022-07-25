package com.inetbanking.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.base.baseclass;

public class search_page extends baseclass{



	public search_page() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "search_query_top")
	WebElement serchbox;

	@FindBy(name = "submit_search")
	WebElement serchboxsubmit;

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement verify;

	public void serch() {
		serchbox.sendKeys("t-shirt");
	}
	public Addtocartpage serchsubmit() {
		serchboxsubmit.click();;
		return new Addtocartpage();
	}

	public void verifimage() {
		boolean ag= verify.isDisplayed();	
		Assert.assertTrue(ag);
	}
}
