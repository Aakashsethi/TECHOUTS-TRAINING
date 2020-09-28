package libpack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Books  {

	public HashMap<String, HashMap<String, String>> list() {
		String Book_ID=null, name=null, Book_Description=null,B_rate=null;
		//Storing HashMap in a HashMap
		
		HashMap<String, String> map1 = new HashMap<String, String>(); 
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map3 = new HashMap<String, String>(); 
		HashMap<String, HashMap<String,String>> map = new HashMap<String, HashMap<String,String>>();
		
	    map1.put("Book ID ::", "02");
	    map1.put("Book name::", " The Zahir");
	    map1.put("Book Description::", "Psychological Fiction");
	    map1.put("Rating", "4/5");
	     
	     
	    map2.put("Book ID ::", "03");
	    map2.put("Book name::", "Elon Musk");
	    map2.put("Book Description::", "Biography");
	    map2.put("Rating", "3/5");
	     
	     
	    map3.put("Book ID ::", "04");
	    map3.put("Book name::", "Last train to Istanbul");
	    map3.put("Book Description::", "War story");
	    map3.put("Rating", "5/5");
	    
	    map.put("\nBook1",map1);
	    map.put("\nBook2",map2);
	    map.put("\nBook3",map3);
		
	   System.out.println(map);
	   return (map);

	}
}
