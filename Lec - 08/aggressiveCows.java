package grp3;

import java.util.Arrays;
import java.util.Scanner;

public class aggressiveCows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] arr = new int[nos];
		for(int i=0; i<nos; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int l=0;
		int h=arr[nos-1]-arr[0];
		int ans=0;
		while(l<=h) {
			int mid=(l+h)/2;
			if(isPossible(arr,mid,noc)) {
				ans=mid;
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		System.out.println(ans);
	}

	public static boolean isPossible(int[] stall, int mid, int noc) {
		int c=1;
		int k=0;
		
		for(int i=1; i<stall.length; i++) {
			if(stall[i]-stall[k]>=mid) {
				c++;
				k=i;
			}
			if(c==noc) {
				return true;
			}
		}
		return false;
	}

}
