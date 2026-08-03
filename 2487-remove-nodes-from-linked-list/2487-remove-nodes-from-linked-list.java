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

 import java.util.Stack;
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head.next==null){
            return head;
        }

        Stack<Integer> kk=new Stack<>();

        ListNode t=head;

        while(t!=null){
            if(kk.isEmpty()){
                kk.push(t.val);

            }
            else if(kk.peek()<t.val){
                while(!kk.isEmpty()&&kk.peek()<t.val){
                    kk.pop();
                }
                kk.push(t.val);
            }

            else{
                kk.push(t.val);
            }
            t=t.next;

        }


        if(kk.isEmpty()){
            return null;
        }
        else if(kk.size()==1){
            return new ListNode(kk.pop());
        }

        Stack<Integer> jj=new Stack<>();
        while(!kk.isEmpty()){
            jj.push(kk.pop());
        }

        ListNode h2=new ListNode(jj.pop());
        ListNode t2=h2;

        while(!jj.isEmpty()){
            ListNode s=new ListNode(jj.pop());
            t2.next=s;
            t2=t2.next;
        }


        return h2;
        
    }
}