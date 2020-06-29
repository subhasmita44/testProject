package hackerearth;

import java.util.Scanner;

public class SeatArrangement {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter number");
		  int t=sc.nextInt();
		  for(int i=0;i<t;i++)
		  {
			  System.out.println("enter number");
		  int n=sc.nextInt();
		  int r6=n%6;
		  String seat;

		  if(r6==0 || r6==1)
		  seat="WS";
		  else if(r6==2 || r6==5)
		  seat="MS";
		  else
		  seat="AS";

		  int r12=n%12;
		  if(r12==0)
		  r12=12;
		  int x,y;
		  x=13-r12;
		  y=x-r12;
		  int nextSeat=n+y;
		  System.out.println(nextSeat+" "+seat);
		  }

	}

}
