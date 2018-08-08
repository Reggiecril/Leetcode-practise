package mergeKSortedLists;

import java.util.PriorityQueue;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * @param lists
	 * @return
	 */
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0 || lists == null)
			return null;

		PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (o1, o2) -> o1.val - o2.val);

		for (ListNode l : lists)
			if (l != null)
				pq.add(l);
		ListNode dummyHead = new ListNode(-1);
		ListNode head = dummyHead;
		while (!pq.isEmpty()) {

			head.next = pq.poll();
			head = head.next;

			if (head.next != null)
				pq.add(head.next);
		}
		return dummyHead.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
