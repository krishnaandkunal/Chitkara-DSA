package grp3;

import java.util.Scanner;

public class kthRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z=search(n);
		System.out.println(z);
	}

	public static int search(int n) {
		int l=1;
		int h=n;
		int ans=0;
		while(l<=h) {
			int mid=(l+h)/2;
			if(mid*mid<=n) {
				ans=mid;
				l=mid+1;
			}
			else {
				h=mid-1;
			}
		}
		return ans;
	}

}
