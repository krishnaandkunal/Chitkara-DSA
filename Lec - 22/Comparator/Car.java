package grp15;

public class Car{
	int price;
	int speed;
	String color;
	
	Car(int p, int s, String col){
		price=p;
		speed=s;
		color=col;
	}
	public String toString() {
		return "P: "+this.price+"  S: "+this.speed+"  C: "+this.color;
	}
}
