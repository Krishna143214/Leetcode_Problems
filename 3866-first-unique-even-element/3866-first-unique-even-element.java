import java.util.HashMap;
class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> kk=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(kk.containsKey(nums[i])){
                kk.put(nums[i],kk.get(nums[i])+1);
            }
            else{
                kk.put(nums[i],1);
            }
        }


        for(int i=0;i<nums.length;i++){
            if(kk.get(nums[i])==1){
                if(nums[i]%2==0){
                    return nums[i];
                }
            }
        }

        return -1;
        
    }
}