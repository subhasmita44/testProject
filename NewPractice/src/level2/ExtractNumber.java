package level2;

import java.util.Scanner;

public class ExtractNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in)	;
	
	String text=sc.nextLine();
	String num=text.replaceAll("[^0-9]", "");
	System.out.println(num);
	}

}
