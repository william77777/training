package app;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class UsePrintfInsteadOfPrintln {
	public static void main(String[] args) {
		// ordering
		System.out.printf("%2$s %1$s\n","arg1","arg2");
		
		// precision
		System.out.printf("%.2f\n",0.55555555555555555d);
		
		// time
		System.out.printf("Current time: %tT\t",Calendar.getInstance());
		
		System.out.printf("Current date is %1$tm %1$te, %1$tY\n",new GregorianCalendar(Locale.US));
		
		System.out.printf("%1$.3s\n","Too many characters");
		
		System.out.printf("%s %s! %f %f.2$\n","Hello","World",0.5,0.5555);
	}
}
