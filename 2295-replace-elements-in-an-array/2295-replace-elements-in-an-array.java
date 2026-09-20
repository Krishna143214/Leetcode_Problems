import java.util.*;
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {

        HashMap<Integer,Integer> kk=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            kk.put(nums[i],i);
        }


        for(int i=0;i<operations.length;i++){
            if(kk.containsKey(operations[i][0])){
                int ind=kk.get(operations[i][0]);

                kk.remove(operations[i][0]);
                kk.put(operations[i][1],ind);
            }
        }


        int res[]=new int[nums.length];


        for(Map.Entry<Integer,Integer> ll:kk.entrySet()){
            res[ll.getValue()]=ll.getKey();
        }

        
return res;
        
    }
}