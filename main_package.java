package main_package;
import java.util.Scanner;
import main_package.Emp;
import main_package.members;

public abstract class main_package implements members
{
public void information() {
	System.out.println("use of abstraction");
}

public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);

	Emp e = new Emp();
	Salaries s = new Salaries();
	
for(int i=0;i<1;i++)
	{
	System.out.println("Enter Name");
	String name = in.next();
	System.out.println("Enter Gender");
	char gender = in.next().charAt(0);
	System.out.println("Enter Age");
	int age = in.nextInt(); 
	System.out.println("Enter Mobile no");
	long mobileNo = in.nextLong();
	System.out.println("Enter salaries");
	float salary = in.nextFloat();
    
	
	
	e.create();
	s.tax(salary);
	System.out.println("Name: "+name); 
    System.out.println("Gender: "+gender); 
    System.out.println("Age: "+age); 
    System.out.println("Mobile Number: "+mobileNo); 
   
}
//
((members) e).information();

    
	
	
	
	
	
    
	
}
}
