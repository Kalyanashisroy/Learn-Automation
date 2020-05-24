package com.Runner;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;

public class TestRunner {
	public static void main(String[] args) {
		TestNG runner=new TestNG();
		List<String> list=new ArrayList<String>();
		list.add("C:\\Users\\KALYANASHIS\\eclipse-workspace\\Learn-Automation\\src\\test\\java\\com\\FailedTestCases\\TestCase3.java");
		runner.setTestSuites(list);
		runner.run();
	}
	

}
