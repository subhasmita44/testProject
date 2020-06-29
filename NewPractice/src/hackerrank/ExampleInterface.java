package hackerrank;

import java.util.Scanner;

interface AdvancedArithmetic{
	int divisor_sum(int num);
}
class MyCalculator  {

	
	
}
public class ExampleInterface {

	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();	

	}

	private static void ImplementedInterfaceNames(MyCalculator my_calculator) {
		// TODO Auto-generated method stub
		
	}

}
