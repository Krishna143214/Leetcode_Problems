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
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
int arr[]=new int[5000];
int k=0;
int a2[]=new int[5000];
int l=0;

int m=1;


ListNode temp=head;

while(temp!=null){

    if(m%2!=0){

        arr[k]=temp.val;
        k++;
    }
    else{
        a2[l]=temp.val;
        l++;
    }
    temp=temp.next;
    m++;
}



      ListNode h=new ListNode(arr[0]);
    ListNode t=h;

    for(int i=1;i<k;i++){
        ListNode mm=new ListNode(arr[i]);
        t.next=mm;
        t=t.next;

    }
        for(int i=0;i<l;i++){
        ListNode mm=new ListNode(a2[i]);
        t.next=mm;
        t=t.next;

    }

    return h;
    




   











    
  

    }
}