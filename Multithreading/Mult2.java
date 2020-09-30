package Multithreading;

public class Mult2 extends multit {

	public void Mult2() {
		System.out.println("Thread creation by extending thread class");
		//StringBuffer
		StringBuffer s = new StringBuffer("StringBuffer( ) reserves room for 16 characters without reallocation.");
		int p = s.length(); 
        int q = s.capacity(); 
        s.reverse();
        System.out.println("Length of string StringBuffer=" + p); 
        System.out.println("Capacity of string StringBuffer=" + q); 
        System.out.println("Reverse of string StringBuffer=" + s); 
	}
	

}
