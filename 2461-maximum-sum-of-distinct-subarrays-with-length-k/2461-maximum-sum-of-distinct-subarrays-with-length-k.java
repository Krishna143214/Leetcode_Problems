import java.util.HashMap;
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> kk=new HashMap<>();

        int i=0;
        int j=0;
        long c=0;
        long max=0;

        while(j<nums.length){
            if(kk.containsKey(nums[j])){
                kk.put(nums[j],kk.get(nums[j])+1);
            }
            else{
                kk.put(nums[j],1);
            }
            c +=nums[j];

            if((j-i)+1<k){
                j++;
            }

            else if((j-i)+1==k){
                if(kk.size()==k){
                    if(c>max){
                        max=c;
                    }
                }

                kk.put(nums[i],kk.get(nums[i])-1);
                if(kk.get(nums[i])==0){
                    kk.remove(nums[i]);
                }

                c -=nums[i];

                i++;
                j++;
            }
        }

        return max;
        
    }
}