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
    public ListNode swapNodes(ListNode head, int k) {

        if(head==null||head.next==null){
            return head;
        }

        ListNode t=head;


        int c=0;

        while(t!=null){
            c++;
            t=t.next;
        }



        int pos=c-k+1;   



        ListNode t2=head;

        int kk=1;

        while(kk<k){
            t2=t2.next;
            kk++;
        } 


        ListNode t3=head;

        int j=1;

        while(j<pos){
            t3=t3.next;
            j++;
        } 


        int temp=t2.val;

        t2.val=t3.val;
        t3.val=temp;


        return head;    
    }
}