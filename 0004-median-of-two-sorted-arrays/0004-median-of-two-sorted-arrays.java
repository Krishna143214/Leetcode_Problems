import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int res[]=new int[nums1.length+nums2.length];
int k=0;


for(int i:nums1){
    res[k]=i;
    k++;
}

for(int i:nums2){
    res[k]=i;
    k++;
}


Arrays.sort(res);


if(res.length%2!=0){
    return (double)res[res.length/2];
}

return ((double)(res[res.length/2]+res[(res.length/2)-1])/2);
        
    }
}