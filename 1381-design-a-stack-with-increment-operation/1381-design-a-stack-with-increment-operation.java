class CustomStack {

   int arr[];
   int top=0;
   int s=0;
    public CustomStack(int maxSize) {
      arr=new int[maxSize]; 

        
    }
    
    public void push(int x) {
        if(top==arr.length){

        }
        else{
            arr[top]=x;
            top++;
        }

       
    }
    
    public int pop() {

        if(top==0){
            return -1;
        }

top--;
      return arr[top];
        
    }
    
    public void increment(int k, int val) {

        if(k>=top){
            k=top;
        }
for(int i=0;i<k;i++){
    arr[i]=arr[i]+val;
}
 
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */