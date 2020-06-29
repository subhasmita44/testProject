package level1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter Two Number");
		Scanner sc=new Scanner(System.in);
		int firstNum=sc.nextInt();
		int secondNum=sc.nextInt();
		System.out.println("1 Addition"+"\n"+"2 Substraction"+"\n"+"3 Multiplication"+"\n"+"4 division"+"\n"+"5 modulus"+"\n"+"6 exit");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1:System.out.println("result= "+(firstNum + secondNum));
		break;
		case 2:System.out.println("result= "+(firstNum - secondNum));
		break;
		case 3:System.out.println("result= "+(firstNum * secondNum));
		break;
		case 4:System.out.println("result= "+(firstNum / secondNum));
		break;
		case 5:System.out.println("result= "+(firstNum % secondNum));
			break;
		case 6:System.out.println("Invalid choice");
		break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		
	}

}
