package hackerrank;

import java.util.*;
import java.text.*;

public class CurrencyFormatter {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	Locale f=Locale.FRANCE;
	Locale c=Locale.CHINESE;
	 
	Locale u=Locale.US;
	Locale loc = new Locale("en", "in"); // This will display currency with "Rs." symbol.


	NumberFormat lu=NumberFormat.getCurrencyInstance(u);
	NumberFormat li = NumberFormat.getCurrencyInstance(loc);
	NumberFormat lc=NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
	NumberFormat lf=NumberFormat.getCurrencyInstance(f);
	        // Write your code here.
	        
	        System.out.println("US: " + lu.format(payment));
	        System.out.println("India: " + li.format(payment));
	       System.out.println("China: " +lc.format(payment));
	        System.out.println("France: " + lf.format(payment));
	    }

}
