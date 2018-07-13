package addTwoNumbers;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	ListNode(int x, ListNode next) {
		val = x;
		next = next;
	}
}

public class Demo {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode tail = dummyHead;
		int count = 0;
		while (l1 != null || l2 != null || count != 0) {
			int sum = count;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			if (sum >= 10)
				count = 1;
			else
				count = 0;
			tail.next = new ListNode(sum % 10);
			tail = tail.next;

		}
		return dummyHead.next;
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode cur = demo.addTwoNumbers(l1, l2);
		while (cur.next != null) {
			System.out.println(cur.val);
			cur = cur.next;
		}
	}

}