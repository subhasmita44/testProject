package level2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]=new int[50];
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter size of number");
int num=sc.nextInt();
for(int i=0;i<num;i++) {
arr[i]=sc.nextInt();
}
System.out.println("enter search number");
int j = sc.nextInt();
for(int i=0; i<num; i++) {
	//System.out.println(arr[i]);
	
	if(arr[i] == j) {
		System.out.println(i);	
	}
}
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == j) {
			System.out.println(arr[i] +"present at "+ i);
			break;
		}
	}
}

}
