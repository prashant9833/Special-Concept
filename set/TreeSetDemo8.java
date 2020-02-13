package com.demo.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 e1=new Employee1(10,"Prashant");
		Employee1 e2=new Employee1(101,"Ishant");
		Employee1 e3=new Employee1(100,"Supriya");
		Employee1 e4=new Employee1(500,"Anchal");
		Employee1 e5=new Employee1(400,"Amit");
		Employee1 e6=new Employee1(103,"Pankaj");
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);

		System.out.println(t);
		
		TreeSet t1=new TreeSet(new MyComparator4());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);

		System.out.println(t1);
		
	}

}


class Employee1 implements Comparable
{
	
int id;
String name;

public Employee1(int eid,String ename)
{
	
	this.id=eid;
	this.name=ename;

}

public String toString()
{
	
	return id+"----"+name;

}

public int compareTo(Object obj)
{
	String ename1=name;
	Employee1 e=(Employee1)obj;
	String ename2=e.name;
	
    return ename1.compareTo(ename2);

}


}



class MyComparator4 implements Comparator
{
	
 public int compare(Object obj1,Object obj2)
 {
	 Employee1 e1=(Employee1)obj1;
	 Employee1 e2=(Employee1)obj2;
	 String s1=e1.name;
	 String s2=e2.name;
      
      return s2.compareTo(s1);
 }
 
	
}


