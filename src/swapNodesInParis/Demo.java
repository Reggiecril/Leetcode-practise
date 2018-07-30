package swapNodesInParis;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * Given a linked list, swap every two adjacent nodes and return its head.
	 * 
	 * Given 1->2->3->4, you should return the list as 2->1->4->3.
	 * 
	 * @param head
	 * @return
	 */
	public ListNode swapPairs(ListNode head) {
		ListNode dummyHead = new ListNode(0);
		dummyHead.next = head;
		ListNode pre = dummyHead;
		while (pre.next != null && pre.next.next != null) {
			ListNode first = pre.next;
			ListNode second = pre.next.next;
			first.next = second.next;
			second.next = first;
			pre.next = second;
			pre = pre.next.next;

		}
		return dummyHead.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}