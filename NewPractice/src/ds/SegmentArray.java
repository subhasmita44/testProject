package ds;

public class SegmentArray {

	public static void main(String[] args) {
		int count=0;
		
		// TODO Auto-generated method stub
int[] arr= {0,1,0,1,1,0};
for(int i=0;i<arr.length;i++) {
	if(arr[i]==0) {
		count++;
	}
}
for(int i=0;i<arr.length;i++) {
	if(i<count) {
		arr[i]=0;
		//System.out.println(arr[i]);
	}else {
		arr[i]=1;
		//System.out.println(arr[i]);
	}
	System.out.println(arr[i]);
}

	}

}
