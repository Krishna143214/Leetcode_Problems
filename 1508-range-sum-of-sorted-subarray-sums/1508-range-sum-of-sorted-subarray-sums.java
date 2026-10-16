class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        int res[]=new int[(nums.length*(nums.length+1)/2)];
        int l=0;


        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i;j<nums.length;j++){
                s=(s+nums[j])%1000000007;
                res[l]=s;
                l++;
            }
        }

        Arrays.sort(res);



        int out=0;


        for(int i=left-1;i<right;i++){
            out=(out+res[i])%1000000007;

        }


        return out;
        
    }
}