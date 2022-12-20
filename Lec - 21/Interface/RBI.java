package grp3;

public interface RBI {
	default void rupayCard() {
		System.out.println("hello");
		int a=15;
		int b=20;
		abc(a,b);
		abc(a,b);
	}
	private void abc(int a, int b) {
		System.out.println("hi");
	}
	public abstract int getBalance();
	public abstract void addAmount();
	public abstract void sendMoney();
	public abstract void openFd();
}
