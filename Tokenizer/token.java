package Tokenizer;

import java.util.StringTokenizer;

public class token {

	public static void main(String[] args) {
		 StringTokenizer st = new StringTokenizer("This sentence was horizontal"," ");  
		 while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken());  
	     }  
		

	}

}
