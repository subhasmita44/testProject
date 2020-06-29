package level2;

import java.util.Scanner;

public class UseDifferentCharacter {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text Here........");
		String text=sc.nextLine();
		
		text=text.toUpperCase();
		System.out.println(text);
		int count=text.length();
		System.out.println(count);
	
		for( ch='A';ch<='Z';ch++) {
		//System.out.println(ch);
			for(int i=0;i<text.length();i++) {
				if(ch==text.charAt(i)) {
					System.out.println(ch+"");
					count++;
					break;
				}
			}
		}	

	}

}
