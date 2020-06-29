package level1;

import java.util.Scanner;

public class SwapTwoNumber {
int fNum,sNum,swap;
	public static void main(String[] args) {
		System.out.println("Enter Two Number");
		Scanner sc=new Scanner(System.in);
		int firstNum=sc.nextInt();
		int secondNum=sc.nextInt();
		swap(firstNum,secondNum);
		/*
		 * int swap=firstNum; firstNum=secondNum; secondNum=swap;
		 * System.out.println("After Swapping"+"\n"+"FirstNumber= "+
		 * firstNum+"\n"+"SecondNumber= "+secondNum);
		 */
	}

	private static void swap(int firstNum, int secondNum) {
		int thirdNumber=0;
		thirdNumber=firstNum;
		firstNum=secondNum;
		secondNum=thirdNumber;
		//thirdNumber=firstNum;
		System.out.println("firstnumber="+firstNum+" & "+"Secondnumber="+secondNum);
		
	}

}
