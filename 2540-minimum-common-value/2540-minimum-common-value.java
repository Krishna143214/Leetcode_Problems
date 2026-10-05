
import java.util.HashSet;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> ll=new HashSet<>();


        for(int a:nums2){
            ll.add(a);
        }

        for(int a:nums1){
            if(ll.contains(a)){
                return a;
            }
        }

        return -1;


        
    }
}