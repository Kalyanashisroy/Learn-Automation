package com.SetExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TreeSet {

	public static void main(String[] args) {
		
		java.util.TreeSet<String> ts=new java.util.TreeSet<String>();
		ts.add("Selenium");
		ts.add("QTP");
		ts.add("Jenkins");
		ts.add("1");
		ts.add("12");
		ts.add("KR");
		ts.add("KGEC");
		ts.add("Winium");
		
		System.out.println(ts);
		for(String e:ts) {
			System.out.println(e);
		}
		
	}

}
