package conumerinterface;
import conumerinterface.Ques25;

import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Arrays;


public class Myclass {

	public static void main(String[] args) {
		Ques25 Obj = new Ques25();
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1;i<11;i++) {
			intList.add(i);
		}
		System.out.println("Displaying 1-10 from list\n"+intList);
		try
		{
			System.out.println("Displaying 1-10 using consumer interface");
			Obj.dispList.accept(intList);
			System.out.println("\nDisplaying doubling of 1-10 using consumer interface");
			Obj.multiply2.accept(intList);
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	

	}

}
