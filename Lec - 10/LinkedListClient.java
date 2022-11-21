package grp3;

public class LinkedListClient{
	  public static void main(String[] args) throws Exception{
	    LinkedList obj = new LinkedList();
	    obj.addFirst(5);
	    obj.addFirst(10);
	    obj.addFirst(15);
	    obj.addLast(20);
	    obj.addLast(30);
	    //int x = obj.getFirst();
	    obj.addIndex(50,0);
	    obj.addIndex(70,3);
	    obj.display();
	    }
	}
