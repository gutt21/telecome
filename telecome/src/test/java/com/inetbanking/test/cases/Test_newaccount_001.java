package com.inetbanking.test.cases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.creatingaccount;

public class Test_newaccount_001 extends baseclass {

	
	
	creatingaccount newacount;
	
	@Test
	public void account() {
		newacount=new creatingaccount();
		newacount.account();
		newacount.clickbutton();
		newacount.newaccounted();
		
	}
	
	
	
	
	
	
	
}
