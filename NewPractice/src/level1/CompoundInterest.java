package level1;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		 double Principal_Amount = 0.0;
	        double Interest_Rate = 0.0;
	        double Time_Period = 0.0;
	        double CompoundInterest = 0.0;
	       
	        Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the Principal Amount : ");
	      Principal_Amount=sc.nextDouble();
	        System.out.println("Enter the Interest_Rate");
	        Interest_Rate=sc.nextDouble();
	        System.out.println("Enter the Time_Period");
	        Time_Period=sc.nextDouble();
	      
	        CompoundInterest=Principal_Amount*Math.pow((1+Interest_Rate/100),Time_Period);
	     System.out.println("CompoundInterest="+CompoundInterest);


	}

}
