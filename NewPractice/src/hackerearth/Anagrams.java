package hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	
	public static void main(String args[])
	{
			Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		
	String s1=sc.next();
	String s2=sc.next();
	int len1=s1.length();
	int len2=s2.length();
	int sum=0;
	int arr[]=new int[26];
	for (int i = 0; i < len1; i++){
	arr[ s1.charAt(i) - 'a']--;
	//System.out.println(arr[s1.charAt(i) - 'a']--);
	}

			
			  for (int j = 0; j < len2; j++){
				  
				  arr[ s2.charAt(j) - 'a']--; 
				  
				  }
			 
			 for (int v = 0; v <26; v++){ sum += Math.abs(arr[v]); }
			 
			  System.out.println(sum);
			
	}
	}

}
