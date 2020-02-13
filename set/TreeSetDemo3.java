package com.demo.set;

import java.util.*;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet t=new TreeSet();
		t.add("P");
		t.add("B");
		t.add("M");
		t.add("H");
		t.add("E");
		t.add("F");
		t.add(new StringBuffer("Q"));
		
		System.out.println(t);  
	}

}
