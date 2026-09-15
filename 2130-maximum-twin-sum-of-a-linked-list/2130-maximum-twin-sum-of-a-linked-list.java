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

ListNode t=head;
int l=0;

while(t!=null){
    arr[l]=t.val;
    l++;
    t=t.next;
}


int i=0;
int j=l-1;
int max=Integer.MIN_VALUE;


while(i<j){
    max=Math.max(max,arr[i]+arr[j]);
    i++;
    j--;
}

return max;
        
    }
}