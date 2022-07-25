package com.inetbanking.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.base.baseclass;

public class creatingaccount extends baseclass {


	public creatingaccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email_create")
	WebElement newaccount;

	@FindBy(id = "SubmitCreate")
	WebElement newsubmit;
	
	@FindBy(xpath = "//h1[text()='Create an account']")
	WebElement verify;

	public void account() {
		newaccount.sendKeys("guttedarguttedar5@gmail.com");
	}
	public void clickbutton() {
		newsubmit.click();
	}

	public void newaccounted() {
		 boolean gh	=verify.isDisplayed();
		 Assert.assertTrue(gh);
		
	}

}
