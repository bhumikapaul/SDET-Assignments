package com.config;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	
	//Properties prop=new Properties();
	String result = "";
	InputStream inputStream;
	
/*	@Test
	public void ReadConfigFile()
	{
		Properties prop = new Properties();
		String name=prop.getProperty("Name");
		System.out.println(prop.getProperty("Name"));
		
		String mobile=prop.getProperty("Mobile");
		String address=prop.getProperty("Address");
		
		System.out.println(mobile);
		System.out.println(address);
		
	}*/

	public String getPropValues() throws IOException {
		
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
 
			Date time = new Date(System.currentTimeMillis());
 
			// get the property value and print it out
			String user = prop.getProperty("Name");
			String mobile = prop.getProperty("Mobile");
			String address = prop.getProperty("Address");
 
			result = "User " + user + " with mobile " + mobile + " and address " + address;
			System.out.println("\nProgram Ran by " + result);
		}catch(Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return result;
		
	}

}
