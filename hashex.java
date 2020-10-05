package ques4;
//Properties is a subclass of Hashtable.
//It is used to maintain list of value in which the key is a string and the value is also a string. 
import java.util.Properties;

//Java program to demonstrate 
//hashCode() method.

public class hashex {

	public static void main(String[] args) {
	//Creating random properties 

		Properties properties = new Properties(); 
		  
        properties.put("name", "Aakash"); 
        properties.put("salary", 5000); 
        properties.put("id", 005); 
  
        // Print Properties details 
        System.out.println("Current Properties: "
                           + properties.toString()); 
  
        // Getting the hashCode value 
        System.out.println("HashCode: "
                           + properties.hashCode()); 
        
        
	}

}
