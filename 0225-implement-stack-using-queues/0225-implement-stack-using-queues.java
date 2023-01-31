class MyStack {
Queue<Integer> q= new LinkedList<Integer>();// This is using single Queue
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);//we are adding a value to the queue
        int size=q.size();// finding the size of it
        while(size>1){// if size>1 
            q.add(q.remove());// we are adding into the the queue by removing first inserted element we are placing in the last
            size--;// for that decrement the size of array do this process until size<1
        }
        /* [1,2,3] --> 
        step-1 : removing 1 
        step-2 : Adding at the end of queue i.e is [ 2,3,1]
        [3,1,2]
        step-3: reduce the size*/
    }
    
    public int pop() {
       int top= q.remove();
        return top;
        
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */