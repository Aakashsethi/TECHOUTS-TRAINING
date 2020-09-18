package main_package;
import java.util.Scanner;




class Emp extends main_package {
	int empno;
	int ssn;
	float salary;
	public void create() {
	
		
	    Scanner in = new Scanner(System.in);
	    
	     
	    System.out.println("enter emp no.");
	    empno = in.nextInt();
	    System.out.println("enter ssn.");
	    ssn = in.nextInt();
	    System.out.println("salary");
	    salary = in.nextFloat();
	     	    
	    System.out.println("emp no:"+empno);
	    System.out.println("ssn:"+ssn);
	    System.out.println("salary:"+salary);
	   
	}
	

}