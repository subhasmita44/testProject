package level2;
import java.util.Scanner;

public class PrimeNumber {

	
	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("enter num");
	       int num=scanner.nextInt();
	       for(int nem=2;nem<=num;nem++) {
	    	  //System.out.println(nem);
	    	   boolean isPrime=true;
	    	   for(int i=2;i<=nem/2;i++) {
	    		   if(nem%i==0) {
	    		   isPrime=false;
	    		   break;
	    		   }
	    	   }
	    	   if(isPrime==true) {
	    		   System.out.println(nem);  
	    	   }
	       }
	    }
}
