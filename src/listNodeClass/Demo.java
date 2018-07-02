package listNodeClass;

/**
 * ListNode play
 * 
 * @author reggie
 *
 */
public class Demo {
	/**
	 * ListNode class
	 * 
	 * @author reggie
	 *
	 */
	class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	ListNode head = null;// head pointer

	/**
	 * add value to listnode
	 * 
	 * @param val
	 */
	public void addList(int val) {
		// transfer value to listnode
		ListNode node = new ListNode(val);
		// when head is null,this listnode is head
		if (head == null) {
			head = node;
			return;
		}
		//
		ListNode temp = head;
		// loop to last listnode
		while (temp.next != null) {
			temp = temp.next;
		}
		// add this node at last
		temp.next = node;
		return;
	}

	/**
	 * calculate length
	 * 
	 * @return
	 */
	public int length() {
		int length = 0;
		ListNode node = head;
		while (node != null) {
			length++;
			node = node.next;
		}

		return length;
	}

	/**
	 * print listnode
	 */
	public void printList() {
		ListNode node = head;
		while (node != null) {
			System.out.print(node.val+"->");
			node = node.next;
		}
	}

	/**
	 * delete by index
	 */
	public boolean deleteListNodeIndex(int index) {
		if(index < 0 ||index >length()) {
			return false;
		}
		if(index == 1) {
			head.next=null;
			return true;
		}
		ListNode pre=head;
	
		ListNode cur= pre.next;
		//loop time
		int i=1;
		//循环整个链表
		while(cur!=null) {
			//当到index时，将后面的节点移位到前面
			if(i==index) {
				pre.next=cur.next;
				return true;
			}
			//遍历链表直到index
			pre=cur;
			cur=cur.next;
			
			i++;
		}
		return true;
			
	}
	/**
	 * insert listnode by index
	 * @param index
	 * @param num
	 * @return
	 */
	public boolean insertListNodeIndex(int index,int num) {
		ListNode newNode=new ListNode(num);
		if(index<0 || index>length()+1) {
			return false;
		}
		ListNode pre=head;
		int i=0;
		while(pre.next!=null) {
			if(i==index) {
				newNode.next=pre.next;
				pre.next=newNode;
				return true;
			}
			pre=pre.next;
			i++;
		}
		return true;
	}
//	public boolean deleteListNode(ListNode node) {
//		if(node==null) {
//			return false;
//		}
//		
//	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.addList(0);
		demo.addList(2);
		demo.addList(3);
		demo.addList(4);
		demo.addList(6);
		System.out.println("Length:  " + demo.length());
		demo.printList();
		demo.deleteListNodeIndex(2);
		System.out.println();
		demo.printList();
		demo.insertListNodeIndex(1, 10);
		System.out.println();
		demo.printList();
	}

}
