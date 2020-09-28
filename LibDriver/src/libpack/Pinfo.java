package libpack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import libpack.Books;
import libpack.Rent;

import java.util.Scanner;

public class Pinfo extends Ldriver {

 String User_ID, Name, is_Staff,New,Existing;

	public void Pinfo() 
	{
		Scanner s = new Scanner(System.in); 
		String User_ID = null, Name= null, Booklist= null;
		int New=0 ;
		int lr=0;
		Books bs = new Books();
		Rent rt = new Rent();
		Buy by = new Buy();
		LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>(); 
		
		System.out.println("press 1 for new user or 0 for existing users");
		New = s.nextInt();
		if(New==1){
			System.out.println("Enter desired User ID");
			User_ID= s.next();
			lhmap.put("User_ID::", User_ID);
			System.out.println("Enter Name");
			Name =s.next();
			lhmap.put("Name::", Name);
			System.out.println("ID Suscessfully created");
			System.out.println(lhmap);

		}
		else if (New==0) {
			
			System.out.println("Enter User_ID");
			User_ID= s.next();
			System.out.println("press 1 for your library \npress 0 for renting a book\n press 2 for buying a book");
			lr= s.nextInt();
			if(lr==1) {
				bs.list();
			}
			else if(lr==0) {
				bs.list();
				rt.rent_list();
			}
			else if(lr==2) {
				//buy the book
				bs.list();
				by.buy();
			}
		}
		else {
			System.out.println("Invalid Entry try Again");
		
			}
		/*this.User_ID = User_ID;
		this.Name= Name;
		this.is_Staff = is_Staff;*/		
		}
	@Override
	public void Ldriver() {
		// TODO Auto-generated method stub		
	}
}
