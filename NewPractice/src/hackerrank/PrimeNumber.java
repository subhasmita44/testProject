package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc=new Scanner(System.in);
		BigInteger n=sc.nextBigInteger();
		sc.close();
		System.out.println(n.isProbablePrime(1)?"prime":"not prime");

	}

}
