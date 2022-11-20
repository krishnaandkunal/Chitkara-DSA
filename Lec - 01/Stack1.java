package grp3;

public class Stack1 {
	int [] data;
	int top=0;
	Stack1(){
		data=new int[5];
	}
	Stack1(int x) {
		data=new int[x];
	}
	boolean isFull() {
		return top==data.length;
	}
	boolean isEmpty() {
		return top==0;
	}
	void push(int x) throws Exception{
		if(isFull()) {
			throw new Exception("stack full ho gya hai");
		}
		data[top]=x;
		top++;
	}
	int pop() throws Exception{
		if(isEmpty()){
			throw new Exception("stack khali hai");
		}
		top--;
		return data[top];
	}
	int peek() throws Exception{
		if(isEmpty()){
			throw new Exception("stack khali hai");
		}
		return data[top-1];
	}
	void display() {
		for(int i=0; i<top; i++) {
			System.out.print(data[i]+" ");
		}
	}
	
}
