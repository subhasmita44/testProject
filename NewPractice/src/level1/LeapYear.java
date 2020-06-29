package level1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Please Enter a number");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		if(num%400==0 && num%4==0 && num%100==0 ) {
			System.out.println(num+" is Leap Year");
		}else {
			System.out.println(num+" is not Leap Year");
		}

	}

}
