package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties pro;
	public ConfigReader() {
		try {
			File src = new File("./Configuration/Config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is ====" + e.getMessage());
		}
	}
	public String getChromePath() {
		// String path=pro.getProperty("ChromeDriver");
		return pro.getProperty("ChromeDriver");
	}
	public String getGeckoPath() {
		return pro.getProperty("GeckoDriver");
	}
	public String getOperaPath() {
		return pro.getProperty("OperaDriver");
	}
	public String getIEPath() {
		return pro.getProperty("IEDriver");
	}
	public String getApplicationURL() {
		return pro.getProperty("URL");
	}

}
