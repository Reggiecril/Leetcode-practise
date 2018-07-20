package minStack;

import java.util.LinkedList;

public class Demo {
  	class Node{
        int val; 
        int min;
        Node(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    LinkedList<Node> list;
    /** initialize your data structure here. */
    public Demo() {
        list=new LinkedList<Node>();
    }
    
    public void push(int x) {
        int min=x;
        if(!list.isEmpty())
        {
            if(getMin()<x)
               min=getMin(); 
        }    
        list.addFirst(new Node(x,min));
    }
    
    public void pop() {
        list.removeFirst();
    }
    
    public int top() {
        return list.getFirst().val;
    }
    
    public int getMin() {
       return list.getFirst().min;
    }
}
