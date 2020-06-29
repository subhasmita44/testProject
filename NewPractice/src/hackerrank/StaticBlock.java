package hackerrank;

import java.util.Scanner;

public class StaticBlock {

	static boolean flag=true;
	




	public static void main(String[] args){
	
			   Scanner in = new Scanner(System.in);
			   int n = in .nextInt();
			  //String s=???; Complete this line below

			   //Write your code here
			  // Scanner sc = new Scanner(System.in);
			String s=in.nextLine();
			   in.close();
			   if (n == Integer.parseInt(s)) {
			    System.out.println("Good job");
			   } else {
			    System.out.println("Wrong answer.");
			   }
	}

}
