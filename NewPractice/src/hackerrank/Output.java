package hackerrank;

import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<num;i++) {
	String str=sc.next();
	int numb=sc.nextInt();
	System.out.printf("%-15s%03d%n",str,numb);
}
	}

}
