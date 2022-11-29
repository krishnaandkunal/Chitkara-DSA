package grp3;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class cycleDetection {
	public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
                return true;
        }
        return false;
    }
	public static void createCycle(ListNode head) {
		ListNode tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=head.next;
	}
	public static void main(String[] args){
	      ListNode head = new ListNode(1);
	      head.next = new ListNode(2);
	      head.next.next = new ListNode(3);
	      head.next.next.next = new ListNode(4);
	      head.next.next.next.next = new ListNode(5);
	      head.next.next.next.next = new ListNode(6);
	      createCycle(head);
	      System.out.println(hasCycle(head));
	    }
}
