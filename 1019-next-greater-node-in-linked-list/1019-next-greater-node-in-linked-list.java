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

        Stack<Integer> kk=new Stack<>();

        int arr[] =new int[10000];
        int y=0;
        ListNode temp=head;

        while(temp!=null){
            arr[y]=temp.val;
            y++;
            temp=temp.next;
        } 
int res[]=new int[y];

                                                                                                            for(int i=y-1;i>=0;i--){
                                                                                                                if(kk.isEmpty()){
                                                                                                                    kk.push(arr[i]);
                                                                                                                    res[i]=0;
                                                                                                                }

                                                                                                                else if(kk.peek()<=arr[i]){
                                                                                                                    while(!kk.isEmpty() && kk.peek()<=arr[i]){
                                                                                                                        kk.pop();
                                                                                                                    }
                                                                                                                    if(kk.isEmpty()){
                                                                                                                        kk.push(arr[i]);
                                                                                                                        res[i]=0;
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