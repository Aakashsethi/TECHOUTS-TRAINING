package String;

public class string_driver {

	public static void main(String[] args) {
	//Different ways to create String object using new operator
	String s1 = new String("This will");
	String s2 = new String("overriden");
	//Or using Double quotes
	s1= "\tThis is called::";
	s2= "\tconcatination of two strings ";
	
	String s3 = s1.concat(s2);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s3.length());
	// string to char array
	char[] c =s3.toCharArray();
	System.out.println(c);

	}

}
