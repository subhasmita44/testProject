package hackerrank;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	  
	   System.out.println("Enter num"); 
	   int num=sc.nextInt();
	   int []arr=new int[num];
	   for(int i=0;i<arr.length;i++) {
		   arr[i]=sc.nextInt();
		   
	   }
	   for(int i=0;i<arr.length;i++) {
		   for(int j=i;j<=arr.length;j++) {
			   for(int k=i;k<j;k++) {
				   System.out.print(arr[k] +" ");
			   }
			   System.out.println(" ");
		   }
	   }
	   
	}

}
