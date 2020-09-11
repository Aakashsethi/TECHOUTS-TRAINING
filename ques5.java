import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {

			int n, rev = 0;

			Scanner console = new Scanner(System.in);
			{
				System.out.print("Enter the number ");
				n = console.nextInt();
				
	        while(n != 0) {
	            int digit = n % 10;
	            rev = rev * 10 + digit;
	            n /= 10;
	        }

	        System.out.println("Reversed Number: " + rev);
	        }

	}

}
