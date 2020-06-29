package hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Num");
	int num=Integer.parseInt(sc.nextLine());
	while(num>0) {
		String partern=sc.nextLine();
		try {
			Pattern.compile(partern);
			System.out.println("Valid");
		}catch (PatternSyntaxException e) {
			e.printStackTrace();
			System.out.println("Invalid");
			// TODO: handle exception
		}
		num--;
	}

	}

}
