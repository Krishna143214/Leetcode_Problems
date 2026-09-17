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


 import java.util.HashSet;
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        int arr[]=new int[100000];
        int c=0;

        HashSet<Integer> kk=new HashSet<>();

        for(int a:nums){
            kk.add(a);
        }

        ListNode t=head;

        while(t!=null){

            if(kk.contains(t.val)){
                t=t.next;
            }
            else{
            arr[c]=t.val;
            c++;
            t=t.next;}
        }

        if(c==0){
            return null;
        }


        ListNode h=new ListNode(arr[0]);
        ListNode t2=h;

        for(int i=1;i<c;i++){
            ListNode g=new ListNode(arr[i]);
            t2.next=g;
            t2=t2.next;
        }


return h;
        
    }
}