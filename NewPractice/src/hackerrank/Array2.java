package hackerrank;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total Number");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		
		for(int j=0;j<n;j++) {
			int sum=0;
			for(int k=j;k<n;k++) {
				sum=arr[k]+sum;
				if(sum<0) {
					//sum=arr[k]+sum;
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
