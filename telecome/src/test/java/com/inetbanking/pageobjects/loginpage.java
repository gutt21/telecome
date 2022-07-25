package com.inetbanking.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.inetbanking.base.baseclass;

public class loginpage extends baseclass {



	public loginpage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "email")
	WebElement user;

	@FindBy(id = "passwd")
	WebElement pass;

	@FindBy(id = "SubmitLogin")
	WebElement button;

	@FindBy(xpath = "//a[@title='Log me out']")
	WebElement logout;

	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	WebElement sing;

	
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement logo;

	public void usrename(String name) {
		user.sendKeys(name);
	}

	public void password(String password) {
		pass.sendKeys(password);
	}

	public void submit() {
		button.click();
	}
	
	public indixpage logo() {
		logo.click();		
		return new indixpage();
	}
	
	



}
