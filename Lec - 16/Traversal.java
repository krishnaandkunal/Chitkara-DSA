package grp15;

import java.util.*;

public class Traversal {
	public class Node{
		int data;
		Node left;
		Node right;
	}
	Scanner sc = new Scanner(System.in);
	private Node root;
	Traversal(){
		this.root=createTree();
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
	public void preOrder() {
		preOrder(this.root);	
	}
	private void preOrder(Node n) {
		if(n==null)
			return;
		System.out.print(n.data+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrder() {
		postOrder(this.root);	
	}
	private void postOrder(Node n) {
		if(n==null)
			return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.data+" ");
	}
	public void inOrder() {
		inOrder(this.root);	
	}
	private void inOrder(Node n) {
		if(n==null)
			return;
		inOrder(n.left);
		System.out.print(n.data+" ");
		inOrder(n.right);
	}
	public void levelOrder() {
		levelOrder(this.root);	
	}
	private void levelOrder(Node n) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(n);
		while(!queue.isEmpty()) {
			Node temp = queue.remove();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)
				queue.add(temp.right);
		}
	}
	public static void main(String[] args) {
		Traversal t = new Traversal();
		t.levelOrder();
	}
	

}
