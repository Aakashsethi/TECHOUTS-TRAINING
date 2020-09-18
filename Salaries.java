package main_package;
import java.util.*;

class Salaries extends Emp{
float salary;
double taxcut;
public void tax() {
	if (salary>70000) {
		taxcut= 0.14*salary;
		System.out.println("taxcut"+taxcut);
	}
	else if(salary<=70000) {
		taxcut= 0.09*salary;
		System.out.println("taxcut"+taxcut);
	}
}

}


