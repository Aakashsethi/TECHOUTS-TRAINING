package datetime;

import java.time.LocalDate;

public class Dateq{
	LocalDate today = LocalDate.now();
	public boolean checkEarlier(String d1) {
		LocalDate input = LocalDate.parse(d1);
		if(input.isBefore(today)) {
			return true;
		}else {
			return false;
		}
	}
	public boolean checkAfter(String d2) {
		LocalDate input2 = LocalDate.parse(d2);
		if(input2.isAfter(today)) {
			return true;
		}else {
			return false;
		}
	}
	
}
