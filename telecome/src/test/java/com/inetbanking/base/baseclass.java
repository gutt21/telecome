package com.inetbanking.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.Reconfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	Reconfig read=new Reconfig();
	//public String browsername="firefox";
	public String userna=read.name();
	public String passwo=read.pass();
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akash\\eclipse-workspace\\telecome\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("invalid browser name");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		logger=Logger.getLogger("organge");
		PropertyConfigurator.configure("log4j.properties");
		driver.get("http://automationpractice.com/index.php");

	}


	@AfterTest
	public void teardown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	 public void screenshot(String filename,String time){ 
			TakesScreenshot ts=(TakesScreenshot)driver;
			File file=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(file, new File("C:\\Users\\akash\\eclipse-workspace\\telecome\\screenshot/"+filename+""+time+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println("screenshot saved");
			 
		}

}
