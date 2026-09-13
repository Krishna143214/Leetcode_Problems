class CustomStack {

 int arr[];
 int k=0;
    public CustomStack(int maxSize) {
      arr=new int[maxSize]; 

        
    }
    
    public void push(int x) {

        if(k>=arr.length){

        }
        else{
            arr[k]=x;
            k++;
        }
     

       
    }
    
    public int pop() {
        if(k==0){
            return -1;
        }
int a=arr[k-1];
k--;
        return a;

        
    }
    
    public void increment(int kk, int val) {

if(kk>=arr.length){
    for(int i=0;i<k;i++){
        arr[i]=arr[i]+val;
    }
}
else{
      for(int i=0;i<kk;i++){
        arr[i]=arr[i]+val;
    }
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