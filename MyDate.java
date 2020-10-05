package datetime;
import datetime.Dateq;
import java.time.LocalDate;
import java.time.format.*;
import java.util.Scanner;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		Dateq d = new Dateq();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssZ");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
String today = LocalDate.now().format(format2);
		
		System.out.println(" method checks if input date is earlier to present date. ");
		String d1 = s.next();
		
		System.out.println(d.checkEarlier(d1));
		
		System.out.println(" method checks if input date is after to present date.");
		String d2 = s.next();
		
		System.out.println(d.checkAfter(d2));
		
	}

}
