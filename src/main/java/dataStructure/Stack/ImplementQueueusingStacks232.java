package dataStructure.Stack;

import java.util.Stack;

public class ImplementQueueusingStacks232 {
    class MyQueue {
        private Stack<Integer> res;
        private Stack<Integer> resHelper;
        public MyQueue() {
            this.res = new Stack<Integer>();
            this.resHelper = new Stack<Integer>();

        }

        public void push(int x) {
            this.res.push(x);
        }

        public int pop() {
            if(this.resHelper.empty()){
                while(!this.res.empty()){
                    this.resHelper.push(this.res.pop());
                }
                return this.resHelper.pop();
            } else {
                return this.resHelper.pop();
            }
        }

        public int peek() {
            if(this.resHelper.empty()){
                while(!this.res.empty()){
                    this.resHelper.push(this.res.pop());
                }
            }
            return this.resHelper.peek();
        }

        public boolean empty() {
            return this.res.empty() && this.resHelper.empty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
