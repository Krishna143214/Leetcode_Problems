import java.util.HashMap;
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> kk=new HashMap<>();


        for(int i=0;i<nums.length;i++){
            if(kk.containsKey(nums[i])){
                kk.put(nums[i],kk.get(nums[i])+1);
            }
            else{
                kk.put(nums[i],1);
            }
        }


        int res[]=new int[2];
        int k=0;

        for(Map.Entry<Integer,Integer> jj:kk.entrySet()){
            if(jj.getValue()==1){
                res[k]=jj.getKey();
                k++;
            }
        }


        return res;
        
    }
}