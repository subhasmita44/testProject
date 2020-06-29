package level1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle");
		int pi=sc.nextInt();
		System.out.println("Enter Rate");
		int rate=sc.nextInt();
		System.out.println("Enter year");
		int time=sc.nextInt();
		int simpleInterest=(pi*rate*time)/100;
		System.out.println(simpleInterest);
	}

}
