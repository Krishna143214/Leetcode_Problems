import java.util.HashSet;
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> kk=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            kk.add(nums[i]);
        }
        int c=0;

        for(int i=0;i<nums.length;i++){
            HashSet<Integer> ll=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                ll.add(nums[j]);
                if(ll.size()==kk.size()){
                    c++;
                }

            }
        }


        return c;
        
    }
}