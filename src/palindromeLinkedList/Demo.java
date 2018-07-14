package palindromeLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

/**
 * 
 * @author reggie
 *
 */
public class Demo {

	/**
	 * Given a singly linked list, determine if it is a palindrome.
	 * 
	 * Input: 1->2->2->1 Output: true
	 * 
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
		ListNode newNode = head;
		Stack<Integer> stack = new Stack<>();
		while (newNode != null) {
			stack.push(newNode.val);
			newNode = newNode.next;
		}
		ListNode list = head;
		while (list != null) {
			if (list.val == stack.pop()) {
				list = list.next;
			} else {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		// node.next=new ListNode(1);
		node.next = new ListNode(2);
		// node.next.next.next=new ListNode(1);

		Demo demo = new Demo();

		System.out.println(demo.isPalindrome(node));
	}
}
