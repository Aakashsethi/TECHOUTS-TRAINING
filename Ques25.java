package conumerinterface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ques25 {
	
	
	
	Consumer<ArrayList<Integer>> multiply2 = list->list.forEach(a-> System.out.print(a*2+" "));
	

  	
	Consumer<ArrayList<Integer>> dispList = 
			list -> list.stream().forEach(a -> System.out.print(a + " ")); 


			
			
			
}