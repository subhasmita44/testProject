package level2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		 int temp3;int temp=1;int temp2=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	for(int i=0;i<=num;i++) {
		temp3=temp+temp2;
		temp=temp2;
		temp2=temp3;
		System.out.println(temp3);
	}
	}

}
