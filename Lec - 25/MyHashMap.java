package grp3;

import java.util.*;

public class MyHashMap <K,V> {
	public class Node{
		K key;
		V value;
		Node next;
		
		Node(){
			
		}
		Node(K key, V value){
			this.key=key;
			this.value=value;
		}
	}
	
	private ArrayList<Node> bucketArr;
	private int size=0;
	
	MyHashMap(int x){
		bucketArr=new ArrayList<>();
		for(int i=0; i<x; i++) {
			bucketArr.add(null);
		}
	}
	MyHashMap(){
		this(4);
	}
	public void put(K key, V value) {
		int bt = hashFunction(key);
		Node temp = this.bucketArr.get(bt);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.value=value;
				return;
			}
			temp=temp.next;
		}
		Node nn = new Node(key,value);
		nn.next=this.bucketArr.get(bt);
		this.bucketArr.set(bt, nn);
		this.size++;
		double lf = (1.0*this.size)/this.bucketArr.size();
		double thf=2.0;
		if(lf>thf)
			reHashing();
	}
	public void reHashing() {
		ArrayList<Node> nba = new ArrayList<>();
		for(int i=0; i<this.bucketArr.size()*2; i++) {
			nba.add(null);
		}
		ArrayList<Node> temp = this.bucketArr;
		this.bucketArr=nba;
		for(Node n: temp) {
			while(n!=null) {
				put(n.key,n.value);
				n=n.next;
			}
		}
	}
	public V get(K key) {
		int bt = hashFunction(key);
		Node temp = this.bucketArr.get(bt);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
	public boolean containsKey(K key) {
		int bt = hashFunction(key);
		Node temp = this.bucketArr.get(bt);
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public V remove(K key) {
		int bt = hashFunction(key);
		Node curr = this.bucketArr.get(bt);
		Node prev=null;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		if(curr==null)
			return null;
		if(prev==null) {
			this.bucketArr.set(bt, curr.next);
			curr.next=null;
		}
		else {
			prev.next=curr.next;
			curr.next=null;
		}
		this.size--;
		return curr.value;
	}
	@Override 
	public String toString() {
		String s ="{";
		for(Node n: this.bucketArr) {
			while(n!=null) {
				s+=n.key+"="+n.value+", ";
				n=n.next;
			}
		}
		s+="}";
		return s;
	}
	public int hashFunction(K key) {
		int bt = key.hashCode() % this.bucketArr.size();
		if(bt<0)
			bt+=this.bucketArr.size();
		return bt;
	}
}
