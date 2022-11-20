package grp3;
import java.util.*;
public class primeFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primefct(n);
	}

	public static void primefct(int n) {
		int i=2;
		while(i<=n) {
			int x=0;
			while(n%i==0) {
				x=1;
				n=n/i;
			}
			if(x==1)
				System.out.print(i+" ");
			i++;
		}
		
	}
}
