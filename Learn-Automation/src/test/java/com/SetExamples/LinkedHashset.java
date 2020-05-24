package com.SetExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Selenium");
		lhs.add("QTP");
		lhs.add("Jenkins");
		lhs.add("1");
		lhs.add("12");
		lhs.add("KR");
		lhs.add("KGEC");
		lhs.add("Winium");
		
		System.out.println(lhs);
		for(String e:lhs) {
			System.out.println(e);
		}
		
	}

}
