package implementQueueUsingStack;

import java.util.Stack;

public class Demo {
    private Stack<Integer> stack;
    /** Initialize your data structure here. */
    public Demo() {
        this.stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> back=new Stack<>();
        while(!stack.isEmpty()){
            back.push(stack.pop());
        }
        stack.push(x);
        while(!back.isEmpty()){
            stack.push(back.pop());
        }

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
