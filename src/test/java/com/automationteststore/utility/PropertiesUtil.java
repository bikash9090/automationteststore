package com.automationteststore.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import com.automationteststore.base.Constants;

public class PropertiesUtil {
	Properties propObj;

	public PropertiesUtil() {
		String path = Constants.PROPERTIES_FILE_PATH;
		FileInputStream fis;
		propObj = new Properties();

		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found!");
			e.printStackTrace();
		}
	}

	public String getURL() {
		return propObj.getProperty("url");
	}

	public String getBrowser() {
		return propObj.getProperty("browser");
	}
}
