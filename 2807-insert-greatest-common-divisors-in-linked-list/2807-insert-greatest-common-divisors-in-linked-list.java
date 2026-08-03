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
    static int gcd(int a,int b){
        int gcd=1;

        int cheak=Math.min(a,b);

        for(int i=1;i<=cheak;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }

        return gcd;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if(head.next==null){
            return head;
        }
        
        ListNode t=head;

        int arr[]=new int[5000];
        int i=0;

        while(t!=null){
            arr[i]=t.val;
            i++;
            t=t.next;


        }

        int res[]=new int[10000];
        int f=0;
        res[0]=arr[0];
        f++;

        for(int j=0;j<i-1;j++){
            int v1=arr[j];

            int v2=arr[j+1];
            int v3=gcd(v1,v2);
           
            res[f]=v3;
            f++;
            res[f]=v2;
            f++;        }


            ListNode h2=new ListNode(res[0]);
            ListNode t2=h2;

            for(int k=1;k<f;k++){
                ListNode kk=new ListNode(res[k]);
                t2.next=kk;
                t2=t2.next;
            }

return h2;
    }
}