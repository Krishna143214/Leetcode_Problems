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

    int res=0;

int max=Math.max(a,b);

for(int i=1;i<=max;i++){

    if(a%i==0 && b%i==0){
        res=i;
    }

}


return res;



}
    public ListNode insertGreatestCommonDivisors(ListNode head) {



        if(head==null||head.next==null){
            return head;
        }

int arr[]=new int[5000];
int c=0;

ListNode t=head;

while(t!=null){
    arr[c]=t.val;
    c++;
    t=t.next;
}



int arr2[]=new int[10000];
int m=0;
for(int i=0;i<c-1;i++){
    arr2[m]=arr[i];
    m++;
    int cal=gcd(arr[i],arr[i+1]);
    arr2[m]=cal;
    m++;
}
arr2[m]=arr[c-1];
m++;



ListNode h=new ListNode(arr2[0]);
ListNode t2=h;

for(int i=1;i<m;i++){
    ListNode bb=new ListNode(arr2[i]);
    t2.next=bb;
    t2=t2.next;
}


return h;

    
    }
}