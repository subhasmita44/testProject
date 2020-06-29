package level2;

import java.util.Scanner;

public class IntegerTable {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	for(int i=2;i<=10;i++) {
		System.out.println(num*i);
	}
	
	}

}
