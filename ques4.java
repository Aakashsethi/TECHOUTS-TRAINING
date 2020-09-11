import java.util.Scanner;
public class ques4 {

	public static void main(String[] args) 
	{
		int base,power;
		 Scanner console = new Scanner(System.in);
		 {
			System.out.print("Enter the base number ");
			base = console.nextInt();//This number should be typed in console        
			System.out.print("Enter the power ");
			power = console.nextInt();//This number should be typed in console
		 }
		  int result=1;
			for (int i=0; i<power; i++) 
			{
		    	result=result*base;
		    }
			System.out.print(result);
	}

}
