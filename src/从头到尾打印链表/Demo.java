package 从头到尾打印链表;

import java.util.ArrayList;


/**
 * 
 * @author reggie
 *
 */
public class Demo {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	       ListNode head = new ListNode(0);
			head.next=listNode;
			ArrayList<Integer> list = new ArrayList<>();
			while (head.next != null) {
				ListNode cur=head;
				ListNode pre = head.next;
				while (pre.next != null) {
					cur=cur.next;
					pre = pre.next;
				}

				list.add(pre.val);
				cur.next = null;
			}
			return list;
	    }
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	ListNode(ListNode next, int x) {
		this.val = val;
		this.next = next;
	}

}
