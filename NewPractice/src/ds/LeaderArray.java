package ds;

public class LeaderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {15,16,3,1,2,6,4};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[j]>arr[i]) {
			break;
		}
		if(j==arr.length-1) {
			System.out.println(arr[i]);
		}
	}
}
System.out.println(arr[arr.length-1]);
	
	}

}
