package level2;

import java.util.Random;
import java.util.Scanner;

public class FindRandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Random rand=new Random();
	for(int i=1;i<=10;i++) {
		System.out.println(rand.nextInt(num));
	}
	}

}
