import java.util.Scanner;


public class ques3 {

	public static void main(String[] args) {
		try (Scanner myInput = new Scanner( System.in )) {
			System.out.println("Enter the marks");
			int marks = myInput.nextInt();
			if (marks>50) 
			{
				System.out.print("PASS");
			}
			else if (marks<=50)
			{
				System.out.print("FAIL");
				
			}
			
			} 
			
			

	}

}
