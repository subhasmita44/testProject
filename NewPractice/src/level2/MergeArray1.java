package level2;

import java.util.Scanner;

public class MergeArray1 {
static int i,j,k;
	public static void main(String[] args) {
	int arr[]=new int[50];
	int arr1[]=new int[50];
	int merge[]=new int[100];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first array size");
		int num=sc.nextInt();
		for( i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter second array size");
			int num1=sc1.nextInt();
			for( j=0;j<num1;j++) {
				arr1[j]=sc1.nextInt();
			}
		int size=num1+num;
		for(i=0;i<num;i++) {
			merge[i]=arr[i];
		}
	
		for(j=0,k=num;k<size && j<num1;j++,k++) {
			merge[k]=arr1[j];
			
		}
		for(k=0;k<size;k++) {
		System.out.println(merge[k]);
		}
		
	}

}
