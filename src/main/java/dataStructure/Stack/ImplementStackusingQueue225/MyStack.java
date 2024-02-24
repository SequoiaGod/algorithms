package dataStructure.Stack.ImplementStackusingQueue225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> store;
    public MyStack() {
        this.store = new LinkedList<Integer>();
    }

    public void push(int x) {
        this.store.add(x);
        for(int i = 0; i < this.store.size() -1; i++) {
            this.store.add(this.store.remove());
        }
    }

    public int pop() {
        return this.store.remove();
    }

    public int top() {

        return this.store.peek();
    }

    public boolean empty() {
        return this.store.isEmpty();
    }

}