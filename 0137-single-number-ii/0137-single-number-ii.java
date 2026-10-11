import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> mm=new HashMap<>();


        for(int i=0;i<nums.length;i++){


            if(mm.containsKey(nums[i])){
                mm.put(nums[i],mm.get(nums[i])+1);
            }

            else{
                mm.put(nums[i],1);
            }
        }


        for(Map.Entry<Integer,Integer> jj:mm.entrySet()){
             if(jj.getValue()==1){
                return jj.getKey();
             }
        }
        return -1;
        
    }
}