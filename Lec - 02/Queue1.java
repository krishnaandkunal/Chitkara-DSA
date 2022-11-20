package grp3;

public class Queue1 {
	int [] data;
	int front=0;
	int size=0;
	
	Queue1(){
		data=new int[5];
	}
	Queue1(int x) {
		data=new int[x];
	}
	boolean isEmpty() {
		return size==0;
	}
	boolean isFull() {
		return size==data.length;
	}
	void enqueue(int x) throws Exception{
		if(isFull()) {
			throw new Exception("Queue full ho gyi hai");
		}
		data[(size+front)%data.length]=x;
		size++;
	}
	int dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue khali hai");
		}
		int x=data[front];
		front=(front+1)%data.length;
		size--;
		return x;
	}
	void display() {
		for(int i=0; i<size; i++) {
			System.out.print(data[(front+i)%data.length]+" ");
		}
	}
}
