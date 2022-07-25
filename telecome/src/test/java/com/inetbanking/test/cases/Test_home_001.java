package com.inetbanking.test.cases;

import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.homepage;

public class Test_home_001 extends baseclass {

	
	homepage home;
	@Test
	public void homepageTest() {
		home=new homepage();
		home.wish();
		logger.info("wishlist verify completed");
		home.order();
		logger.info("orderlist verify completed");
	}
	
}
