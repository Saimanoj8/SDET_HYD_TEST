package com.vtiger.Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class ReaddatafromProperties {

	public String readdatafromproperties(String key) throws Throwable {
		FileInputStream fis= new FileInputStream("C:\\Users\\bharath reddy\\Desktop\\Files\\localhost.properties");
		Properties prop= new Properties();
		prop.load(fis);
		 return prop.getProperty(key);

	}

}
