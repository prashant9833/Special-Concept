package com.demo.set;

import java.util.*;

public class TreeSetDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet t=new TreeSet(new MyComparator2());
		t.add("SAAS");
		t.add("TUSH");
		t.add("UMBRELLA");
		t.add(new StringBuffer("LLLL"));
		t.add(new StringBuffer("MOMOS"));
		t.add(new StringBuffer("STUVWX"));
		t.add(new StringBuffer("OOOOOOOOOOOOOOOOOOOOOO"));
		t.add(new StringBuffer("PIZZAS"));
		System.out.println(t);

	}

}


class MyComparator2 implements Comparator
{

	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		
		int l1=s1.length();
		int l2=s2.length();
		
		if(l1<l2){
			
			return -1;
		}else if(l1>l2){
			
			return +1;
		}else{
			
			return s1.compareTo(s2);
		}
	}

}