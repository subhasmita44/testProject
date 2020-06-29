package level1;

import java.util.Scanner;

public class LarestofThreeNumber {

	public static void main(String[] args) {
		System.out.println("Enter Three Number");
	Scanner sc=new Scanner(System.in);
	int fNum=sc.nextInt();
	int sNum=sc.nextInt();
	int tNum=sc.nextInt();
	if(fNum>sNum && fNum>tNum) {
		System.out.println("Gretest Number= "+fNum);
	}else if(sNum>fNum && sNum>tNum) {
		System.out.println("Gretest Number= "+sNum);
	}else if(tNum>fNum && tNum>sNum) {
		System.out.println("Gretest Number= "+tNum);
	}else {
		System.out.println("Gretest Number= "+" Invalid Input");
	}



	}

}
