package hackerearth;

import java.util.Scanner;

public class AddArrayElement {

	public static void main(String[] args) {
	System.out.println("Enter value");
	Scanner sc =new Scanner(System.in);
	
int N=sc.nextInt();
int[] array1=new int[N];
int[] array2=new int[N];
int[] sumArray=new int[N];
System.out.println("Enter value1");
for(int i=0;i<N;i++) {
	array1[i]=sc.nextInt();
	
}
System.out.println("Enter value2");
for(int i=0;i<N;i++) {
	array2[i]=sc.nextInt();
	
}
for(int i=0;i<N;i++) {
	sumArray[i]=array1[i]+array2[i];
	
}
for(int i=0;i<N;i++) {
System.out.println(sumArray[i]+" ");
	
}
}

}
