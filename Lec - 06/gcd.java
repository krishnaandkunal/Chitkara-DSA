package grp3;
import java.util.*;
public class gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int dividend = Math.max(a, b);
		int divisor = Math.min(a, b);
		while(dividend % divisor!=0) {
			int rem=dividend%divisor;
			dividend=divisor;
			divisor=rem;
			
		}
		System.out.println(divisor);
	}

}
