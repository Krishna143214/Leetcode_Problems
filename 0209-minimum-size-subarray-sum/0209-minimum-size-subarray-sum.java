class Solution {
    public int minSubArrayLen(int k, int[] nums) {
int i=0;
int j=0;

int c=0;
int min=Integer.MAX_VALUE;

while(j<nums.length){
    c +=nums[j];

    if(c<k){
        j++;
    }
 

    else if(c>=k){
        while(c>=k){
            int l=(j-i)+1;
            if(l<min){
                min=l;  
            }
            c -=nums[i];
            i++;
        }

       
        j++;
    }

}


if(min==Integer.MAX_VALUE){
    return 0;
}
return min;



}
}