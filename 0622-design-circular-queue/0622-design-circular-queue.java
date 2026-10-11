class MyCircularQueue {

    int s;
    ListNode head=null;
    ListNode t=head;
    int l=0;

    public MyCircularQueue(int k) {
   this.s=k;
        
    }
    
    public boolean enQueue(int value) {

        if(l<s){
            ListNode s=new ListNode(value);
            if(head==null){
                head=s;
                t=s;
            
            }
            else{
                t.next=s;
                t=t.next;
            }
            l++;
            return true;
        }


        return false;
 
    }
    
    public boolean deQueue() {

        if(l==0){
            return false;
        }

        if(head.next==null){
            head=null;
            t=null;
            l=0;

            return true;
        }

    head=head.next;
    l--;
    return true;
  
        
        
    }
    
    public int Front() {

        if(l==0){
            return -1;
        }

        return head.val;
    
        
    }
    
    public int Rear() {
        
        if(l==0){
            return -1;
        }
     
return t.val;
        
    }
    
    public boolean isEmpty() {
        if(l==0){
            return true;
        }
return false;
        
    }
    
    public boolean isFull() {

        if(l==s){
            return true;
        }
        return false;
 
}}

class ListNode{
    int val;
    ListNode next;

    ListNode(int v){
        val=v;
    }

    ListNode (int v,ListNode k){
        val=v;
        next=k;
    }
    ListNode(){

    }
   
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */