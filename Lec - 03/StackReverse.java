package grp3;
import java.util.*;
public class StackReverse {
	static void printReverse(Stack<Integer> s) {
		if(s.isEmpty()){
			return;
		}
		int x= s.pop();
		printReverse(s);
		System.out.println(x);
		s.push(x);
	}
	static void copy(Stack<Integer> s, Stack<Integer> s1) {
		if(s.isEmpty()){
			return;
		}
		int x= s.pop();
		copy(s,s1);
		s1.push(x);
	}
	static void recReverse(Stack<Integer> st, Stack<Integer> st1) {
		while(!st1.isEmpty()) {
			st.push(st1.pop());
		}
	}
	static void itReverse(Stack<Integer> s) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		while(!s.isEmpty()) {
			s1.push(s.pop());
		}
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		while(!s2.isEmpty()) {
			s.push(s2.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);
		//Stack<Integer> st1= new Stack<>();
		//copy(st,st1);
		//recReverse(st,st1);
		itReverse(st);
		System.out.println(st);
		
		//System.out.println(st1);
	}
}
