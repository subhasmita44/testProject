package level1;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		System.out.println("enter First number");
		Scanner sc=new Scanner(System.in);
	int firstNumber=sc.nextInt();
	System.out.println("enter Second number");
	int secondNumber=sc.nextInt();
	System.out.println("LCM ="+lcm(firstNumber,secondNumber));

	}

	private static int lcm(int firstNumber, int secondNumber) {
		 int max=0;
		 int min=0;
		int lcm=0;
		 int newk=0;
		if(firstNumber>secondNumber) {
			max=firstNumber;
			min=secondNumber;	
		}else {
			max=secondNumber;
			min=firstNumber;
		}
		for(int i=1;i<=min;i++) {
			//System.out.println(max);

			newk=max*i;
			if(newk%min==0) {
				break;
			}
		}
	//	System.out.println(newk);
		return newk; 
	}

}
