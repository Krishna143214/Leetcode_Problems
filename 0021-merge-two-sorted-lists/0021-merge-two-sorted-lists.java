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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

if(list1==null &&list2!=null){
    return list2;
}
else if(list1!=null &&list2==null){
    return list1;
}
else if(list1==null&&list2==null){
    return null;
}

int arr[]=new int[100];
int l=0;

ListNode t=list1;

while(t!=null){
    arr[l]=t.val;
    l++;
    t=t.next;
}


ListNode t2=list2;

while(t2!=null){
    arr[l]=t2.val;
    l++;
    t2=t2.next;
}

Arrays.sort(arr,0,l);

ListNode h2=new ListNode(arr[0]);
ListNode j=h2;

for(int i=1;i<l;i++){
    ListNode kk=new ListNode(arr[i]);
    j.next=kk;
    j=j.next;
}


return h2;

        
    }
}