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
    public ListNode reverseBetween(ListNode head, int left, int right) {

if(head==null || head.next==null){
    return head;
}



ListNode p=null;

ListNode curr=head;

int i=1;

while(i<left){
    p=curr;
    curr=curr.next;
    i++;
}

ListNode curr2=head;

int j=1;

while(j<right){
    curr2=curr2.next;
    j++;
}

ListNode n=curr2.next;


int o=right-left+1;


ListNode prev=null;
ListNode c3=curr;
ListNode next=null;

int f=0;


while(f<o){
    next=c3.next;
    c3.next=prev;
    prev=c3;
    c3=next;
    f++;
}

if(left==1){
    head.next=n;
    head=prev;

    return head;

}


p.next=prev;
curr.next=n;

return head;








        
   
}}