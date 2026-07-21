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
 import java.util.HashMap;
 import java.util.Arrays;
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }
        HashMap<Integer,Integer> ll=new HashMap<>();

        ListNode t=head;

        while(t!=null){
            ll.put(t.val,1);
            t=t.next;
        }

        int arr[]=new int[ll.size()];
        int f=0;

        for(Map.Entry<Integer,Integer> kk:ll.entrySet()){
            arr[f]=kk.getKey();
            f++;
        }

        Arrays.sort(arr);


        ListNode h2=new ListNode(arr[0]);
        ListNode t2=h2;

        for(int i=1;i<f;i++){
            ListNode g=new ListNode(arr[i]);
            t2.next=g;
            t2=t2.next;
        }

        return h2;
        
    }
}