package p1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
public class Details 
{
	String name, Age, Gender, Contact, Address;
	
	public String create() {
		//Getting values from users in a Linked list//
		 LinkedList<String> ll = new LinkedList<>(); 
		 Scanner s = new Scanner(System.in); 
		 System.out.println("enter name.");
	    name = s.next();
	    ll.add(name);
	    System.out.println("enter Age");
	    Age = s.next();
	    ll.add(Age);
	     System.out.println("enter Gender");
	    Gender = s.next();
	     ll.add(Gender);
	     System.out.println("enter Contact");
	     Contact = s.next();
	    ll.add(Contact);
	     System.out.println("enter Address");
	     Address = s.next();
	     ll.add(Address);
	     
	     
	    Iterator<String> itr =ll.iterator();
	 	while(itr.hasNext()){
	 		
	 		System.out.println(itr.next());
	 	}
	 	
	 	
	 System.out.println("**************Linked HashMap ***************");
	 	
	 	//HashMap Declaration
	 	LinkedHashMap<String, String> lhmap = new LinkedHashMap<String, String>();

        //Adding elements to LinkedHashMap
        lhmap.put("name", name);
        lhmap.put("Age", Age);
        lhmap.put("Gender", Gender);
        lhmap.put("Contact", Contact);
        lhmap.put("Address", Address);

        // Generating a Set of entries
        Set set = lhmap.entrySet();

        // Displaying elements of LinkedHashMap
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry me = (Map.Entry)iterator.next();
           System.out.print(""+me.getKey() +"::::"+ me.getValue()+"\n");
        }
		return name;
	
       
}

	public void LinkedHashMap() {
		
		
	}
}
