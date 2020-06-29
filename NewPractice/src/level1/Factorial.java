package level1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int newValue=1;
		System.out.println("enter Number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		for(int i=1;i<=input;i++) {
			newValue=newValue*i;
			System.out.println(newValue);
		}
	}

}
