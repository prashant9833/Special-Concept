package com.demo.set;

import java.util.*;

public class TreeSetDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t=new TreeSet(new MyComparator());
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("M"));
		t.add(new StringBuffer("O"));
		t.add(new StringBuffer("N"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("A"));
		System.out.println(t); 

	}

}


class MyComparator implements Comparator
{

	public int compare(Object obj1,Object obj2)
	{
		
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		return s1.compareTo(s2);
		
		
	}

}
