package grp3;

import java.util.Stack;

public class stackReverseNoSpace {
	static void reverse(Stack<Integer> st){
		if(st.isEmpty()) {
			return;
		}
		int x=st.pop();
		reverse(st);
		bottom(st,x);
	}
	static void bottom(Stack<Integer> st, int x) {
		if(st.isEmpty()) {
			st.push(x);
			return;
		}
		int y=st.pop();
		bottom(st,x);
		st.push(y);
		
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		reverse(st);
		System.out.println(st);
		
	
	}

}
