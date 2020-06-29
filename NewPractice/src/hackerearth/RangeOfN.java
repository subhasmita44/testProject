package hackerearth;

import java.util.Scanner;

public class RangeOfN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two integer");
Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();
    
        // Write here the logic to print all integers between L and R
        int big=0;
        int small=0;
        
        if(L<R && L>=1 && R<=100){
          small=L;
          big=R;
        }else if(R<L&& L>=1  && R<=100){
          small=R;
          big=L;   
        }
        for(int i=small;i<=big;i++){
            System.out.print(i + " ");
        }
	}}    
            
