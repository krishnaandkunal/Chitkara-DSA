package grp3;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class bubbleSortLL {
	public static ListNode sortList(ListNode head) {
        int n = lengthLL(head);
        for(int i=0; i<n-1; i++){
            ListNode curr=head;
            ListNode prev=null;
            while(curr.next!=null){
                if(curr.val>curr.next.val){
                    if(prev==null){
                        ListNode next= curr.next;
                        curr.next=next.next;
                        next.next=curr;
                        prev=next;
                        head=prev;
                    }
                    else{
                        ListNode next= curr.next;
                        curr.next=next.next;
                        next.next=curr;
                        prev.next=next;
                        prev=next;
                    }
                }
                else{
                    prev=curr;
                    curr=curr.next;
                }
            }
        }
        return head;
    }
	
    public static int lengthLL(ListNode head){
        int n=0;
        while(head!=null){
            n++;
            head=head.next;
        }
        return n;
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
	      head=sortList(head);
	      display(head);
	    }
}
