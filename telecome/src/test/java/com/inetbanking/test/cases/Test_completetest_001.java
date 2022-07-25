package com.inetbanking.test.cases;

import org.testng.annotations.Test;
import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.address;
import com.inetbanking.pageobjects.paymentpage;
import com.inetbanking.pageobjects.shippingpage;

public class Test_completetest_001 extends baseclass{

	address add;
	shippingpage ship;
	paymentpage pay;
		
	@Test
	public void complete() {
		add=new address();
		add.addresstest();
		ship=new shippingpage();
		ship.boxclick();
		ship.checkout();
		pay=new paymentpage();
		pay.paytamtest();
		pay.confirmorder();
		
		
	}
}
