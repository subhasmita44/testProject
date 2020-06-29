package hackerrank;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter N value");
	int N=sc.nextInt();	
	for(int i=1;i<=10;i++) {
		   System.out.printf("%d * %d = %d%n", N , i ,N*i);
	}

	}

}
