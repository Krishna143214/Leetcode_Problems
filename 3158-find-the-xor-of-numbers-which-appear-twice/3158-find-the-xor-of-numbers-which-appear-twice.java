import java.util.HashSet;
class Solution {
    public int duplicateNumbersXOR(int[] nums) {

        HashSet<Integer> kk=new HashSet<>();
        int r=0;


        for(int a:nums){
            if(kk.contains(a)){
                r=r^a;
            }
            else{
                kk.add(a);
            }
        }

        return r;
        
    }
}