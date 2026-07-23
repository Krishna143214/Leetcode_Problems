class Solution {
    public int[] rotateElements(int[] nums, int k) {

      

      
  


  int c=0;

  for(int i=0;i<nums.length;i++){
    if(nums[i]>=0){
 
        c++;
    }
  }

    if(c<=1){
    return nums;
  }

  k=k%c;

if(k==0){
    return nums;
}

  int res[]=new int[c];
  int f=0;


  for(int i=0;i<nums.length;i++){
    if(nums[i]>=0){
    res[f]=nums[i];
    f++;}
  }
  
int out[]=new int[c];

  for(int j=0;j<res.length;j++){
    out[j] = res[(j + k) % res.length];
  
   
  }
  res=out;


int g=0;

for(int i=0;i<nums.length;i++){
    if(nums[i]>=0){
        nums[i]=res[g];
        g++;
    }
}






        return nums;

        
    }
}