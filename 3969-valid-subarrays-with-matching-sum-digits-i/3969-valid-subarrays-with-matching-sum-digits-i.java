class Solution {
    public int countValidSubarrays(int[] nums, int x) {
 int count=0;

        
     for(int i=0;i<nums.length;i++){
        long s=0;
        for(int j=i;j<nums.length;j++){
            s=s+nums[j];
            String a=Long.toString(s);
            if(a.charAt(0)-'0'==x &&a.charAt(a.length()-1)-'0'==x){
                count++;
            }

        }
     }


     return count;
        
    }
}