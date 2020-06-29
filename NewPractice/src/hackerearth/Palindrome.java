package hackerearth;

import java.util.Scanner;

public class Palindrome {
static void step1(String word) {
	String reverse="";
	for(int i=word.length()-1;i>=0;i--) {
		reverse=reverse+word.charAt(i);
	}
	if(word.equals(reverse)) {
		System.out.println("YES");
	}else {
		System.out.println("NO");

	}
}
static void step2(String word) {
	if(word.charAt(0)==word.charAt(word.length()-1)) {
		
		System.out.println("YES");
	}else {
		System.out.println("NO");

	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String word=sc.nextLine();
		step1(word);
		step2(word);
	}

}
