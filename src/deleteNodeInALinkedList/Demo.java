package deleteNodeInALinkedList;

/**
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * 
	 * Write a function to delete a node (except the tail) in a singly linked list,
	 * given only access to that node.
	 * 
	 * Given linked list -- head = [4,5,1,9], which looks like following:
	 * 
	 * 4 -> 5 -> 1 -> 9
	 * 
	 * stupid question
	 * 
	 * @param node
	 */
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
