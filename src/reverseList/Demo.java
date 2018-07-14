package reverseList;

/**
 * 
 * @author reggie
 *
 */
public class Demo {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/**
	 * Input: 1->2->3->4->5->NULL Output: 5->4->3->2->1->NULL
	 * 
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		ListNode newNode = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = newNode;
			newNode = head;
			head = next;
		}
		return newNode;
	}
}
