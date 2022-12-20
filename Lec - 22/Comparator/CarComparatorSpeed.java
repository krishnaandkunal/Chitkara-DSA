package grp15;

import java.util.Comparator;

public class CarComparatorSpeed implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o1.speed-o2.speed;
	}

}
