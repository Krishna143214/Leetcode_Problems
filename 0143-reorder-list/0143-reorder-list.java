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
if(head==null || head.next==null){

    return ;
}



 int arr[]=new int[50000];

 ListNode t=head;

 int k=0;

 while(t!=null){
    arr[k]=t.val;
    k++;
    t=t.next;

 }



 int res[]=new int[k];
 int n=0;

 int i=0;
 int j=k-1;

 while(i<j){
    res[n]=arr[i];
    n++;
    i++;
    res[n]=arr[j];
    n++;
    j--;

 }

 if(k%2!=0){
    res[n]=arr[i];
    n++;
 }



ListNode t2=head;
int m=0;

while(t2!=null){
    t2.val=res[m];
    m++;
    t2=t2.next;
}

 
 
return;







        
    }
}