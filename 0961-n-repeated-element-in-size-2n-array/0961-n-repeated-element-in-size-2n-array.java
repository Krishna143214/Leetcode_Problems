import java.util.HashMap;
class Solution {
    public int repeatedNTimes(int[] nums) {


        HashMap<Integer,Integer> kk=new HashMap<>();

int max=0;
int val=0;
        for(int i=0;i<nums.length;i++){
            if(kk.containsKey(nums[i])){
                kk.put(nums[i],kk.get(nums[i])+1);

                if(kk.get(nums[i])>max){
                    max=kk.get(nums[i]);
                    val=nums[i];
                }
            }

            else{
                kk.put(nums[i],1);
            }
        }
        return val;
        
    }
}