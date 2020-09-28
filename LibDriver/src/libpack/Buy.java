package libpack;

import java.util.Scanner;

public class Buy {
	public void buy() {
		Books bs = new Books();

		Scanner sc =new Scanner(System.in);
		int s = 0;

		System.out.println("Enter the bookno. for purchase");
		s =sc.nextInt();
		switch(s) {
		case 1:
			System.out.println("Price is $50");
			break;
		case 2:
			System.out.println("Price is $80");
			break;
		case 3:
			System.out.println("Price is $75");
			break;
			default: 
				System.out.println("invalid entry");
		}

	}
}
