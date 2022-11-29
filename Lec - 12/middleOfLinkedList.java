package grp3;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class middleOfLinkedList {
	public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
	public static void display(ListNode head) {
		  while(head!=null) {
			  System.out.print(head.val+"-->");
			  head=head.next;
		  }
	  }
	public static void main(String[] args){
	      ListNode head = new ListNode(4);
	      head.next = new ListNode(2);
	      head.next.next = new ListNode(5);
	      head.next.next.next = new ListNode(1);
	      head.next.next.next.next = new ListNode(3);
	      display(head);
	      System.out.println();
	      ListNode mid=middleNode(head);
	      System.out.println(mid.val);
	    }
}
