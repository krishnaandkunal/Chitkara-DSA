package grp3;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		int [] arr = {2,6,5,7,3,1,4};
		System.out.println(Arrays.toString(arr));
		//buubleSort(arr);
		//selectionSort(arr);
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {
		
		
	}

	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int min=i;
			for(int j=i; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}	
	}

	public static void buubleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}	
	}
}
