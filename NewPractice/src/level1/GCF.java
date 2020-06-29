package level1;

import java.util.Scanner;

public class GCF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println(gcf(num1,num2));
	}

	private static int gcf(int num1, int num2) {
		int gcf=0;
		int min=Math.min(num1, num2);
		for(int i=min;i>=1;i--) {
			if(num1%i==0 && num2%i==0) {
			gcf=i;	
			break;
			}
		}
	return gcf;	
	}

}
