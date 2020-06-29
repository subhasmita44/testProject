import java.util.Arrays;
import java.util.Scanner;

public class NewTest {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter num");
int num =sc.nextInt();
long []arr1=new long[num];
long []arr2=new long[num];
long []arr3=new long[num];
System.out.println("enter arr1");
for(int i=0;i<arr1.length;i++ ) {
	arr1[i]=sc.nextInt();
}
System.out.println("enter arr2");
for(int i=0;i<arr2.length;i++ ) {
	arr2[i]=sc.nextInt();
}

	
		  for(int i=0;i<arr3.length;i++) {
			  arr3[i]=arr2[i]/arr1[i];
		
		  }
		
			  Arrays.sort(arr3);


		
		  
		  System.out.println(arr3[0]);
		  

	}

}
