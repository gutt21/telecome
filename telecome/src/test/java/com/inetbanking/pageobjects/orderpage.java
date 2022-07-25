package com.inetbanking.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.base.baseclass;

public class orderpage extends baseclass {

	
	
	public orderpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	WebElement check;
	
	@FindBy(xpath = "//span[@id='product_price_1_3_0']")
	WebElement unit;
	
	@FindBy(xpath = "//td[@id='total_price_container']")
	WebElement total;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement checout;
	
	public void checkut() {
		check.click();		
	}
		
	public double unitprice() {
		String unitp=unit.getText();
		String unit1=unitp.replaceAll("[^a-zA-Z0-9]", "");
		double unit2=Double.parseDouble(unit1);	
		return unit2/100;
	}
	

	public double totalunitprice() {
		String tunitp=total.getText();
		String unit1=tunitp.replaceAll("[^a-zA-Z0-9]", "");
		double tunit2=Double.parseDouble(unit1);	
		return tunit2/100;
	}
	
	public void checkout() {
		checout.click();
	}

}
