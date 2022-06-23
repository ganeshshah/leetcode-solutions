class MyQueue {
    
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<Integer>();
         stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        while(!stack2.empty())
        {
             stack1.push(stack2.peek());
             stack2.pop();
        }
        stack2.push(x);
        while(!stack1.empty())
        {
            stack2.push(stack1.peek());
            stack1.pop();
        }
      
    }
    
    public int pop() {
        int x = stack2.peek();
        stack2.pop();
        return x;
    }
    
    public int peek() {
        return stack2.peek();
    }
    
    public boolean empty() {
        if(stack2.empty())
            return true;
        return false;
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