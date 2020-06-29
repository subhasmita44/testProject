package hackerearth;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitString {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter word");
String s=sc.nextLine();
sc.close();
String s2="[ !,?.\\\\_'@]+";
StringTokenizer token=new StringTokenizer(s,s2);
System.out.println(token.countTokens());
String s1=s.replaceAll("^\\s+","");
String[] str=s1.split("[ !,?.\\\\\\\\_'@]+");
int  len=str.length;
for(int i=0;i<len;i++) {
	System.out.println(str[i]);
}
	}

}
