class Complex { 
  
    int a, b; 
  
    public Complex(int a, int b) { 
        this.a = a; 
        this.b = b; 
    } 
  
    // Overriding equals() to compare two Complex objects 
    @Override
    public boolean equals(Object o) { 
  
        // If the object is compared with itself then return true   
        if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Complex)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Complex c = (Complex) o; 
          
        // Compare the data members and return accordingly  
        return Double.compare(a, c.a) == 0
                && Double.compare(b, c.b) == 0; 
    } 
} 
  
// Driver class to test the Complex class 
public class Equalex { 
  
    public static void main(String[] args) { 
        Complex c1 = new Complex(10, 15); 
        Complex c2 = new Complex(10, 15); 
        System.out.println("When we use ==  the output is");
        if (c1 == c2) { 
            System.out.println("Equal "); 
        } else { 
            System.out.println("Not Equal "); 
        } 
        System.out.println("When we use equals()  the output is");
        if (c1.equals(c2)) { 
            System.out.println("Equal "); 
        } else { 
            System.out.println("Not Equal "); 
        } 
    } 
} 