import java.util.HashSet;
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> kk=new HashSet<>();


        for(int k:nums){
            kk.add(k);
        }

        int i=1;

        while(true){
            if(!kk.contains(i)){
                return i;

            }
            i++;
        }
        
    }
}