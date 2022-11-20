package grp3;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A= {5,9,1,3,4,8,7};
		int ans[] = mergeSort(A,0,A.length-1);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] mergeSort(int[] a, int l, int h) {
		if(l==h) {
			int[] x=new int[1];
			x[0]=a[l];
			return x;
		}
		int mid=(l+h)/2;
		int[] N1 = mergeSort(a,l,mid);
		int[] N2 = mergeSort(a,mid+1,h);
		
		return merge(N1,N2);
	}

	public static int[] merge(int[] a, int[] b) {
		int n=a.length;
		int m=b.length;
		
		int c[] = new int[n+m];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<n && j<m) {
			if(a[i]<=b[j]) {
				c[k]=a[i];
				k++;
				i++;
			}
			else {
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<n) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<m) {
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}

}
