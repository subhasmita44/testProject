package level2;

import java.util.Scanner;

public class NumberOfWord {

	public static void main(String[] args) {
		int count =0;
		Scanner sc=new Scanner(System.in);
	System.out.println("enter String");
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
			count++;
			
		}
	}
	System.out.println(count);
			
		
	}

}
