package 包含min函数的栈;
import java.util.Stack;
import java.util.LinkedList;
public class Solution {
    private Stack<Integer> stack=new Stack<>();
    private LinkedList<Integer> list=new LinkedList<>();
    private int min;
    public void push(int node) {
        if(stack.isEmpty()){
            min=node;
            list.push(node);
        }else
        {
            if(list.peek()>=node)
            { min=node;
                list.push(node);
            }   
                
        }
        stack.push(node);
    }
    
    public void pop() {
    	int number=stack.pop();
        if(number==list.peek())
        {    list.remove();
             min=list.peek();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return min;
    }
    public static void main(String []args) {
    	Solution s=new Solution();
    	s.push(3);s.push(4);s.push(3);s.push(2);
    	s.pop();
    	System.out.println(s.min);
    	
    }
}