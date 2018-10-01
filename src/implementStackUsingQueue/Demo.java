package implementStackUsingQueue;

import java.util.LinkedList;

/**
 * @author reggie
 *
 *
 * Implement the following operations of a stack using queues.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * Example:
 *
 * MyStack stack = new MyStack();
 *
 * stack.push(1);
 * stack.push(2);
 * stack.top();   // returns 2
 * stack.pop();   // returns 2
 * stack.empty(); // returns false
 * Notes:
 *
 * You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 */
public class Demo {
    private LinkedList<Integer> list;
    private int size;
    /** Initialize your data structure here. */
    public Demo() {
        list=new LinkedList<Integer>();
        size=0;

    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
        size++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        size--;
        return list.removeLast();
    }

    /** Get the top element. */
    public int top() {
        return list.peekLast();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}
