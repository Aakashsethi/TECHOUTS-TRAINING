
import java.util.ArrayList;
import java.util.function.Consumer;

class myClass {
	Consumer<ArrayList<Integer>> threeseven = (x) -> {
        for(int num: x) {
            if (!(num > 3 && num < 7)) 
            {System.out.println(num);}
    } };

public static class MyDriver {

	public static void main(String[] args) {
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		myClass m = new myClass();
		for(int i=1;i<=10;i++) 
		{  numlist.add(i);}
		m.threeseven.accept(numlist);

	}

}
}
