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

int arr[]=new int[10000];
int k=0;
ListNode t=head;

while(t!=null){
    arr[k]=t.val;
    t=t.next;
    k++;
}

Stack<Integer> kk=new Stack<>();

int res[]=new int[k];

for(int i=k-1;i>=0;i--){
    if(kk.isEmpty()){
        kk.push(arr[i]);
        res[i]=0;
    }

    else if(kk.peek()<=arr[i]){
        while(!kk.isEmpty()&&kk.peek()<=arr[i]){
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

    else{
        res[i]=kk.peek();
            kk.push(arr[i]); 
    }
}

return res;


    }
}