package hackerearth;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int[] array=new int[num];
for(int i=1;i<num-1;i++) {
	array[i]=i;
	System.out.println(array[i]);
}
	}

}
