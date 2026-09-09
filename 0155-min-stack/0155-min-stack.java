import java.util.Stack;
class MinStack {
    Stack<Integer> main=new Stack<>();
    Stack<Integer> min=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
    main.push(value);

    if(min.isEmpty()){
        min.push(value);
    }
    else{
        if(min.peek()<value){
            min.push(min.peek());
        }
        else{
            min.push(value);
        }
    }
        
    }
    
    public void pop() {
       min.pop();
       main.pop();
        
    }
    
    public int top() {
        return main.peek();
     
    }
    
    public int getMin() {
   if(min.isEmpty()){
    return -1;
   }

   return min.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */