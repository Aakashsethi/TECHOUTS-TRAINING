package sports;
import java.util.Scanner;

import sports.Badminton;
import sports.Football;
import sports.Box_cricket;
public  abstract class Driver {
	
	public abstract void Driver();

	public static void main(String[] args) {
	
		
		Badminton bad = new Badminton();
		Football ft = new Football();
		Box_cricket bc = new Box_cricket();
		int s;
        Scanner sc= new Scanner(System.in); 
        System.out.println("The List of Sports:\n1.Badminton\n2.Football\n3.Box Cricket.\nSelect one number out of the three");
		s = sc.nextInt();
		switch(s)
		{
		case 1: {
			     System.out.println("BADMINTON\n");
			     bad.Driver();
		        }
		          break;
		          
		case 2: {
			System.out.println("FOOTBALL\n");
			ft.Driver();
		}
                  break;  
                  
		case 3: {
			System.out.println("BOX CRICKET");
			bc.Driver();
		}
                  break;    
                  
        default: System.out.println("error!");          
		}
	}

}
