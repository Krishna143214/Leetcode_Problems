class Solution {
    public int countValidSubarrays(int[] nums, int x) {
 int count=0;

        
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){

                sum=sum+nums[j];

                String ans=Long.toString(sum);

                if(ans.charAt(0)==(x+'0')&&ans.charAt(ans.length()-1)==(x+'0')){
                    count++;
                }
            }
        }

        return count;
        
    }
}