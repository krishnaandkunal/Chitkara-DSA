package grp3;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int z=search(arr,x);
		System.out.println(z);

	}

	public static int search(int[] arr, int x) {
		int l=0;
		int h=arr.length-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(arr[mid]==x) {
				return mid;
			}
			else if(x>arr[mid]) {
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return -1;
	}

}
