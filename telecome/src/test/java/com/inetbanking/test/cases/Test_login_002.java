package com.inetbanking.test.cases;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.base.baseclass;
import com.inetbanking.pageobjects.loginpage;

public class Test_login_002 extends baseclass {

	loginpage login;
	@Test(dataProvider = "listdata")
	public void logintest(String name,String password) {
		login=new loginpage();
		login.usrename(name);
		login.password(password);
		login.submit();
		logger.info("login successfully");
		
	}

	@DataProvider(name="listdata")
	public String[][] data() throws Exception {
		XSSFWorkbook book=new XSSFWorkbook("C:\\Users\\akash\\eclipse-workspace\\telecome\\src\\test\\java\\com\\inetbanking\\test\\data\\logindata.xlsx");
		XSSFSheet sheet=book.getSheet("Sheet1");
		int a=sheet.getPhysicalNumberOfRows();
		int b=sheet.getRow(0).getPhysicalNumberOfCells();
		String data[][]=new String[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				DataFormatter ds=new DataFormatter();
				data[i][j]=ds.formatCellValue(sheet.getRow(i).getCell(j));

			}
		}

		return data;

	}

}
