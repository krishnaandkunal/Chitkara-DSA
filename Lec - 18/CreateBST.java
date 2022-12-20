package grp3;

public class CreateBST {
	public class Node{
		int data;
		Node left;
		Node right;
		public Node(int mid) {
			this.data=mid;
		}
	}
	private Node root;
	public void createTree(int[] arr) {
		this.root=createTree(arr,0,arr.length-1);
	}
	private Node createTree(int[] arr, int s, int e) {
		if(s>e)
			return null;
		int mid = (s+e)/2;
		Node n = new Node(mid);
		n.left=createTree(arr,s,mid-1);
		n.right=createTree(arr,mid+1,e);
		return n;
	}
	public static void main(String[] args) {
		int arr[] = {5,8,10,15,16,18,20,25};
		CreateBST t = new CreateBST();
		t.createTree(arr);
	}

}
