package removeLinkedListElements;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Remove all elements from a linked list of integers that have value val.
	 * 
	 * Input: 1->2->6->3->4->5->6, val = 6 
	 * Output: 1->2->3->4->5
	 * 
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode removeElements(ListNode head, int val) {
//		ListNode list = new ListNode(0);
//		list.next = head;
//		if (head == null)
//			return head;
//		if (head.next == null && head.val == val)
//			return null;
//		ListNode pre = list;
//		ListNode cur = pre.next;
//
//		while (cur != null) {
//			if (cur.val == val) {
//				pre.next = cur.next;
//				cur = cur.next;
//			} else {
//				pre = cur;
//				cur = cur.next;
//			}
//		}
//		return list.next;
		if(head==null)
			return null;
		head.next=removeElements(head.next,val);
		if(head.val==val)
			return head.next;
		else
			return head;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		ListNode list = new ListNode(1);
		list.next=new ListNode(2);
		System.out.println(demo.removeElements(list, 1).val);
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
