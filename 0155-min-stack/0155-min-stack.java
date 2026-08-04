import java.util.Stack;
class MinStack {
    Stack<Integer> main=new Stack<>();
    Stack<Integer> min=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(main.isEmpty()){
            main.push(value);
            min.push(value);
        }
        else{
            main.push(value);
            if(min.peek()<value){
                min.push(min.peek());
            }
            else{
                min.push(value);
            }
        }
        
    }
    
    public void pop() {
        main.pop();
        min.pop();
        
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
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