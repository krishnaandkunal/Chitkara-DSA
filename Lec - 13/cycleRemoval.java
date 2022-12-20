package grp3;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class cycleRemoval {
	public static ListNode hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
                return slow;
        }
        return null;
    }
	public static void createCycle(ListNode head) {
		ListNode tail=head;
		while(tail.next!=null) {
			tail=tail.next;
		}
		tail.next=head.next.next;
	}
	public static void removeCycle(ListNode head) {
		ListNode m = hasCycle(head);
		ListNode temp = m;
		int count=1;
		while(temp.next!=m) {
			count++;
			temp=temp.next;
		}
		ListNode A=head;
		ListNode B=head;
		for(int i=0; i<count; i++) {
			B=B.next;
		}
		while(A.next!=B.next) {
			A=A.next;
			B=B.next;
		}
		B.next=null;
	}
	public static void main(String[] args){
	      ListNode head = new ListNode(1);
	      head.next = new ListNode(2);
	      head.next.next = new ListNode(3);
	      head.next.next.next = new ListNode(4);
	      head.next.next.next.next = new ListNode(5);
	      head.next.next.next.next.next = new ListNode(6);
	      head.next.next.next.next.next.next = new ListNode(7);
	      head.next.next.next.next.next.next.next = new ListNode(8);
	      createCycle(head);
	      System.out.println(hasCycle(head).val);
	      removeCycle(head);
	      System.out.println(hasCycle(head));
	    }
	
}
