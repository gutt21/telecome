package com.inetbanking.test.cases;

import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.search_page;

public class serch_test_001 extends baseclass {

	search_page search;
	@Test
	public void searchtest() {		
		 search=new search_page();
		 search.serch();
		 search.serchsubmit();
		 search.verifimage();
		 logger.info("product availablity test");
		 
	}
}
