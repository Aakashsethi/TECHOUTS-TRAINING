package thread;

public class MyClass extends Thread {
	  public static int amount = 0;

	  public static void main(String[] args) throws InterruptedException {
		  
	    MyClass thread = new MyClass();
	    thread.start();
	    
	    // Wait for the thread to finish
	    try{ 
	    		while(thread.isAlive()) 	{
	    
	    			System.out.println("Waiting...");
	    		
	    			}
	    	}
	    
	    catch(Exception e){
	    	
	    	thread.wait();
	    	
	    	
	    }
	    
	    
	  // Update amount and print its value
	  System.out.println("Main: " + amount);
	  
	  amount++;
	  // waiting for 4 seconds
	  Thread.sleep(4000);
	  
	  System.out.println("Main: " + amount);
	  }
	  public void run() {
	    System.out.println("hi");
	  }
	}