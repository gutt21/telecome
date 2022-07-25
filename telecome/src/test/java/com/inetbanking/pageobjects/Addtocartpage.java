package com.inetbanking.pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.base.baseclass;

public class Addtocartpage extends baseclass {


	public Addtocartpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement image;

	@FindBy(xpath ="//i[@class='icon-plus']")
	WebElement quan;

	@FindBy(id = "group_1")
	WebElement size;

	@FindBy(xpath = "//a[@id='color_13']")
	WebElement color;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	WebElement add;

	@FindBy(xpath ="//*[@id=\"layer_cart\"]/div[1]//h2/i")
	WebElement verify;
	
	
	
	public void imageclick() {

		image.click();
	}

	public void quantity() {
		quan.click();
	}

	public void sizem() {
		size.click();
		driver.findElement(By.xpath("//option[contains(text(),'M')]")).click();
	}

	public void colors() {
		color.click();
	}

	public void addcart() {
		add.click();
	}
	public void verifycart() {		
		if(driver.getPageSource().contains("Product successfully added to your shopping cart")) {
			System.out.println("product successfully added");
		}else {
			System.out.println("product successfully no added");
		}
	}
	
	
	
}
