package grp3;

public abstract class AbsClass {
	int z;
	public abstract void paymentMethod();
	public int accBalance() {
		return 1000;
	}
	public void genReceipt() {
		System.out.println("reciept");
	}
	public int sum(int x,int y) {
		return x+y;
	}
}
