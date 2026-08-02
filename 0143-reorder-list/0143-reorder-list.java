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
    public void reorderList(ListNode head) {
        if(head.next==null||head.next.next==null){
            return ;
        }

        int arr[]=new int[50000];
        int i=0;
        ListNode t=head;
        while(t!=null){
            arr[i]=t.val;
            t=t.next;
            i++;
        }

        int res[]=new int[i];
        int f=0;

        int l=0;
        int h=i-1;

        while(l<=h){
            if(l==h){
                res[f]=arr[l];
                l++;
                h--;
                f++;
            }
            else{
                res[f]=arr[l];
                f++;
                res[f]=arr[h];
                f++;
                l++;
                h--;
            }

        }


        ListNode h2=new ListNode(res[0]);

        ListNode t2=h2;

        for(int ii=1;ii<res.length;ii++){
            ListNode o=new ListNode(res[ii]);
            t2.next=o;
            t2=t2.next;
        }


       ListNode tem=head;
       ListNode tem2=h2;

       while(tem!=null){
        tem.val=tem2.val;
        tem=tem.next;
        tem2=tem2.next;
       }
        
    }
}