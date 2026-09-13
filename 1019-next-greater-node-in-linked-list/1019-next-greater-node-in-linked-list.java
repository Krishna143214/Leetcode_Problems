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
    public int[] nextLargerNodes(ListNode head) {


if(head.next==null){
    return new int[]{0};
}

ListNode t=head;
int arr[]=new int[10000];
int k=0;

while(t!=null){
    arr[k]=t.val;
    k++;
    t=t.next;
}


int res[]=new int[k];

Stack<Integer> kk=new Stack<>();
for(int i=k-1;i>=0;i--){
    if(kk.isEmpty()){
        res[i]=0;
        kk.push(arr[i]);
    }

    else if(kk.peek()>arr[i]){
        res[i]=kk.peek();
        kk.push(arr[i]);
    }

    else{
        while(!kk.isEmpty() && kk.peek()<=arr[i]){
            kk.pop();
        }

        if(kk.isEmpty()){
            res[i]=0;
            kk.push(arr[i]);
        }
        else{
            res[i]=kk.peek();
            kk.push(arr[i]);
        }
    }

}

return res;


    }
}