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

 import java.util.Arrays;
class Solution {
    public ListNode sortList(ListNode head) {
             if(head==null||head.next==null){
            return head;
        }
        int arr[]=new int[50000];
        int k=0;
        ListNode t=head;

        while(t!=null){
            arr[k]=t.val;
            k++;
            t=t.next;
        }

        Arrays.sort(arr,0,k);


        ListNode h=new ListNode(arr[0]);
        ListNode t2=h;

        for(int i=1;i<k;i++){
            ListNode ll=new ListNode(arr[i]);
            t2.next=ll;
            t2=t2.next;
        }


        return h;
        
    }
}