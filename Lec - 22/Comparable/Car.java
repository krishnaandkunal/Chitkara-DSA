package grp15;

public class Car implements Comparable<Car>{
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
	
	public int compareTo(Car o) {
		 return this.color.compareTo(o.color);
		 //return o.price - this.price;
		 // return this.speed-o.speed;
	}
}
