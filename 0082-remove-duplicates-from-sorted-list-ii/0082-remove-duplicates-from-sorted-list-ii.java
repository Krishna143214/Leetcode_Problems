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

        if(head==null|| head.next==null){
            return head;
        }
HashMap<Integer,Integer> kk=new HashMap<>();

        ListNode t=head;

        while(t!=null){
           if(kk.containsKey(t.val)){
            kk.put(t.val,kk.get(t.val)+1);

           }

           else{
           kk.put(t.val,1);            }
           t=t.next;
        }


        int arr[]=new int[kk.size()];
        int j=0;


        for(Map.Entry<Integer,Integer> ll:kk.entrySet()){
            if(ll.getValue()==1){
            arr[j]=ll.getKey();
            j++;}
        }

        if(j==0){
            return null;
        }

Arrays.sort(arr,0,j);


ListNode h=new ListNode(arr[0]);
ListNode t2=h;

for(int i=1;i<j;i++){
    ListNode mm=new ListNode(arr[i]);
    t2.next=mm;
    t2=t2.next;
}

return h;
        



        
    }
}