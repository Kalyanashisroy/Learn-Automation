package com.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class TestSeleniumBlog {
	
	@Test
	public void testConfig() throws Exception
	{
		File src=new File("./Configuration/Config.property");
		FileInputStream fis=new FileInputStream(src);
		Properties pro=new Properties();
		pro.load(fis);
		//String chromepath=pro.getProperty("ChromeDriver");
		//System.out.println("Hey Chrome path is ===="+chromepath);
		//String geckopath=pro.getProperty("GeckoDriver");
		//System.out.println("Hey Gecko path is ===="+geckopath);
		//String operapath=pro.getProperty("OperaDriver");
		//System.out.println("Hey Opera path is ===="+operapath);
		String iepath=pro.getProperty("IEDriver");
		System.out.println("Hey IE path is ===="+iepath);
		
	}

}
