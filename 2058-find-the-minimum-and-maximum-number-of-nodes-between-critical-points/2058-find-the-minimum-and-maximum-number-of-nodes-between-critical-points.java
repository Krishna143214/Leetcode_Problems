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

import java.util.Arrays;
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int arr[]=new int[100000];
        int c=0;
        ListNode t=head;

        while(t!=null){
            arr[c]=t.val;
            c++;
            t=t.next;
        }

        if(c<=3){
            return new int[]{-1,-1};
        }


    int ar[]=new int[c];
    int l=0;

    for(int i=1;i<c-1;i++){

        if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
            ar[l]=i;
            l++;
        }
         if(arr[i]<arr[i+1]&&arr[i]<arr[i-1]){
            ar[l]=i;
            l++;
        }

    }

    if(l==0||l==1){
        return new int[]{-1,-1};
    }

    Arrays.sort(ar,0,l-1);

    int max=ar[l-1]-ar[0];
int min=Integer.MAX_VALUE;

for(int i=0;i<l-1;i++){

    int diff=ar[i+1]-ar[i];
    min=Math.min(min,diff);

}


return new int[]{min,max};
        
    }
}