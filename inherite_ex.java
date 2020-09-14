//This code contains the example of //Polymorphism, inheritance, overloading, overiding, Type casting.
public class inherite_ex { 
	private int sum;

	//function overloading
    // Overloaded sum(). 
    // This sum takes two int parameters 
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
  
    // This sum takes three int parameters 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    // Overloaded sum(). 
    // This sum takes two double parameters 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    //new class defined for method overriding
 class add extends inherite_ex
{
	
	public int sum( int x, int y )
	
	{ 
		System.out.println("sum example for method overiding");
		return x+y;
	}
}
  
    // Driver code 
    public static void main(String args[]) 
    { 
        inherite_ex s = new inherite_ex();
        System.out.println(s.sum(5, 7)); 
        System.out.println(s.sum(33, 21, 30)); 
        
       //narrow type casting of double function into an integer function
     
        s.sum = (int) s.sum(3.5,7.8); 
        System.out.println(s.sum);
        
       //wide type casting of integr function into a double fuction
        inherite_ex d = new inherite_ex();
        double sum = (double) d.sum(4,5); 
        System.out.println(d.sum);
        
        add u=s.new add();
        System.out.println(u.sum(45, 45));
        
    } 
}