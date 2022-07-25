package com.inetbanking.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.inetbanking.base.baseclass;



public class reporting implements ITestListener {

	ExtentSparkReporter report;
	ExtentReports extent;
	ExtentTest test;
	String timestamp;
	@Override
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN) );	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(result.getName(),ExtentColor.RED) );	
		baseclass base=new baseclass();
		base.screenshot(result.getMethod().getMethodName(), timestamp);
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(result.getName(),ExtentColor.BLUE) );

	}

	@Override
	public void onStart(ITestContext context) {
		timestamp=new SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date());
		String repname="Test-Report-"+timestamp+".html";
		report=new ExtentSparkReporter("C:\\Users\\akash\\eclipse-workspace\\telecome\\test-output/"+repname);
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("User", "akash");	
		report.config().setDocumentTitle("automation Test Project");
		report.config().setReportName("Funtional Test Automation Project");	
		report.config().setTheme(Theme.DARK);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();

	}



}
