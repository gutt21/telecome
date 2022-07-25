package com.inetbanking.test.cases;

import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.Addtocartpage;

public class Test_addtocart_001 extends baseclass{
	
	Addtocartpage addcart;
	
	@Test
	public void cartaddtest() {
		addcart=new Addtocartpage();
		addcart.imageclick();
		addcart.quantity();
		addcart.sizem();
		addcart.colors();
		addcart.addcart();
		addcart.verifycart();
		logger.info("added product");
		
		
	//	("[^a-zA-Z0-9]")
	}
	
	

}
