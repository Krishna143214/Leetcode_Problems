
import java.util.Arrays;
import java.util.ArrayList;
class Solution{
    public List<Integer> findMissingElements(int[] nums) {
Arrays.sort(nums);
ArrayList<Integer> jj=new ArrayList<>();

int min=nums[0];

int j=0;

while(j<nums.length){
    if(nums[j]==min){
        j++;
        min=min+1;
    }
    else{
        jj.add(min);
        min=min+1;
    }

}

return jj;
        
    }
}