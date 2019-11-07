package com.server;

import java.io.FileInputStream;
import java.util.Properties;
//This is used for Config the property
public class PropertyFile {
	static Properties pro;
	public static void setProperties() throws Exception
	{
		pro=new Properties();					//Here place the property file explorer Path
		FileInputStream fis=new FileInputStream("C:\\Users\\Krishna\\eclipse-workspace\\Hello\\src\\main\\java\\com\\server\\Config.properties");
	pro.load(fis);
	}
	public static String getUrl(String key) throws Exception
	{
		setProperties();
		String value=pro.getProperty("url");
		return value;
	}
	
}
