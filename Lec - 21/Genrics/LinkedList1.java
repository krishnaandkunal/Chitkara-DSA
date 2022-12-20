package grp3;

public class LinkedList1<krishna> {
	Node head;
	  Node tail;
	  int size;
	  public class Node {
		  krishna data;
	    Node next;
	    
	    Node(krishna x){
	      data=x;
	    }
	  }
	  			
	  public void addFirst(krishna x){
	    Node n = new Node(x);
	    if(size==0){
	      head=n;
	      tail=n;
	      size++;
	    }
	    else{
	      n.next=head;
	      head=n;
	      size++;
	    }
	  }
	  
	  public void addLast(krishna x){
	    Node n = new Node(x);
	    if(size==0){
	      addFirst(x);
	    }
	    else{
	      tail.next=n;
	      tail=n;
	      size++;
	    }
	  }
	  public void addIndex (krishna x, int k)throws Exception{
	    if(k==0){
	      addFirst(x);
	    }
	    else if(k==size){
	      addLast(x);
	    }
	    else{
	      Node n = new Node(x);
	      Node temp = getNode(k-1);
	      n.next=temp.next;
	      temp.next=n;
	      size++;
	    }
	  }
	  public krishna getFirst() throws Exception{
	    if(size==0){
	      throw new Exception("pgl Linked list khali hai");
	    }
	    return head.data;
	  }
	  
	  public krishna getLast() throws Exception{
	    if(size==0){
	      throw new Exception("pgl Linked list khali hai");
	    }
	    return tail.data;
	  }
	  public krishna getAtIndex(int x)throws Exception{
	    return getNode(x).data;
	  }
	  public Node getNode(int x) throws Exception{
	    if(x<0 || x>=size){
	      throw new Exception("pgl index range ke bahar hai");
	    }
	    else{
	      Node temp=head;
	      for(int i=0; i<x; i++){
	        temp=temp.next;
	      }
	      return temp;
	    } 
	  }
	  public krishna removeFirst() throws Exception {
		  if(size==0) {
			  throw new Exception("pgl linkedlist khali hai");
		  }
		  else {
			  Node temp=head;
			  head=head.next;
			  temp.next=null;
			  size--;
			  return temp.data;
			  
		  }
	  }
	  public krishna removeLast() throws Exception {
		  if(size==0) {
			  throw new Exception("pgl linkedlist khali hai");
		  }
		  else if(size==1) {
			  Node temp=head;
			  head=null;
			  size--;
			  return temp.data;
		  }
		  else {
			  Node temp = getNode(size-2);
			  temp.next=null;
			  Node n=tail;
			  tail=temp;
			  size--;
			  return n.data;
		  }
	  }
	  public krishna removeAtIndex(int k) throws Exception {
		  if(k<=0 || k>=size) {
			  throw new Exception("pgl index range ke bahar hai");
		  }
		  else {
			  Node temp = getNode(k-1);
			  Node n = temp.next;
			  temp.next=n.next;
			  n.next=null;
			  size--;
			  return n.data;
		  }
	  }
	  public void display() {
		  Node temp=head;
		  if(size!=0) {
			  for(int i=0; i<size; i++) {
				  System.out.print(temp.data+"-->");
				  temp=temp.next;
			  }
		  }
	  }
}
