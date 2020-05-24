package com.Log4j2.Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Demo {
	
	static Logger logger=LogManager.getLogger(Log4j2Demo.class);
	public static void main(String[] args) {
		System.out.println("\n Hello World ..........!    \n");
		
		logger.trace("This is trace message");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is a warn message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n This has been completed .....!  \n");
	}

}
