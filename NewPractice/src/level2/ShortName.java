package level2;

import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of name...");
		count=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		String str[]=new String [count];
		for(int i=0;i<count;i++) {
			
		str[i]=sc1.nextLine();
		
		}
		sc.close();
		sc1.close();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(str[i].compareTo(str[j])>0) {
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for(int i=0;i<count;i++) {
			System.out.println(str[i]+",");
		}
	}

}
