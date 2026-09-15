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
    public ListNode mergeNodes(ListNode head) {

        ListNode t=head;
        int arr[]=new int[200000];
        int l=0;
        int c=0;

        while(t!=null){
            
         
            
            arr[l]=t.val;
            l++;
            t=t.next;

        }




        int res[]=new int[l];
        int k=0;
int m=0;
        for(int i=1;i<l;i++){
            if(arr[i]==0){
                res[k]=m;
                k++;
                m=0;
            }
            else{
                m=m+arr[i];
            }
        }


        ListNode h=new ListNode(res[0]);
        ListNode t2=h;

        for(int i=1;i<k;i++){
            ListNode v=new ListNode(res[i]);
            t2.next=v;
            t2=t2.next;

        }


        return h;


        
    }
}