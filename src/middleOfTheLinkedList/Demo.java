package middleOfTheLinkedList;

import java.util.HashMap;

/**
 * 
 * @author reggie
 *
 */
public class Demo {

	/**
	 * Given a non-empty, singly linked list with head node head, return a middle
	 * node of linked list.
	 * 
	 * If there are two middle nodes, return the second middle node.
	 * 
	 * Input: [1,2,3,4,5] Output: Node 3 from this list (Serialization: [3,4,5]) The
	 * returned node has value 3. (The judge's serialization of this node is
	 * [3,4,5]). Note that we returned a ListNode object ans, such that: ans.val =
	 * 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
	 * 
	 * @param head
	 * @return
	 */
	public ListNode middleNode(ListNode head) {
		HashMap<Integer, ListNode> map = new HashMap<>();
		ListNode pre = head;
		int i = 0;
		while (pre != null) {

			map.put(i, pre);
			i++;
			pre = pre.next;
		}
		return map.get(i / 2);
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}