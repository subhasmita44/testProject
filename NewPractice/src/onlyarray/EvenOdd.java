package onlyarray;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
int arr[]=new int[20];
int arreven[]=new int[20];
int arrodd[]=new int[20];
int count=0;
int count1=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter total value");
int value=sc.nextInt();
System.out.println("enter no. of value");
for(int i=0;i<value;i++) {
arr[i]=sc.nextInt();

}
for(int i=0;i<value;i++) {
	if(arr[i]%2==0) {
	arreven[i]=arr[i];
		count++;
	}else {
		arrodd[i]=arr[i];
		count1++;
	}
}
System.out.println("even number");
//System.out.println(arreven.length);
for(int i=0;i<count;i++) {
	System.out.println(arreven[i]);
}
System.out.println("odd number");
for(int i=0;i<count1;i++) {
	System.out.println(arrodd[i]);
}

	}

}










