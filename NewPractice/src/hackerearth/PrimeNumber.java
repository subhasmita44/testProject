package hackerearth;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean check;
		for (int i = 2; i <= N; i++) {
		check = false;
		for(int j=2; j <= Math.sqrt(i); j++) {
		if(i%j == 0) {
		check = true;
		break ;
		}
		}
		if (check == false) {
		System.out.print(i+" ");
		}
		}
		

	}

}
