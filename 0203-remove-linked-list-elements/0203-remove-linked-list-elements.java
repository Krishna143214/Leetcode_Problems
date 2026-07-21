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
class Solution {
    public ListNode removeElements(ListNode head, int val) {

    if(head==null){
        return head;
    }

     int arr[]=new int[10000];
     int l=0;
 ListNode temp=head;
     while(temp!=null){

if(temp.val==val){
    
}
else{
    arr[l]=temp.val;
    l++;
}
temp=temp.next;
     }



     if(l==0){
        return null;
     }  



     ListNode h2=new ListNode(arr[0]);
     ListNode t2=h2;

     for(int i=1;i<l;i++){
        ListNode f=new ListNode(arr[i]);
        t2.next=f;
        t2=t2.next;
     }



     return h2;      
    }
}