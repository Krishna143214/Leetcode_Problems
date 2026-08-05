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
    public int pairSum(ListNode head) {

int arr[]=new int[100000];
int j=0;

ListNode t=head;

while(t!=null){
    arr[j]=t.val;
    j++;
    t=t.next;


}

int maxval=Integer.MIN_VALUE;

int l=0;
int h=j-1;

while(l<h){
    int val=arr[l]+arr[h];
    if(val>maxval){
        maxval=val;

    }
    l++;
    h--;
}

return maxval;
        
    }
}