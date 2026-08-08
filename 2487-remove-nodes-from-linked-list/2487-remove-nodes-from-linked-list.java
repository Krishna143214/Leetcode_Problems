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
    Stack<Integer> kj=new Stack<>();

  while(!kk.isEmpty()){
    kj.push(kk.pop());
  }


 ListNode h2=new ListNode(kj.pop());
 ListNode t2=h2;

 while(!kj.isEmpty()){
    ListNode f=new ListNode(kj.pop());
    t2.next=f;
    t2=t2.next;
 }


 return h2;


        
    }
}