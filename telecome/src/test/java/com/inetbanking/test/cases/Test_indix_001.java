package com.inetbanking.test.cases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.indixpage;
import com.inetbanking.pageobjects.loginpage;



public class Test_indix_001 extends baseclass {
	indixpage indix;
	loginpage login;
	@Test
	public void indixtest() {
		indix=new indixpage();	
		indix.gettital();
		logger.info("Tital verify successfully");
		indix.singbutton();
		logger.info("sign button successfully");	
		
	}


}
