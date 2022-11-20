package grp3;
import java.util.*;
public class distributeInCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		int n=sc.nextInt();
		int pos=sc.nextInt();
		
		int ans = pos+n-1;
		if(ans%size==0) {
			ans=size;
		}
		
		
	}

}
