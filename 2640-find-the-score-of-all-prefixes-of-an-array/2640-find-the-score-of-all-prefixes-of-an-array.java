class Solution {
    public long[] findPrefixScore(int[] nums) {

        long res[]=new long[nums.length];
     long max=Integer.MIN_VALUE;

   


        for(int i=0;i<nums.length;i++){
           

         max=Math.max(max,nums[i]);

         res[i]=nums[i]+max;








        }



        long out[]=new long[nums.length];

        out[0]=res[0];


        for(int i=1;i<nums.length;i++){
            out[i]=out[i-1]+res[i];
        }





        return  out;
        
    }
}