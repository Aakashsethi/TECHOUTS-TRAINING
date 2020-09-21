package p1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

import p1.Details;

public class PublicInfo extends Details{

	public static void main(String[] args) 
	{
	String name;
	Details d = new Details();
	d.create();
	System.out.println("** Retrieving People Details From Hash Map **\n");
	System.out.println(d.name);

	 d.LinkedHashMap();
	}

}
