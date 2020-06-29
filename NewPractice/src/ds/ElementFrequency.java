package ds;

import java.util.HashMap;

public class ElementFrequency {

	public static void main(String[] args) {
		int element=0;
int[] arr= {1,2,4,2,2,2,4,3,3,2,2,2,2};
int counter=0;
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
for(int i=0;i<arr.length;i++) {
	if(hm.containsKey(arr[i])) {
		counter++;
		if(counter>arr.length/2) {
			element=arr[i];
			System.out.println(element);
			break;
			//System.out.println(counter);
		}
	}else {
		hm.put(arr[i], counter);
	}
}
}

}
