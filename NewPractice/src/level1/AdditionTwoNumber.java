package level1;

import java.util.Scanner;

public class AdditionTwoNumber {

	public static void main(String[] args) {
		System.out.println("Enter Two Number");
		Scanner sc=new Scanner(System.in);
		
		int firstNum=sc.nextInt();
		int secondNum=sc.nextInt();
		int thirdNum=0;
		thirdNum=firstNum+secondNum;
		System.out.println("result="+thirdNum);
	}

}
