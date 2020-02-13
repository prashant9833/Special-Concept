package com.demo.set;

import java.util.*;

public class TreeSetDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(10,"Prashant");
		Employee e2=new Employee(101,"Ishant");
		Employee e3=new Employee(100,"Supriya");
		Employee e4=new Employee(500,"Anchal");
		Employee e5=new Employee(400,"Amit");
		Employee e6=new Employee(103,"Pankaj");
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);

		System.out.println(t);
		
		TreeSet t1=new TreeSet(new MyComparator3());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		t1.add(e6);

		System.out.println(t1);
		
	}

}


class Employee implements Comparable
{
	
int id;
String name;

public Employee(int eid,String ename)
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
	int eid1=id;
	Employee e=(Employee)obj;
	int eid2=e.id;
	
	if(eid1<eid2){
		
		return -1;
	}else if(eid1>eid2){
		
		
		return +1;
	}else{
		
		return 0;
	}

}


}



class MyComparator3 implements Comparator
{
	
 public int compare(Object obj1,Object obj2)
 {
	 Employee e1=(Employee)obj1;
	 Employee e2=(Employee)obj2;
	 Integer i1=e1.id;
	 Integer i2=e2.id;
      
      return i2.compareTo(i1);
 }
 
	
}
