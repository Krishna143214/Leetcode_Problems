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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null||head.next==null){
            return null;
        }


int c=0;

ListNode t=head;

while(t!=null){
    t=t.next;
    c++;
}


if(n==c){
    return head.next;
}

 int pos=(c-n)+1;


 int j=1;

 ListNode prev=null;
 ListNode t2=head;

 while(j<pos){
prev=t2;
    t2=t2.next;
    j++;


 }


 prev.next=t2.next;



 return head;       
    }
}