package onlyarray;

import java.util.Scanner;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int arr[]=new int[50];
		int num;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total value");
		int value=sc.nextInt();
		System.out.println("enter no. of value");
		for(int i=0;i<value;i++) {
		arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<value;i++) {
			for(int j=i+1;j<value;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				//System.out.println(arr[i]+"and"+arr[j]);
			}
			
		
		}

		System.out.println("Largest two number"+arr[value-1]+"and"+arr[value-2]);

		System.out.println("Smallest number"+arr[0]);
		
	}

}
