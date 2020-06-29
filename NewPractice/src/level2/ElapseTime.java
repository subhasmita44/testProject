package level2;

import java.util.Scanner;

public class ElapseTime {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		double elapseTime;
		startTime=System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		endTime=System.currentTimeMillis();
		elapseTime=(endTime-startTime)/1000.0;
		
		System.out.println(elapseTime);
	}

}
