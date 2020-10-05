package one2many;

import java.util.Scanner;

public class Employee extends One {

	String Name;
	int rating;
	int Start_year;

	public void Employee() {
		//importing a scanner function
		Scanner s = new Scanner( System.in );
		
		System.out.print("Enter your Name: ");
		Name= s.next();
		this.Name = Name;
		System.out.print("Enter rating: ");
		rating= s.nextInt();
		this.rating = rating;
		System.out.print("Enter your start year mmddyyyy ");
		Start_year= s.nextInt();
		this.Start_year= Start_year;
		
		
	}
	 
	
}
