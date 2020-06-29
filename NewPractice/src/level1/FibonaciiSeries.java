package level1;

import java.util.Scanner;

public class FibonaciiSeries {
	 static int num1=0;
	static int num2=1;
	static int res=0;
	public static void main(String[] args) {
		int firstNum=0;
		int secondNum=1;
int swap=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		System.out.println(firstNum+"\n"+secondNum);
		fun(number-2);
		/*
		 * for(int i=0;i<=number;i++) { swap=firstNum+secondNum;
		 * 
		 * firstNum=secondNum; secondNum=swap; System.out.println(swap); }
		 */
		

	}

	private static void fun(int number) {
	
		if(number>0) {
			res=num1+num2;
			num1=num2;
			num2=res;
			System.out.println(res);
			fun(number-1);
		}
		
	}

}
