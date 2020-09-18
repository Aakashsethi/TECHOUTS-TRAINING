package main_package;
import java.util.*;

class Salaries extends Emp{
double taxcut;
public void tax(float salary) {
	if (salary>70000) {
		taxcut= salary*0.14;
		System.out.println("taxcut"+taxcut);
	}
	else if(salary<=70000) {
		taxcut= salary*0.09;
		System.out.println("taxcut"+taxcut);
	}
}

}


