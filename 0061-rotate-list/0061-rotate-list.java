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
    public ListNode rotateRight(ListNode head, int k) {


        if(head==null ||head.next==null){
            return head;
        }

int c=0;

ListNode t=head;
int arr[]=new int[500];

while(t!=null){
    arr[c]=t.val;
    c++;
    t=t.next;
}


k=k%c;

if(k==0){
    return head;
}

int res[]=new int[c];

for(int i=0;i<c;i++){

    res[(i+k)%c]=arr[i];

}



ListNode h=new ListNode(res[0]);
ListNode t2=h;

for(int i=1;i<res.length;i++){
    ListNode ff=new ListNode(res[i]);
    t2.next=ff;
    t2=t2.next;
}



return h;











}}