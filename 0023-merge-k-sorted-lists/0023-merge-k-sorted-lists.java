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

 import java.util.ArrayList;
 import java.util.Collections;
class Solution {
    public ListNode mergeKLists(ListNode[] l) {

ArrayList<Integer> kk=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            ListNode t=l[i];

            while(t!=null){
                kk.add(t.val);
                t=t.next;
            }


        }


        Collections.sort(kk);


        if(kk.size()==0){
            return null;
        }
        else if(kk.size()==1){
            return new ListNode(kk.get(0));
        }
        ListNode h=null;
        ListNode t2=null;


        for(int j:kk){
            if(h==null){
                h=new ListNode(j);
                t2=h;

            }
            else{
                ListNode mm=new ListNode(j);
                t2.next=mm;
                t2=t2.next;
            }

        }

        return h;
        
    }
}