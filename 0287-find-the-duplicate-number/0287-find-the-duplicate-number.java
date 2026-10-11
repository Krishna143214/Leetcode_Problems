class Solution {
    public int findDuplicate(int[] a) {
int slow=a[0];
int fast=a[0];

while(true){
    slow=a[slow];
    fast=a[fast];
    fast=a[fast];

    if(slow==fast){
        slow=a[0];

        while(slow!=fast){
            slow=a[slow];
            fast=a[fast];
        }

        return slow;
    }
}
        
    }
}