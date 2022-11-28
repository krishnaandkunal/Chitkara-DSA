package grp3;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class reverseItretive {
	public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
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
	      head=reverseList(head);
	      display(head);
	    }
}
