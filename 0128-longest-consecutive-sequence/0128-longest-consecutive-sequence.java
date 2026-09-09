
import java.util.Arrays;
import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> kk=new HashSet<>();


        for(int v:arr){
            kk.add(v);
        }


        int nums[]=new int[kk.size()];
        int b=0;

        for(int x:kk){
            nums[b]=x;
            b++;
        }
Arrays.sort(nums);

if(nums.length==0){
    return 0;
}


int res=1;
int c=1;


for(int i=0;i<nums.length-1;i++){

    if(nums[i]+1==nums[i+1]){
        c++;
    }
    else{
        c=1;
    }


    res=Math.max(c,res);

}
      
return res;
    
        
    }
}