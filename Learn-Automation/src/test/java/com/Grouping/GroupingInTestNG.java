package com.Grouping;

import org.testng.annotations.Test;

public class GroupingInTestNG {
	
	@Test(groups= {"sanity"})
	public void test1() {
		
	}
	@Test(groups= {"smoke"})
	public void test2() {
		
	}
	@Test(groups= {"regression"})
	public void test3() {
		
	}
	@Test(groups= {"functional"})
	public void test4() {
		
	}
	@Test(groups= {"sanity","regression"})
	public void test5() {
		
	}
	@Test(groups= {"smoke","functional"})
	public void test6() {
		
	}

}
