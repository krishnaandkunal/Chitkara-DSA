package grp15;

import java.util.Scanner;

public class BinaryTree {
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	Scanner sc = new Scanner(System.in);
	BinaryTree(){
		this.root = createTree();
	}
	public Node createTree(){
		int x = sc.nextInt();
		Node n = new Node();
		n.data=x;
		
		if(sc.nextBoolean()) {
			n.left=createTree();
		}
		if(sc.nextBoolean()) {
			n.right=createTree();
		}
		return n;
	}
	public void display() {
		display(this.root);
		
	}
	private void display(Node n) {
		if(n==null)
			return;
		String s = "<--"+n.data+"-->";
		if(n.left!=null)
			s=n.left.data+s;
		if(n.right!=null)
			s=s+n.right.data;
		System.out.println(s);
		display(n.left);
		display(n.right);
	}
	public boolean find(int x) {
		return find(this.root,x);
	}
	private boolean find(Node n, int x) {
		if(n==null)
			return false;
		if(n.data==x)
			return true;
		return find(n.left,x) || find(n.right,x);
	}
	public int max() {
		return max(this.root);
	}
	private int max(Node n) {
		if(n==null)
			return -1;
		int l=max(n.left);
		int r=max(n.right);
		return Math.max(n.data, Math.max(l, r));
	}
	public int height() {
		return height(this.root);
	}
	private int height(Node n) {
		if(n==null)
			return -1;
		int l=height(n.left);
		int r=height(n.right);
		return Math.max(l, r)+1;
	}
	
}
