import java.util.HashMap;

class Solution {
    public int firstUniqueFreq(int[] nums) {
     HashMap<Integer,Integer> kk=new HashMap<>();

        
        for(int i=0;i<nums.length;i++){

            if(kk.containsKey(nums[i])){
                kk.put(nums[i],kk.get(nums[i])+1);
            }
            else{
                kk.put(nums[i],1);
            }



        }

        HashMap<Integer,Integer> pp=new HashMap<>();


        for(Map.Entry<Integer,Integer> ll:kk.entrySet()){

            if(pp.containsKey(ll.getValue())){
                pp.put(ll.getValue(),pp.get(ll.getValue())+1);
            }
            else{
                pp.put(ll.getValue(),1);
            }


        }



     


        for(int i=0;i<nums.length;i++){
            if(pp.get(kk.get(nums[i]))==1){
                return nums[i];
            }
        }

        return -1;
    }
}