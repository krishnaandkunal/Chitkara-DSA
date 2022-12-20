package grp15;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {

	public static void main(String[] args) {
		Car[] arr = new Car[5];
		
		arr[0]=new Car(1000,25,"White");
		arr[1]=new Car(2000,10,"Black");
		arr[2]=new Car(8500,15,"Red");
		arr[3]=new Car(6000,35,"Green");
		arr[4]=new Car(1500,30,"Purple");
		display(arr);
		System.out.println("**********************");
		sort(arr);
		display(arr);
	}
	public static void display(Car[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static <T extends Comparable<T>>void sort(T[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
