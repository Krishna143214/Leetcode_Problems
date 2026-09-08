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

int arr[]=new int[200];
int i=0;
int arr2[]=new int[200];
int j=0;

ListNode t=head;


while(t!=null){
    if(t.val>=x){
        arr[i]=t.val;
        i++;
    }
    else{
        arr2[j]=t.val;
        j++;
    }

    t=t.next;
}

if(j>0){

    ListNode h=new ListNode(arr2[0]);
    ListNode t2=h;

    for(int ii=1;ii<j;ii++){
        ListNode s=new ListNode(arr2[ii]);
        t2.next=s;
        t2=t2.next;
    }
     for(int ii=0;ii<i;ii++){
        ListNode s=new ListNode(arr[ii]);
        t2.next=s;
        t2=t2.next;
    }


    return h;

}
  ListNode h=new ListNode(arr[0]);
    ListNode t2=h;
        for(int ii=1;ii<i;ii++){
        ListNode s=new ListNode(arr[ii]);
        t2.next=s;
        t2=t2.next;
    }
  

     return h;   

     
        
    }
}