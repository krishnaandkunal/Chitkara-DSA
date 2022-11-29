package grp3;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class merge2SortedLL {
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
	public static void display(ListNode head) {
		  while(head!=null) {
			  System.out.print(head.val+"-->");
			  head=head.next;
		  }
	  }
	public static void main(String[] args){
	      ListNode head1 = new ListNode(2);
	      head1.next = new ListNode(5);
	      head1.next.next = new ListNode(7);
	      head1.next.next.next = new ListNode(8);
	      
	      ListNode head2 = new ListNode(1);
	      head2.next = new ListNode(2);
	      head2.next.next = new ListNode(6);
	      display(head1);
	      System.out.println();
	      display(head2);
	      System.out.println();
	      ListNode ans=mergeTwoLists(head1,head2);
	      display(ans);
	    }
}
