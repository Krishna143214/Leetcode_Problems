import java.util.HashSet;
class Solution {
    public int smallestAbsent(int[] nums) {

        HashSet<Integer> kk=new HashSet<>();
        int count=0;

        for(int i=0;i<nums.length;i++){
            kk.add(nums[i]);
            count=count+nums[i];

        }
        count=count/nums.length;
        int cheak=count+1;
        if(cheak<=0){
            cheak=1;
        }
        while(true){
            if(kk.contains(cheak)){
                cheak=cheak+1;
            }
            else{
            return cheak;}
        }
   
    
        
    }
}