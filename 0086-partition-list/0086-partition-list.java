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
    public ListNode partition(ListNode head, int x) {

        if(head==null||head.next==null){
            return head;

        }

        int arr1[]=new int[200];
        int k=0;
        int arr2[]=new int[200];
        int l=0;
        ListNode t=head;

        while(t!=null){
            if(t.val<x){
            arr1[k]=t.val;
            k++;}

            else if(t.val>=x){
                arr2[l]=t.val;
                l++;
            }

            t=t.next;

          
        }

if(l==0||k==0){
    return head;
}



    ListNode h2=new ListNode(arr1[0]);
    ListNode t2=h2;

    for(int i=1;i<k;i++){
        ListNode yy=new ListNode(arr1[i]);
        t2.next=yy;
        t2=t2.next;
    }

    for(int j=0;j<l;j++){
        ListNode oo=new ListNode(arr2[j]);
        t2.next=oo;
        t2=t2.next;
    }



return h2;

  

        

     
        
    }
}