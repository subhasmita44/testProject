package hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RearrangeDesending {

	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String []s=new String[num+2];
		String []s1=new String[num];
		for(int i=0;i<num;i++) {
			s[i]=sc.next();
			s1[i]=s[i];
		}
sc.close();
Arrays.sort(s1,Collections.reverseOrder(new Comparator<String>() {
	@Override
	public int compare(String o1, String o2) {// TODO Auto-generated method stub
		BigDecimal a=new BigDecimal(o1);
		BigDecimal b=new BigDecimal(o2);
		
		return a.compareTo(b);
	}
}));
for(int i=0;i<num;i++)
{
    System.out.println(s1[i]);
}
	}

}
