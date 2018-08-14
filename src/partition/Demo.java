package partition;

/**
 *
 */
public class Demo {
    /**
     * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
     *
     * You should preserve the original relative order of the nodes in each of the two partitions.
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        ListNode dummyHead1=new ListNode(0);

        ListNode dummyHead2=new ListNode(0);
        ListNode cur1=dummyHead1;

        ListNode cur2=dummyHead2;
        while(head!=null){
            if(head.val<x){
                cur1.next=head;
                cur1=cur1.next;
            }else{
                cur2.next=head;
                cur2=cur2.next;
            }
            head=head.next;
        }
        cur2.next=null;
        cur1.next=dummyHead2.next;
        return dummyHead1.next;
    }
      private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
