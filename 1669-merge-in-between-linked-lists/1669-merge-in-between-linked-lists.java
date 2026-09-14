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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int i=1;

        ListNode t=list1;

        while(i<a){
            t=t.next;
            i++;
        }
             int j=1;

        ListNode t2=list1;

        while(j<b+2){
            t2=t2.next;
            j++;
        
        
        
        }
      
        ListNode t3=list2;

        while(t3.next!=null){
            t3=t3.next;
        }

        t3.next=t2;

        t.next=null;
        t.next=list2;
        return list1;





        
    }
}