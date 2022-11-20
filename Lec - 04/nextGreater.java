package grp3;
import java.util.*;
public class nextGreater {
	public static int[] nextGrt(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] nge = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				int x = st.pop();
				 nge[x]=arr[i];
			}
			st.push(i);
		}
		while(!st.isEmpty()) {
			int x = st.pop();
			 nge[x]=-1;
		}
		return nge;
	}
	public static void main(String[] args) {
		int [] arr = {2,5,7,6,3,7};
		int [] ans = nextGrt(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" "+ans[i]);
		}
	}

}
