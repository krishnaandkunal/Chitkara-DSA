package grp3;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeSortLL {
	public static ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode mid = middleNode(head);
        ListNode headB=mid.next;
        mid.next=null;
        
        ListNode A=sortList(head);
        ListNode B=sortList(headB);
        
        return mergeTwoLists(A,B);
    }
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode head = null;
        ListNode tail = null;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                if(head!=null){
                    tail.next=list1;
                    tail=list1;
                    list1=list1.next;
                }
                else{
                    head=list1;
                    tail=list1;
                    list1=list1.next;
                }
            }
            else{
                if(head!=null){
                    tail.next=list2;
                    tail=list2;
                    list2=list2.next;
                }
                else{
                    head=list2;
                    tail=list2;
                    list2=list2.next;
                }
            }
        }
        if(list1==null){
            tail.next=list2;
        }
        if(list2==null){
            tail.next=list1;
        }
        return head;
    }
	public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
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
	      //head.next.next.next.next = new ListNode(3);
	      display(head);
	      System.out.println();
	      head=sortList(head);
	      display(head);
	    }
}
