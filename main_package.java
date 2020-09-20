package main_package;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

import main_package.Emp;
import main_package.members;

public abstract class main_package implements members
{
public void information() {
	//Use of abstraction
	//System.out.println("use of abstraction");
}

public static void main(String[] args) 
{
	
	String mobile = null;
	String salaries = null;
	//ArrayList
	ArrayList<String> list=new ArrayList<String>();
	ArrayList<String> row=new ArrayList<String>();
	Scanner in = new Scanner(System.in);
	
	for(int i=0;i<2;i++)
	{
	
	System.out.println("Enter Mobile no");
	 mobile = in.next();
	 list.add(mobile);
	System.out.println("Enter salary");
	 salaries = in.next();
	 row.add(salaries);
    
	
	Emp e = new Emp();
	Salaries s = new Salaries();
	e.create();
	System.out.println("mobile no"+mobile);
	System.out.println("salary"+salaries);
	System.out.println("emp no"+e.empno);
	System.out.println("ssn"+e.ssn);
	s.tax(salaries);
	}
	System.out.println("Mobile nos are");
	Iterator<String> itr =list.iterator();
	while(itr.hasNext()){
		
		System.out.println(itr.next());
	}
	
	System.out.println("Salaries are");
	Iterator<String> itr1 =row.iterator();
	while(itr1.hasNext()){
		
		System.out.println(itr1.next());
	} 
	
	//Linked List//
	//linked list declaration
	 LinkedList<String> al=new LinkedList<String>(); 
	 System.out.println("\nAdding in a LinkedList:");
	    al.add("This is");  
	    al.add("Add method");  
	    al.add("in");  
	    al.add("LinkedList");  
	  
	 Iterator<String> itr11=al.iterator();  
	    while(itr11.hasNext())
	    {  
	      System.out.println(itr11.next());  
	    }  
	    
	   
	    //removing First and last elements in LinkedList
	    al.removeFirst();
	    al.removeLast();  
	  System.out.println(al);   
	  
	  //Vector//
	  Vector<Integer> numbers=new Vector<Integer>();
	  numbers.add(55);
	  numbers.add(43);
	  numbers.add(556);
	  numbers.add(895);
	  numbers.add(897);
	  System.out.println("Vector: " + numbers);
	  Integer element = numbers.remove(1);
      System.out.println("Removed Element: " + element);
      System.out.println("New Vector: " + numbers);
      numbers.clear();
      System.out.println("Vector after clear(): " + numbers);
	  
	  
	  }
}
