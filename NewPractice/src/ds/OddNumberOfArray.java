package ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OddNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,2,4};
		//int counter=0;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer irt:arr) {
			Integer count=map.get(irt);
			map.put(irt, (count==null) ?1:count+1);			
		}
		
		for(Map.Entry m:map.entrySet()) {
			//System.out.println(m.getKey()+","+m.getValue());
			int inter=(int) m.getValue();
			if((inter)%2!=0) {
				
				System.out.println(m.getKey());
			}
		}
		/*
		 * ArrayList<Integer> array=new ArrayList<Integer>(); for(int
		 * i=0;i<arr.length;i++) { array.add(arr[i]); } Set<Integer> uniqueSet = new
		 * HashSet<Integer>(array); for (Integer temp : uniqueSet) {
		 * System.out.println(temp + ": " + Collections.frequency(array, temp)); if() }
		 */
		}

}
