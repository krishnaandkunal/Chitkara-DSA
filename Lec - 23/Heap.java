package grp15;

import java.util.*;

public class Heap {
	private ArrayList<Integer> hp = new ArrayList<>();
	
	public void add(int x) {
		this.hp.add(x);
		upheapify(this.hp.size()-1);
	}

	public void upheapify(int i) {
		int p = (i-1)/2;
		if(p<0)
			return;
		if(this.hp.get(p)>this.hp.get(i)) {
			swap(p,i);
			upheapify(p);
		}
	}

	public void swap(int p, int i) {
		int x = this.hp.get(p);
		int y = this.hp.get(i);
		
		this.hp.set(p, y);
		this.hp.set(i, x);
	}
	
	public int remove() {
		swap(0,this.hp.size()-1);
		int x = this.hp.remove(this.hp.size()-1);
		downHeapify(0);
		return x;
	}

	public void downHeapify(int p) {
		int l = 2*p+1;
		int r = 2*p+2;
		
		int min=p;
		if(l<this.hp.size() && this.hp.get(l)<this.hp.get(min))
			min=l;
		if(r<this.hp.size() && this.hp.get(r)<this.hp.get(min))
			min=r;
		
		if(min!=p) {
			swap(min,p);
			downHeapify(min);
		}
	}
	public void display() {
		System.out.println(this.hp);
	}
	
}
