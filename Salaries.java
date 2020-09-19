package main_package;
import java.util.*;

class Salaries extends Emp{
double taxcut;
public void tax(String salary)
{
	if (salary.equals("70000")) 
	{
		System.out.println("taxcut is 21%");
	}
	
	/*else if(toString(salary) <=70000) {
		taxcut= toString(salary) *0.09;
		System.out.println("taxcut"+taxcut);
	}
	*/
	
	else
		System.out.println("try again!");
}

}


