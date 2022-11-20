package grp3;

public class DynamicQueue extends Queue1{
	void enqueue(int x) throws Exception{
		if(isFull()) {
			int [] arr = new int[2*data.length];
			for(int i=0; i<data.length; i++) {
				arr[i]=data[(front+i)%data.length];
			}
			front=0;
			data=arr;
			super.enqueue(x);
		}
	}
}
