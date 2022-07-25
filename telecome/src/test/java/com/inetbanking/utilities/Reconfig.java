package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Reconfig {

	static Properties prop;

	public Reconfig() {

		try {
			InputStream input=new FileInputStream("C:\\Users\\akash\\eclipse-workspace\\telecome\\configuration\\config.properties");
			prop=new Properties();
			prop.load(input);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String url() {
		String url=  prop.getProperty("baseurl");
		return url;

	}

	public String brow() {
		String brown= prop.getProperty("browser");
		return brown;

	}

	public String name() {
		String name=  prop.getProperty("username");
		return name;

	}
	public String pass() {
		String pas=  prop.getProperty("password");
		return pas;

	}
	
	
}
