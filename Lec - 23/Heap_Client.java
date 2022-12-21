package grp15;

public class Heap_Client {

	public static void main(String[] args) {
		Heap obj = new Heap();
		obj.add(10);
		obj.add(22);
		obj.add(20);
		obj.add(25);
		obj.add(30);
		obj.add(23);
		obj.add(24);
		obj.add(27);
		obj.display();
		obj.add(17);
		//obj.display();
		obj.remove();
		obj.display();
	}

}
