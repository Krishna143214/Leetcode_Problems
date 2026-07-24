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
    public ListNode oddEvenList(ListNode head) {
    
        if(head==null||head.next==null){
            return head;
        }

        int arr[]=new int[5000];
        int k=0;
        int arr2[]=new int[5000];
        int l=0;

        ListNode t=head;
        int c=1;

        while(t!=null){
            if(c%2!=0){
                arr[k]=t.val;
                k++;
            }
            else{
                arr2[l]=t.val;
                l++;
            }
            c++;
            t=t.next;

        }

        ListNode h2=new ListNode(arr[0]);
        ListNode t3=h2;

        for(int i=1;i<k;i++){
            ListNode f=new ListNode(arr[i]);
            t3.next=f;
            t3=t3.next;
        }

        for(int j=0;j<l;j++){
            ListNode g=new ListNode(arr2[j]);
            t3.next=g;
            t3=t3.next;
        }

        return h2;

    }
}