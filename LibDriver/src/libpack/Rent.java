package libpack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rent extends Books {
public void rent_list() {
	Books bs = new Books();

	Scanner sc =new Scanner(System.in);
	int s = 0;

	System.out.println("Enter the bookno. for rent");
	s =sc.nextInt();
	switch(s) {
	case 1:
		System.out.println("rent is $4");
		break;
	case 2:
		System.out.println("rent is $2");
		break;
	case 3:
		System.out.println("rent is $3");
		break;
		default: 
			System.out.println("invalid entry");
	}
	
	
}
}
