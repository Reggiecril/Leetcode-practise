package linkedListCycle;

import java.util.Stack;

/**
 * 
 * @author reggie
 *
 */
public class Demo {

	/**
	 * Given a linked list, determine if it has a cycle in it.
	 * 
	 * 
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		ListNode list = new ListNode(1);
		System.out.println(demo.hasCycle(list));
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}