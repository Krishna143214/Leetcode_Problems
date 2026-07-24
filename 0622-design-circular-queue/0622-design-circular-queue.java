class MyCircularQueue {

    int s;
    ListNode head=null;
    ListNode t=head;
    int l=0;

    public MyCircularQueue(int k) {
        this.s=k;
        
    }
    
    public boolean enQueue(int value) {
        if(l==s){
            return false;
        }

        else if(head==null){
            ListNode f=new ListNode(value);
            head=f;
            t=head;
            l++;
            return true;
        }
        
            ListNode a=new ListNode(value);
            t.next=a;
            t=t.next;
            l++;
            return true;  
    }
    
    public boolean deQueue() {
        if(l==0){
            return false;
        }
        else if(l==1){
            head=null;
            t=null;
            l--;
            return true; 
        }

       head=head.next;
       l--;
       return true;
        
        
    }
    
    public int Front() {
        if(head==null){
            return -1;
        }
        return head.val;
        
    }
    
    public int Rear() {
         if(head==null){
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
        
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(){}
    ListNode(int a){
        val=a;
    }
    ListNode(int a,ListNode b){
        val=a;
        next=b;
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