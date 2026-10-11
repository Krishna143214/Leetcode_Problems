class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
int min=Integer.MAX_VALUE;
        for(int a:nums1){
            min=Math.min(a,min);
        }

        int min2=Integer.MAX_VALUE;
        for(int a:nums2){
            min2=Math.min(a,min2);
        }


        return min2-min;
        
    }
}