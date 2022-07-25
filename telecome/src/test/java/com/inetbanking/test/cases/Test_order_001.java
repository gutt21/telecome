package com.inetbanking.test.cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.orderpage;

public class Test_order_001 extends baseclass {

	orderpage order;

	@Test
	public void ordertest() {
		order=new orderpage();
		order.checkut();
		Double unit=order.unitprice();
		Double total =order.totalunitprice();
		Double totalprice=(unit*2)+2;
		Assert.assertEquals(total, totalprice);
		order.checkout();
	}
}
