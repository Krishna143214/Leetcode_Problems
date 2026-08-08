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

        if(head.next==null|| head.next.next==null){
            return ;
        }
  int arr[]=new int[50000];
  int k=0;

  ListNode t=head;

  while(t!=null){
    arr[k]=t.val;
    t=t.next;
    k++;
  }

  int res[]=new int[k];
  int j=0;

  
    int l=0;
    int h=k-1;

    while(l<h){
        res[j]=arr[l];
        j++;
        res[j]=arr[h];
        j++;
        l++;
        h--;

    }

    if(k%2!=0){
        res[j]=arr[l];
        j++;
    }


ListNode t2=head;
int i=0;

while(t2!=null){
    t2.val=res[i];
    t2=t2.next;
    i++;
}

        
    }
}