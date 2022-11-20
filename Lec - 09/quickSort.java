package grp3;

import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		int[] arr= {5,10,7,8,3,2};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr,int l, int h) {
		if(l>=h) {
			return;
		}
		int idx=partition(arr,l,h);
		quickSort(arr,l,idx-1);
		quickSort(arr,idx+1,h);
	}

	public static int partition(int[] arr, int l, int h) {
		int pivot=arr[h];
		int ans=l;
		for(int i=l; i<h; i++) {
			if(arr[i]<pivot) {
				int temp=arr[i];
				arr[i]=arr[ans];
				arr[ans]=temp;
				ans++;
			}
		}
		int temp=arr[ans];
		arr[ans]=arr[h];
		arr[h]=temp;
		return ans;
	}
	
}
