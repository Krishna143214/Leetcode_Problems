class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
int c=0;

double val=(double)a/b;
for(int i=0;i<nums.length;i++){
    double o=0;
    double e=0;
    for(int j=i;j<nums.length;j++){

        if(nums[j]%2!=0){
            o++;
        }
        else{
            e++;
        }


if(o>0){
double v=(double)e/o;
        if(v<=val){
            c++;
        }}

        

    }
}


return c;
        
    }
}