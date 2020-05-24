package com.SetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		Set<String> hs=new HashSet<String>();
		hs.add("Selenium");
		hs.add("QTP");
		hs.add("Jenkins");
		hs.add("1");
		hs.add("12");
		hs.add("KR");
		hs.add("KGEC");
		hs.add("Winium");
		System.out.println("Before convert...................");
		System.out.println(hs);
		for(String e:hs) {
			System.out.println(e);
		}
		
		System.out.println("After convert...................");
		
		ArrayList<String> al=new ArrayList<String>(hs);
		System.out.println(al.get(5));
		
	}

}
