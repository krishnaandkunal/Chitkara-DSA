package grp15;

public class AvlTree{
	public class Node{
		int data,height;
		Node left,right;
		public Node(int x) {
			data=x;
			height=0;
		}
	}
	Node root;
	private int height(Node n) {
		if(n==null)
			return -1;
		return n.height;
	}
	public Node leftRot(Node n) {
		Node x = n.right;
		Node y = x.left;
		
		x.left=n;
		n.right=y;
		
		n.height=Math.max(height(n.left),height(n.right))+1;
		x.height=Math.max(height(x.left),height(x.right))+1;
		return x;
	}
	public Node rightRot(Node n) {
		Node x = n.left;
		Node y = x.right;
		
		x.right=n;
		n.left=y;
		
		n.height=Math.max(height(n.left),height(n.right))+1;
		x.height=Math.max(height(x.left),height(x.right))+1;
		return x;
	}
	public Node insert(Node n,int x) {
		if(n==null)
			return new Node(x);
		if(x<n.data)
			n.left=insert(n.left,x);
		else if(x>n.data)
			n.right=insert(n.right,x);
		
		n.height=1+Math.max(height(n.left),height(n.right));
		
		int b=height(n.left)-height(n.right);
		//left left case
		if(b>1 && x<n.left.data) {
			return rightRot(n);
		}
		//left right
		else if(b>1 && x>n.left.data) {
			n.left=leftRot(n.left);
			return rightRot(n);
		}
		//right right
		else if(b<-1 && x>n.right.data) {
			return leftRot(n);
		}
		//right left
		else if(b<-1 && x<n.right.data) {
			n.right=rightRot(n.right);
			return leftRot(n);
		}
		return n;
	}
	private void display(Node root) {
		if(root==null)
			return;
		String s = "<--"+root.data+"-->";
		if(root.left!=null)
			s=root.left.data+s;
		if(root.right!=null)
			s=s+root.right.data;
		System.out.println(s);
		display(root.left);
		display(root.right);
	}
	public int max(Node root){
        if(root.right==null)
            return root.data;
        return max(root.right);
    }
	public Node delete(Node root, int key) {
        if(root==null)
            return root;
        if(key<root.data)
            root.left=delete(root.left,key);
        else if(key>root.data)
            root.right=delete(root.right,key);
        else{
            //0 and 1 child
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            //2 child
            else{
                int x = max(root.left);
                root.data=x;
                root.left=delete(root.left,x);
            }
        }
        root.height=Math.max(height(root.left), height(root.right))+1;
        
        int b = height(root.left)-height(root.right);
        
        //left left case
        if(b>1 && bal(root.left)>=0) {
        	return rightRot(root);
        }
        //left right case
        else if(b>1 && bal(root.left)<0) {
        	root.left=leftRot(root.left);
        	return rightRot(root);
        }
        // right right
        else if(b<-1 && bal(root.right)<=0) {
        	return leftRot(root);
        }
        //right left case
        else if(b<-1 && bal(root.right)>0) {
        	root.right=rightRot(root.right);
        	return leftRot(root);
        }
        return root;
	}
	public int bal(Node n) {
		if(n==null)
			return 0;
		return height(n.left)-height(n.right);
	}
	public static void main(String[] args) {
		Bank_client obj = new Bank_client();
		AvlTree t = new AvlTree();
		t.root=t.insert(t.root, 13);
		t.root=t.insert(t.root, 10);
		t.root=t.insert(t.root, 15);
		t.root=t.insert(t.root, 11);
		t.root=t.insert(t.root, 16);
		t.root=t.insert(t.root, 5);
		t.root=t.insert(t.root, 4);
		t.display(t.root);
		t.root=t.delete(t.root,11);
		t.display(t.root);
	}

}

