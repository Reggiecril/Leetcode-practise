package removeDuplicatesFromSortedList;

public class Demo {
	
	  //Definition for singly-linked list.
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	    public ListNode deleteDuplicates(ListNode head) {
	    	//prevent null pointer
	        if(head==null||head.next==null)
	            return head;
	        
	        ListNode pre=head;
	        ListNode cur=pre.next;
	        //loop to end
	        while(cur!=null){
	        	//when this.node == next.node
	            if(cur.val==pre.val){
	            	//skip the duplications
	                pre.next=cur.next;
	                cur=cur.next;
	            }else{  
	            	//when it is different
	            	//to next loop
	                pre=cur;
	                cur=cur.next;
	            }
	        }
	        return head;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
