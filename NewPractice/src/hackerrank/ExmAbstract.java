package hackerrank;

import java.util.Scanner;

public class ExmAbstract {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter line");
		String title=sc.nextLine();
		MyBook bk=new MyBook();
		
		bk.setTitle(title);
		System.out.println(bk.getTitle());
		SubBook boo=new SubBook();
		boo.setTitle(title);
System.out.println(boo.getTitle());
	}

	


}
abstract class Book{
	String title;
	abstract void setTitle(String s);
	public String getTitle() {
	return title;	
	}
	
}
class SubBook extends Book{
	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		title=s;
	}
	
}
class MyBook{
	String title;
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
}