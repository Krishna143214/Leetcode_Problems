class MyLinkedList {
    int c=0;
    ListNode head=null;

    ListNode temp=null;

    public MyLinkedList() {

        
    }
    
    public int get(int index) {
        if(index<0||index+1>c){
            return -1 ;
        }

      else{
       int f=1;
        ListNode t=head;

        while(f<index+1){
            t=t.next;
            f++;
        }

        return t.val;
      }
    

        
    }
    
    public void addAtHead(int val) {

        if(head==null){
            ListNode l=new ListNode(val);
            head=l;
            temp=l;
            c++;
        }

        else{
            ListNode s=new ListNode(val);
            s.next=head;
            head=s;
            c++;
        }

        
    }
    
    public void addAtTail(int val) {

        if(head==null){
            ListNode x=new ListNode(val);
            head=x;
            temp=x;
            c++;
        }

        else{
            ListNode m=new ListNode(val);
            temp.next=m;
            temp=temp.next;
            c++;
        }

        
    }
    
    public void addAtIndex(int index, int val) {

        if(index<=0){
            addAtHead(val);
        }
        else if(index>c){

        }
        else if(index==c){
            addAtTail(val);

        }
        else{
            ListNode x=new ListNode(val);
            ListNode f=head;
            int j=1;
            while(j<index){
                f=f.next;
                j++;
            }
            x.next=f.next;
            f.next=x;
     
           

            c++;
        }

        
    }
    
    public void deleteAtIndex(int index) {

        if(head==null||index<0||index>=c){

        }

        else if(index==0){
            head=head.next;
            c--;
            if(head==null){
                temp=null;
            }


        }
        else if(head.next==null){
            c--;
            head=null;
            temp=null;
        }


        else{
            ListNode prev=null;
            ListNode curr=head;

            int n=1;
            while(n<index+1){

                prev=curr;
                curr=curr.next;
                n++;
            } 

         if(curr.next==null){
            temp=prev;
         }
                 
            prev.next=curr.next;

            c--;
            
             }

        
    }
}

class ListNode{
    int val;
    ListNode next;

    ListNode(){

    }
    ListNode(int a){
        val=a;
    }

    ListNode(int a,ListNode b){
        val=a;
        next=b;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */