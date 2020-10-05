package singleclas;



class SingleClass{
	private static SingleClass single_instance = null; 
	
	public String a;
	
	// private constructor restricted to this class itself 
	private SingleClass() 
    	{ 
        	a = "will always be pointing towards a"; 
    	} 
	//static method that has return type object of this single class.
	//1/2 step of creating a single class
	public static SingleClass getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new SingleClass(); 
  
        return single_instance; 
    } 

}


public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // instantiating Singleton class with variable b
						// instantiating Singleton class with variable b
						SingleClass b = SingleClass.getInstance();
						
						 
						// instantiating Singleton class with variable c
						 SingleClass c = SingleClass.getInstance();
						
						 b.a = (b.a).toUpperCase(); 
						// instantiating Singleton class with variable c
						
						 System.out.println("String from b is " + b.a); 
						
						 // instantiating Singleton class with variable c
						 
						 System.out.println("String from c is " + c.a); 
						
						
	}

}
