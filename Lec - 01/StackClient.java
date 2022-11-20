package grp3;

public class StackClient {

	public static void main(String[] args)throws Exception {
		Stack1 obj = new Stack1();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		System.out.println(obj.pop());
		obj.push(50);
		System.out.println(obj.peek());
		obj.push(60);
		obj.push(70);
	}

}
