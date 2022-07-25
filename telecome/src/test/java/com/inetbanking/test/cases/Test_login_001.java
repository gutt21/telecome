package com.inetbanking.test.cases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.address;
import com.inetbanking.pageobjects.loginpage;
import com.inetbanking.pageobjects.paymentpage;
import com.inetbanking.pageobjects.shippingpage;

public class Test_login_001 extends baseclass {

	address add;
	shippingpage ship;
	paymentpage pay;
		
	loginpage login;
	@Test
	public void logintest() {
		login=new loginpage();
		login.usrename(userna);
		login.password(passwo);
		login.submit();
		logger.info("login successfully");	
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
