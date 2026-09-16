/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 import java.util.Stack;
class Solution {
    public ListNode removeNodes(ListNode head) {
if(head.next==null){
    return head;
}

ListNode t=head;
int arr[]=new int[100000];
int c=0;


while(t!=null){

arr[c]=t.val;
t=t.next;
c++;

}

Stack<Integer> kk=new Stack<>();
int res[]=new int[c];



for(int i=0;i<c;i++){

    if(kk.isEmpty()){
      
    
        kk.push(arr[i]);

    }

    else if(arr[i]>kk.peek()){

        while(!kk.isEmpty()&&arr[i]>kk.peek()){
            kk.pop();
        }

        kk.push(arr[i]);
    
   
    }

    else{
     

 
            kk.push(arr[i]);
        
    }



}




int l=kk.size()-1;
int m=l;


while(!kk.isEmpty()){
    res[l]=kk.pop();
    l--;
}




ListNode h=new ListNode(res[0]);
ListNode t2=h;

for(int i=1;i<=m;i++){
    ListNode f=new ListNode(res[i]);

    t2.next=f;
    t2=t2.next;
}


return h;








        
    }
}