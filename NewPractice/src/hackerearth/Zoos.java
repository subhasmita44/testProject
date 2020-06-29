package hackerearth;

import java.util.Scanner;

public class Zoos {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String name=sc.nextLine();
int len=name.length();
char[] chr=name.toCharArray();
for(int i=0;i<len;i++) {
	if(chr[i]=='z') {
		x++;
	}
	if(chr[i]=='o') {
		y++;
	}
}
if(x*2==y) {
	System.out.println("Yes");
}else{
	System.out.println("No");
}
	}

}
