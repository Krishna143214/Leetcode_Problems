class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }

        Arrays.sort(nums);


        int i=0;
        int j=nums.length-1;
        int k=1;

        long res=0;

        while(i<=j){
            if(k%2!=0){

                res=res+(nums[j]*nums[j]);
                j--;

            }
            if(k%2==0){

                res=res-(nums[i]*nums[i]);
                i++;

            }

            k++;
        }



        return res;
        
    }
}