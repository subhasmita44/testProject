package level1;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First number");

	int num1=sc.nextInt();
	System.out.println("Enter Second number");
	int num2=sc.nextInt();
	System.out.println(	 gcd(num1,num2));
		

	}

	private static int gcd(int num1, int num2) {
		/*
		 * int i=num1%num2; while(i!=0) { num1=num2; num2=i; i=num1%num2; }
		 */
		
	if(num2==0) {
		return num1;
	}
	return num1%num2;
	}

}
