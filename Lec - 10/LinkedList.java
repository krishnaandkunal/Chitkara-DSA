package grp3;

public class LinkedList{
  Node head;
  Node tail;
  int size;
  public class Node {
    int data;
    Node next;
    
    Node(int x){
      data=x;
    }
  }
  			
  public void addFirst(int x){
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
  
  public void addLast(int x){
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
  public void addIndex (int x, int k)throws Exception{
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
  public int getFirst() throws Exception{
    if(size==0){
      throw new Exception("pgl Linked list khali hai");
    }
    return head.data;
  }
  
  public int getLast() throws Exception{
    if(size==0){
      throw new Exception("pgl Linked list khali hai");
    }
    return tail.data;
  }
  public int getAtIndex(int x)throws Exception{
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